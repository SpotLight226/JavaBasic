package quiz19;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01 {
	
	public static void main(String[] args) {
		/* List1번
		 * 1. list에 1~20까지 값을 순서대로 저장
		 * 
		 * 2. list에 값을 순서대로 출력
		 */
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i<=20; i++) {
			list.add(i);
		}
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		/*
		 * List2번
		 * 1. User를 저장하는 list생성
		 * 2. 3개의 각가 다른 User객체를 만들고 순서대로 저장
		 * 3. User객체 안에 홍길동이 있으면 해당 객체의 name, age를 출력하는 코드
		 * 4. User객체 안에 홍길자가 있으면 해당 객체를 삭제 코드
		 */
		
		List<User> list2 = new ArrayList<>();
		
		User u1 = new User("홍길동", 20);
		User u2 = new User("이순신", 30);
		User u3 = new User("홍길자", 40);
		
		list2.add(u1);
		list2.add(u2);
		list2.add(u3);
		
		for(int i = 0; i < list2.size(); i++) {
			if(list2.get(i).getName().equals("홍길동")) {
				System.out.println("이름 : " + list2.get(i).getName() + 
								   " 나이: " + list2.get(i).getAge());
			}
			if(list2.get(i).getName().equals("홍길자")) {
				list2.remove(i);
			}
		}
	}
}
