package jdbc.demo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;


public class DemoSelect {

	public static void main(String[] args) {
		
		//데이터베이스 연결정보 - 처음 한 번만 써주면 된다
		// localhost -> 나의 컴퓨터
		// jdbc:oracle:thin:호스트이름:포트번호:DB이름(SID)
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR"; // id
		String upw = "HR"; //pw
		
		String sql = "SELECT *\r\n"
				   + "FROM employees\r\n"
				   + "WHERE salary > 5000";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//모든 데이터베이스 연결은 try~catch작성이 되야 한다
		try {
			//1. 드라이버 클래스 준비
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 커넥션 객체 생성 // connection 객체를 반환 받음
			conn = DriverManager.getConnection(url, uid, upw); 
		
			//3. 커넥션 객체에서 state객체 생성 // SQL문이 들어간다
			pstmt =  conn.prepareStatement(sql);
			
			//4. SQL문 실행
			// SELECT는 executeQuery()
			// UPDATE, INSERT, DELETE 문은 executeUpdate()
			// resultset = SQL문의 실행 결과를 담고 있는 객체
			rs =  pstmt.executeQuery();
			
			//5. rs.next() 다음 행이 있으면, 다음 행으로 접근한다
			while(rs.next()) { //한 행에서 처리할 작업을 while문 안에 넣으면 된다
				
				// ( ) 안에 Column 명이 들어간다
				String first_name = rs.getString("first_name"); //getString, getInt, getDouble, getDate, getTimestamp
				int salary = rs.getInt("salary"); // 정수
				Double cpt = rs.getDouble("commission_pct");
				Date date = rs.getDate("hire_date"); // java.sql 패키지
				Timestamp date2 = rs.getTimestamp("hire_date"); // 시,분,초 도 반환한다				
				System.out.println(first_name);
				System.out.println(salary);
				System.out.println(cpt);
				System.out.println(date);
				System.out.println(date2);
				System.out.println("------------------");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try { // close() 도 try~catch문에서 작성되어야 한다
				conn.close();
				pstmt.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
}
