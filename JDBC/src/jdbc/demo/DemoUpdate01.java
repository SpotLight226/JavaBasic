package jdbc.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DemoUpdate01 {

	public static void main(String[] args) throws IOException {
		
		//부서아이디, 부서이름을 입력받아서, 해당부서의 이름을 변경하는 update구문
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("부서이름>");
		String name = br.readLine();
		
		System.out.print("부서아이디>");
		int d_id = Integer.parseInt(br.readLine()); 

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE depts\r\n"
				   + "SET department_name = ?\r\n"
				   + "WHERE department_id = ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			
			pstmt.setInt(2, d_id);
			
			int result = pstmt.executeUpdate();
			
			System.out.println("성공실패?:" + result);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
	}
}
