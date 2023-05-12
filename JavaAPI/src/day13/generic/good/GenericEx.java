package day13.generic.good;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
	
	public static void main(String[] args) {
		
		//제네릭<?> = 제네릭에 뭐든 다 들어갈 수 있음
		//제네릭<? extends String> = String과 String의 자식들
		//제네릭<? super String> = String타입이 될 수 있다면 전달 가능
		
		List<String> list1 = new ArrayList<>();  // String
		List<Integer> list2 = new ArrayList<>(); // Integer
		List<Object> list3 = new ArrayList<>();  // Object
		
		add1(list1); // OK
		add1(list2); // OK
		add1(list3); // OK
		
		add2(list1); // OK
//		add2(list2); // Integer X
//		add2(list3); // Object X
		
		add3(list1); // OK
//		add3(list2); // Integer X
		add3(list3); // Object 는 형 변환으로 String 가능
	}
	
	// 어느 list든 받을 수 있다
	public static void add1(List<?> list) {
	}
	// 
	public static void add2(List<? extends String> list) {
	}
	
	public static void add3(List<? super String> list) {
	}
}
