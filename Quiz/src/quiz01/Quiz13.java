package quiz01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz13 {

	public static void main(String[] args) throws IOException{
		
		//1. 7~100까지 정수 중에 7의 배수만 가로로 출력
		
		for(int i = 7; i<=100; i++) {
			if(i%7 == 0) {
			System.out.print(i + " ");
			}
		}
		System.out.println();
		
		for(int i = 7; i<=100; i+=7) {  // i가 7부터 시작하므로 i+=7 방식으로 사용도 가능
			System.out.print(i + " ");
		}
		
		//2. 1~200까지 정주 중에 9의 배수의 개수를 출력
		int count = 0;
		
		for(int i = 1; i<=200; i++) {
			if(i%9 == 0) {
				count++;
			}
		}
		System.out.println("\n9의 배수의 개수 :" + count);
		
		//3. 50~100사이의 두 수 사이의 합
		int sum = 0;
		
		for(int i = 50; i<=100; i++) {
			sum += i;
		}
		System.out.println("50~100까지 합 : " + sum);
		
		//4. A~Z까지 가로로 붙여서 출력, A=65, Z=90
		
		for(int i = 65; i<91; i++) {
			System.out.print((char)i);
		}
		System.out.println();
		
		String str = ""; // 문자열에 문자형을
		for(char c = 'A'; c <= 'Z'; c++) {  // **문자형도 반복 가능(유니코드)
			System.out.print(c); 
			str += c;  // 문자열에 문자형을 중첩
			System.out.println();
		}
		System.out.print(str);
		
		//5. 입력받은 정수까지 팩토리얼 ex) 5팩토리얼 = 5*4*3*2*1
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\n정수를 입력하세요>");
		int n = Integer.parseInt(bf.readLine());
		int fac = 1;
		for(int i = 1; i<=n; i++) {
			
			fac *= i;
		}
		System.out.println(n + "의 팩토리얼 = " + fac);
		
	}

}
