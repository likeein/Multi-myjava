package ojdbc;

import java.sql.*;

public class InsertTest {

	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt;
	String sql = "";
	
	public InsertTest() {
		
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

	public int staticInsert(String username, String email) {
		
		int rowCount = 0;
		
		try {
			this.stmt = conn.createStatement();
			this.sql = "insert into jdbc_test values('" + username + "', '" + email + "')";
			rowCount = stmt.executeUpdate(sql);
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
		
		return rowCount;
	}
	
	public int dynamicInsert(String username, String email) {
		
		int rowCount = 0;
		this.sql = "insert into jdbc_test values(?,?)";
		
		try {
			this.pstmt = conn.prepareStatement(this.sql);
			pstmt.setString(1, username);
			pstmt.setString(2, email);
			
			rowCount = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(!this.pstmt.isClosed()) {
					this.pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return rowCount;
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
		
		InsertTest it = new InsertTest();
		int rowCount = 0;
		
		//rowCount = it.staticInsert("ȫ�浿", "hong@naver.cpm");
		rowCount = it.dynamicInsert("����ȣ", "park@nate.cpm");
		System.out.println(rowCount + "���� ���� �ԷµǾ����ϴ�.");
		
		it.closeConnection();
		
	}

}
