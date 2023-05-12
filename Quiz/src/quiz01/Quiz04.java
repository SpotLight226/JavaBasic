package quiz01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// BufferedReader 버전
public class Quiz04 {

	public static void main(String[] args) throws IOException {
		
		// 1. 두 정수를 입력을 받고, 큰 수를 출력하면 됩니다
		// 단, 같은 수 라면 " 같은 수 입니다" 출력.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.println("두 정수를 입력하세요 > ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if(A>B) {
			System.out.println(A);
		} else if (A<B) {
			System.out.println(B);
		} else {
			System.out.println("같은 수 입니다");
		}
		
		
	}
}
