package quiz01;

import java.util.Scanner;

// Scanner 버전
public class Quiz04_2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("두 정수를 입력하세요");
		
		int A = scn.nextInt();
		int B = scn.nextInt();
		
		scn.close();
		
//		System.out.println(A>B ? "A" : "B");
		
		if(A>B) {
			System.out.println(A);
		} else if (A<B) {
			System.out.println(B);
		} else {
			System.out.println("같은 수 입니다");
		}
		
		
	}
}
