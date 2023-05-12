package day03;

import java.util.Arrays;
// 배열을 정렬하는 메서드

public class ArraySort02 {
	
	public static void main(String[] args) {
		
		//버블 정렬 - 가장 느림 ( 큰 값을 뒤로 보낸다)
		int[] arr = {5, 23, 1, 43, 200, 100, 40};
		// 5, 1, 23, 43, 100 , 40, 200 // 1회전
		// 1, 5, 23, 43 , 40, 100, 200 // 2회전
		// 1, 5, 23, 40 , 43, 100, 200 // 3회전
		
		// 회전 수를 반복문으로 나타내는 것이 중요!!!
		
		//바깥 반복문 = 회전수, 안쪽 반복문 = ?
		
//		for(int i = 0; i<arr.length-1; i++) {  // ex arr.ver) 총 6회전 : arr.length(=7)-1 
//			for(int j = 0; j<arr.length-i-1; j++) {
//				if(arr[j]>arr[j+1]) { // j번째와 j번째 바로 다음 값
//					int tmp;
//					tmp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = tmp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		// 아주 유용한 기능***
		Arrays.sort(arr); // 가장 빠른 퀵 정렬 
						  //배열을 오름 차순으로 정렬		
		System.out.println(Arrays.toString(arr));
		
		//*** Arrays.sort();
	}
}
