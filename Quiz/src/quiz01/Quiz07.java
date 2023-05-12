package quiz01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz07 {

	public static void main(String[] args) throws IOException{
		
		/*
		 * 정수1 입력 받고
		 * 연산 선택
		 * 정수2 입력 받아서
		 * 결과를 출력
		 * 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("정수 1 을 입력>");
		int n1 = br.read();
		System.out.print("연산을 선택하세요 [+, -, *, /]>" );
		String oper = br.readLine();
		System.out.print("정수 2 을 입력>");
		int n2 = br.read();
		
		
		switch(oper) {
		
		case "+" :
			System.out.print("두 수의 덧셈은: " + (n1 + n2));
			break;
		case "-" :
			System.out.print("두 수의 뺄셈은: " + (n1 - n2));
			break;
		case "*" :
			System.out.print("두 수의 곱셈은: " + (n1 * n2));
			break;
		case "/" :
			System.out.print("두 수의 나눗셈은: " + (n1 / n2));
			break;
		default :
			System.out.println("연산자는 [+, -, *, /] 입니다");
		}
	}
}
