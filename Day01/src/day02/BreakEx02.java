package day02;

import java.util.Scanner;

public class BreakEx02 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // 선언문은 항상 위에(변수 범위)
		
		while(true) {
			
			System.out.println("4 x 3 = ?>");
			System.out.print("정답>");
			int answer = in.nextInt();
			
			if(answer == 12) { // 정답
				System.out.println("정답!");
				break;
			} else {
				System.out.println("오답입니다");
			}
			
		}
	}

}
