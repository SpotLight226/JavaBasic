package quiz01;

public class Quiz08 {
	
	public static void main(String[] args) {
		
		String[] arr = {"안녕", "hello", "니하오", "오하~", "$#!#1"};
		
		/*
		 * 1. 랜덤수를 생성하고, 이 랜덤 수를 이용해서 배열의 랜덤한 값이 출력되게 처리합니다
		 * 2. 출력된 문자열이, 어느 나라언어 인지 판별해서 출력해주면 된다
		 */
		
		int n = (int)(Math.random() * arr.length); // arr.length = 5 -> 배열 길이가 바뀔 때 n 값이 같이 바뀜 
		System.out.println("선택된 단어 : " + arr[n]);
		
		switch(n) {
		case 0 : 
			System.out.println("한국어입니다");
			break;
		case 1 : 
			System.out.println("영어입니다");
			break;
		case 2 : 
			System.out.println("중국어입니다");
			break;
		case 3 : 
			System.out.println("일본어입니다");
			break;
		case 4 : 
			System.out.println("알 수 없는 언어입니다");
			break;
		}
	}
}
