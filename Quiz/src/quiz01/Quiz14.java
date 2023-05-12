package quiz01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz14 {

	public static void main(String[] args) throws IOException {
		
		/*
		 *  1. 가로, 세로 길이 입력을 받습니다
		 *  2. 가로, 세로 길이만큼 사각형을 출력합니다
		 *  3. 윤곽선만 나오게 
		 *  
		 *  1행, 마지막행, 1열, 마지막열
		 */
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("가로>"); // 행
		int a = Integer.parseInt(bf.readLine());
		System.out.print("세로>"); // 열
		int b = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i<b; i++) {
			for(int j = 0; j<a; j++) {
//				if(i == 0 || i == b-1 || j == 0 || j == a-1) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}  합쳐서 한 거
				
				if(i == 0 || i == b-1) {
					System.out.print("*");
				} else {
					if(j == 0 || j == a-1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}