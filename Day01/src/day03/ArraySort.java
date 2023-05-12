package day03;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		// 배열 정렬 - 대략 6개
		
		// 선택 정렬
		int[] arr = {5, 23, 1, 43, 200, 100, 40};
		// 1, 23, 5, 43, 200, 100, 40 - 1회전
		// 1, 5, 23, 43, 200, 100, 40 - 2회전
		// 1, 5, 23, 43, 200, 100, 40 - 3회전
		// 1, 5, 23, 40, 200, 100, 43 - 4회전
		// 1, 5, 23, 40, 43, 200, 100 - 5회전
		// 1, 5, 23, 40, 43, 100, 200 - 6회전

		//바깥 반복문은 회전수
		//안쪽 반복문은 비교할 갑
		for(int i = 0; i<arr.length-1; i++) { // 0~5까지 회전
			for(int j = i+1; j<arr.length; j++) { // i의 값에따라서 j도 증가해야 ->  j = i +1
				                                  // 회전은 끝까지 가기에 j<arr.length - i + 1 끝까지
			
//				if(arr[i] > arr[j]) {   // 오름차순
//					int tmp = 0;
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
				if(arr[i] < arr[j]) {   // 내림차순
					int tmp = 0;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}
