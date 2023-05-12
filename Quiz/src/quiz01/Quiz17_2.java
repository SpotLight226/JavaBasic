package quiz01;
// 삼항 연산자를 이용한 풀이 방법

import java.util.Scanner;

public class Quiz17_2 {

		public static void main(String[] args) {

			
			Scanner in = new Scanner(System.in);
			int countc = 0;
			int countw = 0;
			
			while(true) {
				
				int num1 = (int)(Math.random()*100)+1; // 1~100
				int num2 = (int)(Math.random()*100)+1; // 1~100
				int oper = (int)(Math.random()*2); // 0,1
				
				System.out.println("----------------------------");
				System.out.println(num1 + (oper == 0 ? "+" :"-") + num2 + " = ?");
				System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
				System.out.print(">");
				
				int answer = in.nextInt();
				
				int correct = oper == 0 ? num1 + num2 : num1 - num2; // 정답
				
				if( answer == 0) {
					System.out.println("프로그램 정상 종료");
					System.out.println("정답:" + countc);
					System.out.println("오답:" + countw);
					break;
				} else if(answer == correct) {
					System.out.println("정답입니다");
					countc++;
				} else {
					System.out.println("틀렸습니다");
					countw++;
				}
				
				
			}
		}
}
