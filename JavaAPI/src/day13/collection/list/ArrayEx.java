package day13.collection.list;

import java.util.ArrayList;

public class ArrayEx {

	public static void main(String[] args) {
		// 기본 길이(용량, capacity)가 10인 ArrayList를 생성
		ArrayList list1 = new ArrayList(10);
		//ArrayList에는 객체만 저장가능
		// autoboxing에 의해 기본형이 참조형으로 자동 변환
//		list1.add(new Integer(1)); 원래는 이렇게 작성
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		// ArrayList(Collection c)	
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // 1<= x < 4 -> 0~3
		//subList로 만들어진 list는 읽기 전용 -> 위와 같이 새로운 ArrayList로 만들어줘야 함
		
	}
}
