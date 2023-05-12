package day11.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		// next, nextInt, nextDouble, nextLine
		
		/*
		System.out.print("정수>");
		int num = in.nextInt(); // 12 'enter' -> 개행 문자 제외하고 12만 입력된다 -> 개행 문자는 남아있다 ( 개행문자 기준 앞까지 ) 
		
		in.nextLine(); // 즉, 개행 문자를 소비하게 한다
		
		System.out.print("문자열>");
		String info  = in.nextLine(); // 앞의 개행 문자가 남아있기 때문에, 개행 문자를 입력값으로 판단하여 처리한다
		
		System.out.println(num);
		System.out.println(info);
		*/
		
		while(true) {
			
			try {
				
				System.out.print(">");
				int num = in.nextInt(); // 문자 엔터값을 정상적으로 처리를 못해서 문자 입력시 개행 문자가 계속 남아 있어서 예외 무한 루프
				
				System.out.println(num);
				
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요");
				in.nextLine(); // 남아있는 개행 문자를 처리
			}
		}
	}
}
