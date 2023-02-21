package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTransaction {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	public JdbcTransaction() {
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "scott";
		String pwd = "tiger";
		
		try {
			Class.forName(jdbc_driver);
			this.conn = DriverManager.getConnection(jdbc_url, user, pwd);
			conn.setAutoCommit(false);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int dynamicInsert(String username, String email) {
		int rowCount = 0;
		this.sql = "insert into jdbc_test values(?, ?)";
		
		try {
			this.pstmt = conn.prepareStatement(this.sql);
			pstmt.setString(1, username);
			pstmt.setString(2, email);
			
			rowCount = pstmt.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(!this.pstmt.isClosed()) {
					this.pstmt.close();
				}
			}
			catch (SQLException e) {
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
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		JdbcTransaction jt = new JdbcTransaction();
		int rowCount = 0;
		
		rowCount = jt.dynamicInsert("�迬��", "kim@naver.com");
		System.out.println(rowCount + "���� ���� �ԷµǾ����ϴ�.");
		
		jt.closeConnection();
	}
}
