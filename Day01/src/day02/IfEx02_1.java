package day02;

import java.util.Scanner;

public class IfEx02_1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력>");
		int point = scan.nextInt(); // 정수 입력
		
		if(point >= 90) {
			
			if(point >= 95) { // 95<= point <= 100
				System.out.println("A+학점");
			} else { // 90 <= point < 95
				System.out.println("A학점");
			}
			
			System.out.println("상위 10프로네요!");
			
		} else if( point >= 80) {
			System.out.println("B학점");
		} else if ( point >= 70) {
			System.out.println("C학점");
		} else if( point >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("재수강");
		}

	}
}
