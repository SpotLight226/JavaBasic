package day13.api.lang.token;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenEx01 {
	
	public static void main(String[] args) {
		
		// 빠른 문자열 분리
		// split() - 특정 문자열로 분리 - 정규표현식을 사용해 더 자세히 분리가능
		// toCharArray() - 한 글자씩 분리
		
		String str1 = "오늘은 날씨가 맑고, 매우 시원하지 않습니다";
		
		StringTokenizer token1 = new StringTokenizer(str1);
		
		//메서드
		int cnt = token1.countTokens();
		System.out.println("나눠진 문자열 개수:" + cnt);
		
		// 다음 토큰의 여부 확인
		System.out.println(token1.hasMoreTokens()); // 있으면 true, 없으면 false
		
		while(token1.hasMoreTokens() != false) {
			//다음 토큰의 확인
			System.out.println(token1.nextToken());
		}
		
		System.out.println("--------------------------------------");
		//다양한 구분자를 한번에 지정해서 토큰화 가능
		
		String str2 = "2022/11/31/홍길동/010-1111-2222/서울시/www.example.com";
		
		// - / . 를 구분자로 하여 자름
		StringTokenizer token2 = new StringTokenizer(str2, "-/.");
		
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
		
		System.out.println("--------------------------------------");
		// 구분자를 토큰에 포함시킨다
		StringTokenizer token3 = new StringTokenizer(str2, "/", true);
		
		// 구분자가 사라지지 않고, 하나의 토큰으로 취급된다
		for( ; token3.hasMoreTokens(); ) {
			System.out.println(token3.nextToken());
		}
		
		System.out.println("--------------------------------------");
		
	}
}
