package quiz01;

import java.util.Arrays;

public class Quiz21 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 1~9까지 숫자 중 절대 중복되지 않는 숫자 3개를 추출
		 *    arr를 랜덤하게 10번 섞어줍니다
		 *    0~2번째 값을 새로운 배열로 옮겨 담아보자     
		 */
		
		int[] arr = { 1,2,3,4,5,6,7,8,9};
		int tmp = 0;
		
		for(int i = 0; i <11; i++) {
			int b=  (int)(Math.random()*9);
			int a = (int)(Math.random()*9); /// 0~8
			tmp = arr[a];
			arr[a] = arr[b]; 
			arr[b] = tmp;
		}
		System.out.println(Arrays.toString(arr)); 
		
		int[] arr1 = new int[3];
		
		for(int i = 0; i<arr1.length; i++) { 
			arr1[i] = arr[i]; 
		}
		
		System.out.println(Arrays.toString(arr1));
	}

}
