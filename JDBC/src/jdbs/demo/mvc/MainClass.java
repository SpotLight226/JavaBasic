package jdbs.demo.mvc;

import java.util.List;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//필요한 객체를 상단부에 선언
		DeptsDAO deptsDAO = new DeptsDAO(); 
		
		
		while(true) {
			System.out.println("[1.조회, 2.추가, 3.수정]");
			System.out.print("메뉴>");
			
			int menu = in.nextInt();
			
			if(menu == 1) {
				
				//부서명으로 조회
				List<DeptsVO> list = deptsDAO.getDepts("변경한부서");
				
				System.out.println(list.toString());
				
			} else if(menu == 2) {
				
				//부서명 입력
				System.out.print("부서명>");
				String department_name = in.next();
				System.out.print("매니저아이디>");
				int manager_id = in.nextInt();
				System.out.print("로케이션아이디>");
				int location_id = in.nextInt();
				
				DeptsVO vo = new DeptsVO(0, department_name, manager_id, location_id);
				
				//매개변수 전달
				int result = deptsDAO.insertDepts(vo);
				
				if(result == 0) System.out.println("실패하였습니다");
				else System.out.println("성공하였습니다");
				
			} else if(menu == 3) {
				
			} else if(menu == 4) {
				
			}
		}
	}
}
