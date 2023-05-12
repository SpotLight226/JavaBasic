package quiz01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarT {
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 줄 개수
		
//		Q1) ****** 한줄 별
//		for(int i = 1; i<=N; i++) {
//			System.out.print("*");
//		}
		
//		Q2) 세로 별
//		for(int i = 1; i<=N; i++) {
//			System.out.println("*");
//			}
		
//		Q3) 사각형
//		for(int i = 0; i<N; i++) {
//			for(int j = 0; j<N; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Q4) 숫자 사각형
//		for(int i = 1; i<=N; i++) {
//			for(int j = 1; j <=N; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
//		Q5) 숫자 사각형 순차로 숫자
//		for(int i =1; i<=N; i++) {
//			for(int j =1; j<=N; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		Q6) 숫자 앞자리 숫자가 1씩 늘어나는 사각형
//		for(int i = 0; i<N; i++) {
//			for(int j =1; j <=N; j++) {
//				System.out.print(i+j);
//			}
//			System.out.println();
//		}
		
//		Q7) Q6를 역순으로
//		for(int i =0; i<N; i++) { 
//			for(int j = N; j<2*N; j++) {
//				System.out.print(j-i);
//			}
//			System.out.println();
//		}
		
//		Q8) 직각삼각형 별
//		for(int i = 1; i<=N; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Q9) 역삼각형 별
//		for(int i = 1; i<=N; i++) {
//			for(int j = N; j>=i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Q10) 왼쪽에 붙은 역삼각형
//		for(int i = 1; i <= N; i++) {
//			for(int k = 1; k<i; k++) {  
//				System.out.print(" ");
//			}
//			for(int j = N; j>=i; j--) { // 5 1 , 4 1, 3 1, 2 1, 1 1, 
//				System.out.print("*");  // 5 2, 4 2, 3 2, 2 2, 
//			}							// 5 3, 4 3, 3 3,
//			
//			System.out.println();
//		}
		
//		Q11) 왼쪽 직각삼각형
//		for(int i = 1; i<=N; i++) {
//			for(int j = N; j>i; j--) {
//				System.out.print(" ");
//			}
//			for(int k = 1; k<=i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Q12) 왼쪽벽 삼각형  => 파트를 나누어서 제작
//		for(int i = 1; i<=N/2; i++) { 
//			for(int j = 1; j<=i; j++) { // 1 1 , 1 2 2 2, 1 3, 2 3, 3 3,
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i = N/2; i<=N; i++) {
//			for(int j = N; j>=i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Q13) 반쪽 모래시계
		
//		for(int i = 1; i<=N/2; i++) {
//			for(int j = N/2; j>=i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i = N/2; i<=N; i++) {
//			for(int j = N/2; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
}

