package quiz01;

import java.util.Scanner;

public class Quiz19 {
	
	public static void main(String[] args) {
		
		// 금액의 동전 - 나머지, 몫 활용
		// 어떤 금액 x가 주어졌을 때, 큰 금액부터 거슬러서 몇개가 나와야 하는지 출력
		int[] arr = {1000, 500, 100, 50, 10};
		System.out.print("금액 >");
		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt(); // 입력받은 금액
		
		for(int i = 0; i<arr.length; i++) {  //for문으로
			System.out.println(arr[i] + "원 :" + x/arr[i]);
			x %= arr[i];
		}
		
//		int a = 0;  // while문으로
//		while(a<arr.length) {
//			System.out.println(arr[a] + "원 : " + x/arr[a]);
//			x %= arr[a];
//			a++;
//		}
		
	}
}
