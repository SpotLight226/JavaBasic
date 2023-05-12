package day13.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		/*
		 * ArrayList
		 * 배열 기반
		 * 순서 o, 중복 o
		 */
		
		//ArrayList<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>(); // 다형성을 이용하여 부모타입 List로 사용
		
		list.add("홍길동");
		list.add("이순신");
		list.add("홍길자");
		list.add("홍길동");
		list.add("신사임당");
		
		//문자열로 확인
		System.out.println(list.toString());
		
		//길이 확인
		System.out.println("리스트의 길이:" + list.size());
		
		//중간에 추가 add() -(인덱스, 값)
		list.add(0, "0번째 추가");
		System.out.println(list.toString());
		
		//값의 확인 get
		String n = list.get(3);
		System.out.println(n);
		
		//값의 수정 set -> (index, 수정할 값) 
		list.set(4, "홍순자");
		System.out.println(list.toString());
		
		//값의 제거 remove()
		list.remove(0);
		System.out.println(list.toString());
		list.remove("신사임당");
		System.out.println(list.toString());
		
		//contains() 값의 여부 확인
		if(list.contains("홍길동")) {
			System.out.println("홍길동 있음");
		}
		
		//isEmpty() 비었는지 확인
		if(list.isEmpty()) System.out.println("리스트가 비었음");
		else System.out.println("리스트가 비어있지 않음");
		
		//전부삭제 clear()
		list.clear(); 
		System.out.println(list.toString());
		
		System.out.println("----------------------------------");
		
		//제네릭<?> = 제네릭에 뭐든 다 들어갈 수 있음
		//제네릭<? extends String> = String과 String의 자식들
		//제네릭<? super String> = String타입이 될 수 있다면 전달 가능
		
		//매개변수를 전달 받으면 list타입으로 반환한다
		List<String> list2 = Arrays.asList("a", "b", "c", "d");
		System.out.println(list2.toString());
		
		// 리스트를 병합
		list.addAll(list2);
		list.addAll(0, list2);
		System.out.println(list.toString());
	}
}
