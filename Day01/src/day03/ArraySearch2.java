package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch2 {
	
	public static void main(String[] args) {
		
		// 이진탐색 - 반을 분할해서 찾아가는 방법.*****
		// 조건 - 순서대로 정렬
		/*
		 * 1. 포인터(start, end) 를 처음과 끝에 2개를 배치
		 * 2. 중간값을 구함
		 * 3. 중간값이 찾는 값인지 확인
		 * 4. 중간값이 찾는 값보다 크다면, end를 중간값-1 로 내림  mid > find
		 * 5. 중간값이 찾는 값보다 작다면, start를 중간값+1 로 올림 mind <find
		 * 
		 * ex)  5를 찾을 때,
		 * 		arr[start + end / 2] -> 확인
		 * 		arr[start] ~ arr[(start+end)/2 -1] // 중간값이 5보다 크므로 end = 중간값-1
		 * 		arr[start] ~ arr[(start + ((start+end)/2-1))]
		 * 		..... 해서 나올 때 까지 
		 * *** 찾는 값이 없다면 start와 end가 언젠가 교차되는 지점이 생긴다(같은값을 가리킴)
		 * 
		 */
		
		int[] arr = {1,3,5,10,20,30,50,80,100};
		
		System.out.print("찾을 값>");
		Scanner in = new Scanner(System.in);
		
		int find = in.nextInt(); // 찾을 값 입력
		
		int start = 0;
		int end = arr.length-1; // 마지막 index = 8 == 길이 -1 
//		int count = 0; // 회전수 확인
		
		while(start <= end) {
//			count++; // 한번 돌아갈 때마다 회전수 증가
			
			//중간값
			int mid = (start + end) / 2; // 초기값은 4가 됨
			
			if(arr[mid] == find) {
//				System.out.println("회전수: " + count);
				System.out.println("찾은 값은: " + mid + "번째 존재함");
				break;
			}
			//찾을 값이 중간값보다 큰 경우 -> mid < find
			if(arr[mid] < find) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			
		}
		
		// 찾는 값 없을 때  == 즉, 두 지점이 교차했다면 찾는 값 없음
		if(start > end) {
			System.out.println("찾는 값은 없습니다");
		}
		
		
		// 위와 똑같은 기능을 해주는 메서드
		// 이진탐색 - 찾은 위치를 알려줌 , 찾을 값이 없다면 음수를 알려준다
		System.out.println( Arrays.binarySearch(arr, 50) ); // (배열이름, 찾을 값) -> 찾을 값을 찾아주는 메서드
		System.out.println( Arrays.binarySearch(arr, 102)); // ** 찾을 값이 없다면 음수를 알려줌
	}

}
