package day12.api.lang.string;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		// String클래스
		 
//		char[] arr = {'a', 'b', 'c'}; 
//		String str = new String(arr); // 새로운 String인스턴스를 생성하여, 문자열 객체 생성 
		
		String str = "안녕하세요~";
		System.out.println(str);
		//한글자 자르기
		char c = str.charAt(0); // 지정된 위치(index)의 문자 하나를 반환
		System.out.println(c);
		
		//찾으면 인덱스번호를 반환, 못찾으면 음수(-1)반환
		System.out.println(str.indexOf("안녕")); // 시작 index를 반환한다
		System.out.println(str.indexOf("xx")); // 없으므로 -1 반환
		
		if( str.indexOf("안녕") != -1) { // 문자열에 값이 있을 때
			System.out.println("문자열에 값이 존재함");
		}
		
		// 문자열 끝에서부터 값을 찾는다 -> 문자열의 index는 변하지 않는다 : 찾는 위치만 다를 뿐
		System.out.println( str.lastIndexOf("안녕"));
		
		//contains() - 문자열에 값이 있다면 true, 없으면 false
		if( str.contains("안녕") ) { 
			System.out.println("문자열에 값이 존재함");
		}
		
		//length() -
		System.out.println("문자열의 길이:" + str.length());
		
		System.out.println("------------------------------");
		
		//문자열 변경 replace
		str = "자바의 기원은, 자바칩프라페치노 커피집에서 시작되었습니다";
		
		System.out.println(str.replace("자바", "java"));
		//regex : 정규식
		//replaceFirst - 앞의 것만 변환
		System.out.println(str.replaceFirst("자바", "java"));
		// 공백 제거
		System.out.println(str.replace(" ", ""));
		
		System.out.println("------------------------------");
		
		//문자열 자르기 substring
		System.out.println( str.substring(9) ); // 주어진 index값 위치부터 문자열 끝까지 자른다
		System.out.println( str.substring(9, 18)); // 주어진 start부터 end 전 까지 자른다
												   // 9<= x < 18 - 끝의 index는 포함 X
		//문자열 자르기 split
		String[] arr = str.split(" "); // 반환타입 배열
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = str.split(" ", 3); // 최대 배열의 길이를 정해서 자른다
		System.out.println(Arrays.toString(arr2));
		
		char[] arr3 = str.toCharArray(); // 한 글자씩 자른다
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("-------------------------------");
		
		//문자열의 비교
		str = "홍길동";
		
		// equals - 문자열 비교 ( == 사용 X)
		System.out.println( str.equals("홍길동")); // 문자열 비교시 equals를 사용한다
		// compareTo - 문자열을 사전 순서대로 비교
		System.out.println( str.compareTo("홍길동")); // 0 - 같은문자
		System.out.println( str.compareTo("홍길자")); // 음수 - str이 홍길자 보다 사전등재순 앞에 위치함
		System.out.println( str.compareTo("홍길가")); // 양수 - str이 홀길가 보다 사전등재순 뒤에 위치함
		
		// join ( "구분자" , 문자열 요소 ) -> 특정 구분자로 문자열을 연결
		System.out.println(String.join("-", "hello", "world", "!!!", "~~~"));
		
		//기본타입을 문자열로 변경
		System.out.println(String.valueOf(1) + String.valueOf(2));
		System.out.println("" + 1 + 2);
		
		
	}
}
