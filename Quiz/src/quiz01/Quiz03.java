package quiz01;

import java.util.Scanner;

public class Quiz03 {
	
	public static void main(String[] args) {
		
		// 키 = 실수, 나이 = 정수
		// 키는 140이상, 나이는 8세 이상인 경우만 놀이기구 탑승가능
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("키와 나이를 입력하세요\n");
		System.out.print("키 > ");
		System.out.print("나이 > ");
		
		double t = in.nextDouble();
		int y = in.nextInt();
		
		if(t >= 140.0 && y >= 8) {
			System.out.println("놀이기구 탑승 가능");
		} else {
			System.out.println("놀이기구 탑승이 불가능합니다");
		}
		in.close();
	}
}
