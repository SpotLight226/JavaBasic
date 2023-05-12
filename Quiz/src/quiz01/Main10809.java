package quiz01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main10809{
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		// a = 97 ~ z =122
		for(int i = 0; i<arr.length; i++) { // 기본 값이 -1인 알파벳 소문자 배열
			arr[i] = -1;
		}
		
		String S = bf.readLine();
		
		for(int  i = 0; i<S.length(); i++) {
			char ch = S.charAt(i); // 문자열의 위치를 char 변수 ch로 바꾼다
			
			if(arr[ch-'a'] == -1 ) { // ex) w => 119 - 'a' = 119 - 97 = 22
				arr[ch - 'a'] = i;
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}	
}

		
		