package day15.api.ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainClass03 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		Random ran = new Random(); // 랜덤 객체 생성
		
		for(int i = 0; i<100; i++) {
			list.add( ran.nextInt(100) +1 ); // 1~100까지
		}
		
		System.out.println( list.toString());
		
		//최중집계 함수
		//collect()
		// Collectors.toList - list 타입으로 반환을 받는다
		List<Integer> newList = list.stream().filter( a -> a%3 == 0).collect( Collectors.toList() );
		System.out.println(newList.toString());
		// Collectors.toSet - Set타입으로 반환을 받는다
		Set<Integer> newList2 = list.stream().filter( a -> a%3 ==0).collect( Collectors.toSet());
		System.out.println(newList2.toString());
		
		System.out.println("----------------------------------------------------------------------");
		//sum(), count(), avg(), max(), min() - 숫자를 다루는 스트림에서만 사용
		// int 나 double로 변경해주어야 sum 사용가능
		// mapTo<타입> - 타입으로 stream을 변경
		int r1 = list.stream().distinct().mapToInt( a -> a).sum(); // sum - 합계
		System.out.println("합계:" + r1);
		
		long r2 = list.stream().distinct().mapToInt(a -> a).count(); // count - 개수
		System.out.println("개수:" + r2);
		
		OptionalDouble r3 = list.stream().distinct().mapToInt(a -> a).average(); // average - 평균
		System.out.println(r3.getAsDouble()); // 옵셔널 더블형 -> 더블값 반환
		
		OptionalInt r4 = list.stream().distinct().mapToInt(a->a).max(); // max - 최고값
		System.out.println(r4.getAsInt());  // 옵셔녈 int형 -> int값 반환
		
		System.out.println("----------------------------------------------------------------------");
		//list에서 50보다 큰 값만 중복없이 저장하는 새로운 리스트 생성
								   //스트림 변경.중복 제거. 필터(50이상 인지).최종집계 함수 ( Collectors.to<타입> )
		List<Integer> newList3 = list.stream()
									 .distinct()
									 .filter( a -> a>=50 )
									 .collect( Collectors.toList());
		System.out.println(newList3.toString());
		
		System.out.println("----------------------------------------------------------------------");
		
		IntStream.range(1, 10).forEach( a-> System.out.print(a + " ")); // from <= x < to 미만까지 정수스트림반환
		System.out.println();
		IntStream.rangeClosed(1, 10).forEach(a -> System.out.print(a + " ")); // from <= x <= to 포함해서 정수스트림반환
		System.out.println();
		
		int result2 = IntStream.rangeClosed(1, 100).sum();
		System.out.println("1~100까지 합:" + result2);
		
		//정수스트림 -> 일반스트림 형변환 - boxed()
		Stream<Integer> stream = IntStream.rangeClosed(1, 100).boxed();
		// => 일반스트림으로 변환시켜서 List 등에 넣을 수 있다
		
		
	}
}
