package day01;

public class Operator05 {

	public static void main(String[] args) {
		
		// 프로그램에서 랜덤한 값을 발생시키는 기능
//		System.out.println(Math.random());// 1미만의 랜덤한 double값
		
		// 1 ~ 10 까지 랜덤한 값
		double d = Math.random() * 10;
		
//		int a = (int)d; // 0 ~ 9 까지 숫자
		int a = (int)d + 1; // 1 ~ 10 까지 숫자
		System.out.println("1 ~ 10까지 랜덤수 : " + a);
		
		// 한 줄에
		int result = (int)(Math.random()*10 + 1);
		// 실행 순서 : 형 변환이 먼저 -> *10 -> + 1
		
		//삼항연산식
		// 조건 ? 연산1 : 연산2
		
		String s = result % 2 == 0 ? "짝수" : "홀수";
		
		System.out.println(result + " 는 " + s);
	}
}
