package day01;

public class Bye {

	public static void main(String[] args) {
		// main이라 쓰고 ctrl + space를 누르면 실행함수가 만들어집니다.
		/*
		 * ctrl + s 저장
		 * ctrl + f11 실행
		 * sysout이라 적고 ctrl + space 출력문 자동완성
		 * 
		 * 코드 이동 : alt + 방향키
		 * 코드 복사 : alt + ctrl + 방향키
		 * 되돌리기 : ctrl + z
		 * 전체선택 : ctrl + a
		 * 전체 정렬 : ctrl + a, ctrl + i
		 * 한 줄 삭제 : ctrl + d
		 * 
		 */
		System.out.println("출력문 자동완성");
		System.out.println(1); // 숫자
		System.out.println("1"); // 문자열 
		
		//자바의 출력문의 종류 - println, print, printf
		System.out.print("hi"); // 줄바꿈 없음(개행문자 없음)
		System.out.print("hi\n"); // \n 개행문자 추가
		System.out.println("hi"); // 줄바꿈 ( 개행문자 )
		System.out.printf("제 이름은 %s 입니다%n", "Jang"); // 형식 지정 출력문
		// 내가 출력하고 싶은 문자열에 구멍을 뚫어놓고 사용하는 방식
		/*
		 *  %d = 정수
		 *  %f = 실수
		 *  %s = 문자열
		 *  %n = 개행문자
		 *  \t = 8칸 공백을 잡고 정렬
		 */
		System.out.printf("원주율은 %.2f 입니다%n", 3.14);
		
		// 제 생일은 xxxx년 xx월 xx일 입니다 - 출력하기
		
		System.out.printf("제 생일은 \t%d년 %d월 %d일 입니다", 1993, 02, 26); // \t 8칸 공백을 만들어 넣어줌
	}
}