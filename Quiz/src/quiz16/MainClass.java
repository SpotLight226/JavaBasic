package quiz16;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * updown 게임
		 * 
		 * 에러가 발생하면 시도횟수는 증가하고 다시 입력받을 수 있도록 코드를 변경 
		 */

		Scanner in = new Scanner(System.in);


		int x = (int)(Math.random()*100)+1; 

		int count = 0; // 시도 횟수

		while(true) {
			
			try {
				System.out.print("정답입력> ");
				int answer = in.nextInt();  // answer 은 lv (지역 변수) 이므로 try문을 벗어나면 사라진다
				count++;  // 시도횟수 증가
				
				if(answer == x) { // 정답
					System.out.println("정답입니다");
					System.out.println("시도횟수:" + count);
					break;
				} else if (answer > x) { // 정답이 입력보다 큰경우
					System.out.println("더 작은 수를 입력하세요");
				} else { // 정답이 입력보다 작은 경우
					System.out.println("더 큰 수를 입력하세요");
				} 
				
				// try문 종료
			} catch (Exception e) { // 정수가 아닌 입력이 들어올 시 예외 처리
				System.out.println("정수만 입력하세요");
				in.nextLine();
				count++;
			} // catch문 종료
			
		} //while문 종료
		
	}
}

