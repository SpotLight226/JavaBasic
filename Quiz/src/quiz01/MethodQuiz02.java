package quiz01;

import java.util.Scanner;

public class MethodQuiz02 {
	
	public static void main(String[] args) {
		
		// 정수 2개를 받아서 합을 출력하는 문장
		// 4개의 메서드로 나눈다
		
//		// 반환도 없고, 매개변수도 없는 show()
//		System.out.println("[두 수의 합을 구합니다]");
//		
//		//메서드로 만들어 2번 호출하면 지금과 같다
//		//반환은 있고, 매개변수는 없는 메서드 input()
//		Scanner in = new Scanner(System.in);
//		System.out.print("정수입력>");
//		int num1 = in.nextInt();
//		
//		System.out.print("정수입력>");
//		int num2 = in.nextInt();
//		
//		//두 수의 합을 리턴하는 메서드 add()
//		int result = num1 + num2;
//		
//		// 결과를 받아서 출력하는 메서드
//		// 매개변수로 result를 받아서 단순히 출력 print()
//		System.out.println("두 수의 합:" + result);
		
		show();
		
		int num1 = input(); 
		int num2 = input(); 
		
		int result = add(num1, num2);
		
		print(result);
		
	}
	
	static void show() {
		System.out.println("[두 수의 합을 구합니다]");
	}
	
	static int input() {
		Scanner in = new Scanner(System.in);
		System.out.print("정수입력>");
		int num = in.nextInt();
		
		return num;
	}
	
	static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	static void print(int result) {
		System.out.println("두 수의 합:" + result);
	}
	
}
