package day15.api.ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

public class MainClass02 {
	
	public static void main(String[] args) {
		
		/*
		 * 람다 함수의 구현 사용문법
		 * Predicate - 매개변수가 하나 있고, boolean형 반환
		 * Consumer - 매개변수 하나 받고, void형 (forEach) 반환
		 * Function - 매개변수 여러개 받고, 반환은 임의의 타입 값
		 */
		
		List<Integer> list = new ArrayList<>();
		Random ran = new Random(); // 랜덤 객체 생성
		
		for(int i = 0; i<100; i++) {
			list.add( ran.nextInt(100) +1 ); // 1~100까지
		}
		
		System.out.println( list.toString());
		
		//중간처리 함수들
		// distinct() - 중복제거
//		Stream<Integer> stream = list.stream();
//		stream = stream.distinct(); // 중복 제거
//		stream.forEach( (a) -> System.out.print(a + " ") );
		// 한 줄로
		list.stream().distinct().forEach( (a) -> System.out.print(a + " "));
		System.out.println("\n--------------------------------------------------------------------");
		
		//sort() - 정렬
		list.stream().distinct().sorted().forEach( (a) -> System.out.print(a + " "));
		System.out.println("\n--------------------------------------------------------------------");
		
		//filter() - 리턴에 true값만 남기고 필터링
		// predicate : 매개변수를 받아서, boolean타입으로 반환
//		list.stream().distinct().filter( (a) -> {return true;}); // return쓰고 싶으면 {}필요
		// 짝수만 남길 때
		list.stream().distinct().filter( (a) -> a % 2 == 0 ).sorted().forEach( a -> System.out.print(a + " ")); // 반복문을 돌면서 true인 값만 반환
		
		System.out.println("\n--------------------------------------------------------------------");
		// map() - 반환에 정의 된 값으로 완전히 새로운 스트림 반환
		list.stream().map( (a) -> a%2 == 0 ? "짝수":"홀수").forEach(a -> System.out.print(a + " "));
		
//		list.stream().map(new Function<T, R>() { // T를 매개변수로 R을 반환
//			@Override
//			public R apply(T t) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		});
		
		// 짝수, 홀수 판단 int a가 매개변수 str을 반환
//		list.stream().map( (a) -> {
//			String str;
//			if(a % 2 == 0) {
//				str = "짝수";
//			} else { str ="홀수"; }
//			return str;
//		});
		
		System.out.println("\n--------------------------------------------------------------------");
		//mapToDouble() - 반환에 정의된 값으로 double형 스트림변경
		//mapToInt() - 반환에 정의된 값으로 int형 스트림변경
		//mapTOLong() - long타입 스트림으로 변경
		list.stream().mapToDouble( a -> a).forEach(a-> System.out.print(a + " "));
		
	}
}
