package ojdbc;

import java.sql.*;
import java.util.ArrayList;

public class SelectTestv2 {
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	public SelectTestv2() {
		
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "scott";
		String pwd = "tiger";
		
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, user, pwd);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	//문제] Arraylist를 이용하여 모든 행 정보 반환 후 그 결과를 출력하는 코드를 작성하세요.
	public ArrayList<JdbcTest> staticSelect() {
		
		sql = "select * from jdbc_test";
		ArrayList<JdbcTest> rows = new ArrayList<JdbcTest>();
		
		try {
			this.stmt = conn.createStatement();
			
			this.rs = this.stmt.executeQuery(sql);
			
			//사용자 이름이 고유하다고 가정 !
			while(this.rs.next()) {
				System.out.println(this.rs.getString("username") + "\t" + this.rs.getString("email"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(!this.stmt.isClosed()) {
					this.stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return rows;
	}
	
	public JdbcTest dynamicSelect(String username) {
		sql = "select * from jdbc_test where username = ?";
		JdbcTest jdbcTest = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			
			rs = pstmt.executeQuery();
			
			//사용자 이름이 고유하다고 가정 !
			if(rs.next()) {
				jdbcTest = new JdbcTest(this.rs.getString("username"), this.rs.getString("email"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(!pstmt.isClosed()) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return jdbcTest;
	}
	
	public void closeConnection() {
		
		try {
			if(!this.conn.isClosed()) {
				this.conn.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		SelectTestv2 st = new SelectTestv2();
		ArrayList<JdbcTest> rows;
		
		/*
		JdbcTest jdbcTest = st.dynamicSelect("조아인");
		System.out.println(jdbcTest.getUsername() + "\t" + jdbcTest.getemail());
		*/
		
		rows = st.staticSelect();
		for(JdbcTest jdbcTest : rows) {
			System.out.println(jdbcTest.getUsername() + "\t" + jdbcTest.getemail());
		}
		
		st.closeConnection();
	}
}
