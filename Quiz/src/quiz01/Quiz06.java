package quiz01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz06 {

	public static void main(String[] args) throws IOException{
		
		/* if구문 밖에 선언된 변수를 잘 활용하자
		 * 
		 * 정수 3개를 입력 받는다
		 * 
		 * 가장 큰 값, 중간 값, 작은 값을 구분해서 출력 (조건 - 같은 수는 없다)
		 * 
		 * ex) 입력
		 * 15,30, 7 -> max : 30, mid : 15, min :7
		 * 
		 */
		int max = 0;
		int mid = 0;
		int min = 0;
		System.out.println("3개의 정수를 입력하세요");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if(a>b && a>c) { // a가 가장 클 때
			max = a;
				if(b>c) { // a > b > c
					mid = b;
					min = c;
				} else {  // a > c > b
					mid = c;
					min = b;
				}
		} else if( b>a && b>c) { // b가 가장 클 떄
			max = b;
				if(a>c) {
					mid = a;
					min = c;
				} else {
					mid = c;
					min = a;
				}
		} else if ( c>a && c>b) { // c가 가장 클 때
			max = c;
				if(a>b) {
					mid = a;
					min = b;
				} else {
					mid = b;
					min = a;
				}
		}
		System.out.println("가장 큰 값 : " + max + " 중간 값 : " + mid + " 가장 작은 값 :" + min);
	}
}