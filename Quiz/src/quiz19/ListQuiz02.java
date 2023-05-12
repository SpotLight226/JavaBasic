package quiz19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListQuiz02 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		List<User> list = new ArrayList<>(); // 배열 대체

		while(true) {
			System.out.println("[1.등록 | 2.회원정보확인 3.회원정보검색 | 4.회원정보삭제 | 5.프로그램종료");
			System.out.print("메뉴(번호)>");

			int menu = in.nextInt();
			in.nextLine(); // Enter 제거

			switch (menu) {
			case 1: 
				// 이름, 나이를 입력받아서 user객체에 저장, 리스트에 순서대로 추가
				System.out.print("이름과 나이를 입력해주세요>");
				String user = in.nextLine();
				StringTokenizer st = new StringTokenizer(user);
				User u = new User(st.nextToken(), Integer.parseInt(st.nextToken()));
				/* 선생님 거
				 * System.out.print(">");
				 * String name = in.next();
				 * System.out.print(">");
				 * int age = in.nextInt();
				 * User u = new User(name, age);
				 */
				list.add(u);
				System.out.println("정상 입력되었습니다");
				break;
			case 2: 
				// 리스트에 담긴 모든 회원 이름, 나이를 출력
				for(User u2 : list) {
					System.out.println("이름: " + u2.getName() + " 나이: " + u2.getAge());
				}
				break;
			case 3: 
				// 찾을 이름을 새롭게 입력받아서, 이름이 있다면, 이름과 나이를 출력
				// 조건 - 찾는 이름이 없다면 "~~~는 목록에 없습니다" 출력
				System.out.print("찾을 이름을 입력해주세요>");
				String search = in.next();
				int sindex = 0;
				
				for(int i = 0; i<list.size(); i++) {
					if(list.get(i).getName().equals(search)) {
						sindex = i;
						break;
					} else {
						sindex = -1;
					}
				}
				/* boolean bool = true;
				 * for(int i = 0; i<list.size(); i++) {
				 * 		User u3 = list.get(i);
				 * 		String n = u3.getName();
				 * 
				 * 	  if(search.equals(n)){
				 * 		System.out.println(u3.getName() + "-" + u3.getAge());
				 * 		bool = false; //실행했음
				 * 		break;
				 * 	  }
				 * 	}
				 * if(bool){
				 * 		System.out.println("찾는 이름은 없습니다");
				 * }
				 */	
				if(sindex >= 0) {
				System.out.println("이름: " + list.get(sindex).getName() + 
								   " 나이: " + list.get(sindex).getAge());
				} else {
				System.out.println(search + "는 목록에 없습니다");
				}
				break;
			case 4: 
				// 삭제할 이름을 입력받아서, 이름과 동일한 User객체를 첫번째 1개만 삭제
				System.out.print("삭제할 이름을 입력해주세요>");
				String delete = in.nextLine();
				
				for(int i = 0; i<list.size(); i++) {
					if(list.get(i).getName().equals(delete)) {
						list.remove(i);
						break;
					}
				}
				break;
			case 5: 
				System.out.println("프로그램 종료");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
}
