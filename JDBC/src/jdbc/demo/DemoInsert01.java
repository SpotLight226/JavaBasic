package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DemoInsert01 {
	
	public static void main(String[] args) {
		
		//입력된 값은 콘솔로 입력
		Scanner in = new Scanner(System.in);
		
		System.out.println("부서이름>");
		String name = in.nextLine();
		
		System.out.println("매니저아이디>");
		String manager_id = in.nextLine();
		
		System.out.println("로케이션아이디>");
		String location_id = in.nextLine();
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR"; // id
		String upw = "HR"; //pw
		
		//INSERT, UPDATE, DELETE는 ResultSet객체가 필요없음
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO DEPTS(department_id, department_name, manager_id, location_id)\r\n"
				   + "VALUES(depts_seq.NEXTVAL, ?, ?, ? )"; // 변경될 수 or 변경할 값을 ? 로 작성한다 // seq는 PK
		
		try {
			
			// 1. 드라이버 클래스 준비
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 커넥션 객체 생성
			conn = DriverManager.getConnection(url, uid, upw); //순서 주의 (url, id, pw)
			
			//3. 커넥션 객체에서 state객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//4. set을 사용해 SQL문을 채운다
			pstmt.setString(1, name); // 첫번째 물음표, name
			// 변경 될 수 있는 값이라면 자동 형변환되어 들어간다
			pstmt.setString(2, manager_id); // 자동 형변환
			// 형변환을 해주어야하는 값이라면 형변환을 해주어야 한다
			pstmt.setInt(3, Integer.parseInt(location_id)); // 형변환
			
			//5. sql실행
			int result = pstmt.executeUpdate(); // 성공 시 1, 실패 시 0 을 반환한다 -> 성공실패를 확인하는 중요한 요소
			
			System.out.println("성공실패?:" + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				
			}
		}
		
		
	}
}
