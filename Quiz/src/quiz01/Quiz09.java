package quiz01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz09 {
	
	public static void main(String[] args) throws IOException{
		
		/*
		 * 어떤 정수를 입력을 받는다
		 * 입력받은 정수에 해당하는 구구단 세로로 출력
		 * 
		 */
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수를 입력하세요> ");
		
		int N = Integer.parseInt(bf.readLine());
		System.out.println("구구단 : " + N + "단");
		
		bf.close();
		int i = 1;
		
		while(i<10) {
			System.out.println(N + " x " + i + " = " + (N*i));
			i++;
		}
	}
}
