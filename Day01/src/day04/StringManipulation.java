package day04;

import java.util.Arrays;

public class StringManipulation {
	
	public static void main(String[] args) {
		
		//문자열 다루기
		//문자열은 char형의 배열 -> 문자열은 인덱스가 있다
		
		
		String str = "안녕하세요~ 영어로하면 하이!";
//		System.out.println( str[0] ); // 안됨
		
		//문자열을 다루는 다양한 메서드를 제공
		
		//문자열 한글자 자르기 charAt
		char c = str.charAt(0); // : 뒤에 있는 것은 메서드의 반환 타입이다 ex) : char - String => String이 들어가 char형을 반환
		System.out.println(c);
		
		//문자열의 위치확인 indexOf(앞에서부터), lastIndexOf(뒤에서부터) - 없다면 -1을 반환
		int idx = str.indexOf("야"); // 앞에서부터 찾음
		System.out.println("문자의 위치 :" + idx);
		
		int idx2 = str.lastIndexOf("하"); // 뒤에서부터 찾음
		System.out.println("뒤에서부터 찾은 위치:" + idx2);
		
		//문자열 변환 toUpperCase(), toLowerCase 
		// upper -> 대문자로, lower -> 소문자로
		
		String s = "abcDEF";
		
		String result = s.toLowerCase(); // 소문자로 반환
		System.out.println(result);
		System.out.println(s); // 주의!! 원본 문자열은 그대로 유지!!!!!!!
		
		String result2 = s.toUpperCase(); // 대문자로 반환
		System.out.println(result2);
		
		System.out.println("================================");
		
		// 문자열 변경 replace
		s = "abcdefaaa";
		
		String result3 = s.replace("a", "x");
		System.out.println(result3); // a-> x로 변경(전부 다)
		System.out.println(s); // 원본문자열은 그대로 유지 
		
		String result4 = s.replaceFirst("a","x");
		System.out.println(result4); // a -> x로 변경 (첫번째만)
		
		System.out.println("================================");
		
		//공백제거 trim
		str = "  010-1111-2222  ";
		
		String result5 = str.trim();  //앞뒤 공백을 제거해서 반환 
		System.out.println(result5);  // 원본문자열은 그대로 유지
		
		// 모든 공백은 replace(" ", "") 로 제거한다
		str = " 안녕 하세요? 오늘은 4월 19일 입니다   ";  // trim = 중간의 공백 제거 불가
//		String result6 = str.replace(" ", ""); // (타킷문자, 바꿀 문자) -> 공백을 null로
		str = str.replace(" ", ""); // 원본 문자열(str)에 replace 실행한 문장 저장 ***!!!!
		System.out.println(str);
		
		System.out.println("===============================");
		
		//문자열 자르기
		
		//특정 위치에서 자르기 : substring - 인덱스 기준으로 자름
		str = "010-1111-2222";
		String result6 = str.substring(9); // 인덱스 ()번쨰 미만 절삭
		System.out.println(result6);
		
		//원본 문자열은 그대로 유지 : str은 변함 없음
		String result7 = str.substring(4, 8); // (이상, 미만) -> 4<= x <8 인덱스 추룰
 		System.out.println(result7);
 		
 		System.out.println(str);
 		
 		//아주 좋은 기능 !!!!!!!
 		//split - 특정 문자를 기준으로 자른다 (제대로 사용하려면 정규표현식)
 		
 		String[] arr = str.split("-");
 		System.out.println(Arrays.toString(arr));
 		
 		//한 글자씩 
 		String[] arr2 = str.split("");
 		System.out.println(Arrays.toString(arr2)); // String 배열
 		
 		//toCharArrays - 한글자 씩 char형으로 자름
 		char[] arr3 = str.toCharArray();
 		System.out.println(Arrays.toString(arr3)); // char 배열
 		
 		System.out.println("===================================");
 		
 		// 문자열의 길이
 		str = "안녕하세요";
 		int len = str.length(); //길이 = int형
 		System.out.println("문자열 길이: " + len);
 		
 		// 문자열의 비교 equals()
 		if(str.equals("안녕하세요")) {
 			System.out.println("두 문자가 같음");
 		}
 		
 		// 문자열의 포함여부 contains()
 		if(str.contains("녕")) {
 			System.out.println("녕이 포함되어 있다");
 		}
 		
 		
	}
}
