package quiz01;

import java.util.Arrays;

public class MethodQuiz03 {
	
	public static void main(String[] args) {
		
		char[] arr = {'a', 'b', 'c', 'd', 'e'};
		String str = method6(arr);
		System.out.println(Arrays.toString(arr));
		
		int[] arr1 = {1, 2, 3, 4, 5, };
		int result = method7(arr1);
		System.out.println(result);
		
		String[] strarr = method8("abc", "def");
		System.out.println(Arrays.toString(strarr));
	}
	
	static String method6( char[] arr ) { // 문자 배열을 받아 문자열로 출력
		String str = "";
		for(int i = 0; i<arr.length; i++) {
			str += arr[i];
		}
		return str;
	}
	
	static int method7( int[] arr) { // 정수 배열을 받아 합을 출력
		int result = 0;
//		for(int i =0; i<arr.length; i++) {
//			result += arr[i];
//		}
		for(int a : arr) {  // 향상된 for문 (arr 배열이 하나씩 int a로 들어감)
			result += a;
		}
		return result;
	}
	
	static String[] method8(String i, String j) {
		String[] arr = { i, j };
		return arr;
//		return new String[] {i,j};  이렇게도 가능
	}
	
}
