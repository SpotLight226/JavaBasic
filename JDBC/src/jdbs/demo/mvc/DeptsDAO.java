package jdbs.demo.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptsDAO {

	//멤버변수
	private String url = DBProperties.URL;
	private String uid = DBProperties.UID;
	private String upw = DBProperties.UPW;

	//생성자
	public DeptsDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("CLASS FOR NAME ERR");
		}
	}

	//메서드
	//데이터베이스 결과가 1행 -> VO를 반환
	//데이터베이스 결과가 여러 행 -> List<VO>를 반환
	public List<DeptsVO> getDepts(String name){ 


		//값을 반환할 리스트를 생성
		List<DeptsVO> list = new ArrayList<>();

		String sql = "SELECT * FROM depts WHERE department_name = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// 향상된 try~catch문에 넣으면 finally문 생략 가능
		try {

			conn = DriverManager.getConnection(url, uid, upw);

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name); // sql의 ?에 들어갈 값

			rs = pstmt.executeQuery();

			while(rs.next()) {

				int department_id = rs.getInt("department_id");
				String deparment_name = rs.getString("department_name");
				int manager_id = rs.getInt("manager_id");
				int location_id = rs.getInt("location_id");

				//1행에대한 값을 저장
				DeptsVO vo = new DeptsVO(department_id, deparment_name, manager_id, location_id);

				//리스트에 vo를 추가
				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Connection, PrepareStatement, ResultSet을 close 해준다
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


		return list;
	}

	//인서트메서드
	public int /*void*/ insertDepts(DeptsVO vo) {

		int result = 0; //0이 반환되면 실패, 1이 반환되면 성공

		//INSERT, UPDATE, DELETE는 ResultSet객체가 필요없음
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "INSERT INTO DEPTS(department_id, department_name, manager_id, location_id)\r\n"
				+ "VALUES(depts_seq.NEXTVAL, ?, ?, ? )"; // 변경될 수 or 변경할 값을 ? 로 작성한다 // seq는 PK

		try {

			conn = DriverManager.getConnection(url, uid, upw); //순서 주의 (url, id, pw)
			
			pstmt = conn.prepareStatement(sql);

			//4. set을 사용해 SQL문을 채운다
			pstmt.setString(1, vo.getDepartment_name()); // 첫번째 물음표, name
			// 변경 될 수 있는 값이라면 자동 형변환되어 들어간다
			pstmt.setInt(2, vo.getManager_id()); // 자동 형변환
			// 형변환을 해주어야하는 값이라면 형변환을 해주어야 한다
			pstmt.setInt(3, vo.getLocation_id()); // 형변환

			//5. sql실행
			result = pstmt.executeUpdate(); // 성공 시 1, 실패 시 0 을 반환한다 -> 성공실패를 확인하는 중요한 요소

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {

			}
		}

		return result;
	}
}
