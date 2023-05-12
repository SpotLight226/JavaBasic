package quiz01;

import java.util.Scanner;

public class Quiz17 {

		public static void main(String[] args) {

			
			Scanner in = new Scanner(System.in);
			int countc = 0;
			int countw = 0;
			
			while(true) {
				
				int r = (int)(Math.random()*100)+1; // 1~100
				int l = (int)(Math.random()*100)+1; // 1~100
				int v = (int)(Math.random()*2); // 0,1
				char op = '\0';
				int col = 0;
				
//				if(v==0) { // if문 
//					op = '+';
//					col = r + l;
//				} else {
//					op = '-';
//					col = r - l;
//				}
				switch(v) { // switch문
				case 0 : op = '+';
						 col = r + l;
						 break;
				case 1 : op = '-';
						 col = r - l;
						 break;
				}
				
				System.out.println("----------------------------");
				System.out.println(r + " " + op + " " + l + " = ?");
				System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
				System.out.print(">");
				
				int answer = in.nextInt();
				
				if( answer == 0) {
					System.out.println("프로그램 정상 종료");
					System.out.println("정답:" + countc);
					System.out.println("오답:" + countw);
					break;
				} else if(answer == col) {
					System.out.println("정답입니다");
					countc++;
				} else {
					System.out.println("틀렸습니다");
					countw++;
				}
				
				
			}
		}
}
