package day13.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	
	public static void main(String[] args) {
		 /*
		 리스트와 반대 (순서 X, 중복 X)
		 => 인덱스 기준으로 조회하는 메서드가 없다
		 => 동일한 값을 저장하면, 들어가지 않는다
		 set계열 순회할 때는 향상된 for문, 반복자 개념을 사용해야 합니다
		 
		 HashSet 클래스
		 TreeSet 클래스 (Set + 정렬)
		 */
		
//		HashSet<String> set = new HashSet<>();
		Set<String> set = new HashSet<>(); // 다형성을 이용하여 set타입으로
		
		//add()
		set.add("java");
		set.add("database");
		set.add("spring");
		set.add("jsp");
		set.add("python");
		set.add("java"); // 중복 X
		
		//
		System.out.println(set.toString());
		//크기
		System.out.println("크기:" + set.size());
		//삭제(값) -> 일치하는 값을 삭제한다
		set.remove("python");
		System.out.println(set.toString());
		
		// 순회 => 내부적으로 반복자(Iterator)의 개념을 사용해서 회전
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("----------------------------");
		// set => Iterator 타입으로 변경
		Iterator<String> iter = set.iterator();
		// .hasNext - 다음이 있는지 확인해서 boolean타입 반환
		while(iter.hasNext()) { // 다음이 있다면 true
			System.out.println(iter.next()); // 출력
		}
	}
}
