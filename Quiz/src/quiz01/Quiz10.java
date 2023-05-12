package quiz01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz10 {

	public static void main(String[] args) throws IOException{
		
		/*
		 * 1. 정수를 입력받는다
		 * 2. 입력받은 정수까지 수 중에서 3의 배수이거나, 4의 배수일 경우에는
		 *    공백으로 구분해서 가로로 출력
		 *    
		 * 예시
		 * 출력수 10
		 * 출력수 3 4 6 8 9
		 */
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		Scanner scn = new Scanner(System.in);
		
		System.out.print("정수를 입력>");
		int num = Integer.parseInt(bf.readLine()); // 10
//		int num = scn.nextInt();
		
		int i = 1;
		String str = ""; // 아무것도 없느 문자 = 공백
		
		while(i<=num) { // 1 ~ num까지          i는 3의 배수 또는 4의 배수
			if(i % 3 == 0 || i % 4 == 0 ) { // i가 3이나 4로 나누었을 때, 나머지가 0
//				System.out.print(i + " ");  하나씩 출력
				// 문자열 누적**
				str += i + " ";
			 }
			i++;
		}
		bf.close();
		System.out.println(str);
	}

}
