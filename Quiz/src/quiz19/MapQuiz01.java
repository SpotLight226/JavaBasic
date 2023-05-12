package quiz19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//맵을 이용하는데 key : 메뉴이름  value: 가격
		Map<String, Integer> map = new HashMap<>();

		while(true) {

			System.out.println("-----음식 메뉴 관리------");
			System.out.println("1. 신규 메뉴 등록"); //이미 등록된 메뉴인지 확인 후에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기"); //메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정"); //변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
			System.out.println("4. 메뉴판 삭제"); //변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료"); //종료

			System.out.print("메뉴입력>");
			int menu = scan.nextInt();

			if(menu == 1) { // 신규 메뉴 등록
				System.out.print("메뉴 이름>");
				String name = scan.next();
				System.out.print("메뉴 가격>");
				int price = scan.nextInt();
				
				if(map.containsKey(name)) {
					System.out.println("이미 등록된 메뉴입니다");
				} else {
					map.put(name, price);
				}
				
			} else if(menu == 2) { //메뉴판 전체 보기
				// Set타입으로 변환하여 map의 요소를 Set에 담는다
				Set<Entry<String, Integer>> entrySet = map.entrySet();
//				Iterator<Entry<String, Integer>> iter = entrySet.iterator();  다 쓸 필요없음
				
//				for(Entry<String, Integer> entry : map.entrySet()) // for문에 조건을 이런 식으로 넣어도 된다
				for( Entry<String, Integer> entry : entrySet) {
					System.out.println("메뉴:" + entry.getKey() + " 가격:" + entry.getValue());
				}
				
				
			} else if(menu == 3) {// 메뉴판 수정
				
				System.out.print("수정할 메뉴>");
				String change = scan.next();
				
				if(map.containsKey(change)) {
					System.out.println("수정할 가격>");
					int price = scan.nextInt();
					
					map.put(change, price);
					System.out.println("수정되었습니다");
					
				} else {
					System.out.println("없는 메뉴 입니다");
				}
				
			} else if(menu == 4) { //삭제
				System.out.print("삭제할 메뉴>");
				String remove = scan.next();
				
				if(map.containsKey(remove)) {
					map.remove(remove);
					System.out.println("삭제되었습니다");
				} else {
					System.out.println("없는 메뉴 입니다");
				}
				/* 아래와 같이도 가능하다
				 * Integer x = map.remove(name) // null 또는 int 반환
				 * if( x != null) {
				 * 		System.out.println("삭제되었습니다");
				 * } else {
				 * 		System.out.println("메뉴가 없습니다)
				 * }
				 */
				
			} else if(menu == 5) {
				System.out.println("종료");
				System.exit(0);
			}

		}


	}
}
