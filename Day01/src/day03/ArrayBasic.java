package day03;

import java.util.Arrays;

public class ArrayBasic {
	
	public static void main(String[] args) {
		//배열 : 교안 4회차
		
		//배열의 선언
		int[] arr;
		
		//배열의 생성
		arr = new int[5];
		
		//배열의 초기화
		arr[0] = 10; // 배열이름[index] = 
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//배열의 모형을 문자열로 출력
		System.out.println(arr); // 주소값 ( 배열의 생성 위치 )
		System.out.println(Arrays.toString(arr)); // Arrays.toString(배열 이름) -> 배열을 문자열로 출력
		
		//배열의 값의 변경
		arr[2] = 100; // index = 0부터 배열의 크기 - 1
		System.out.println(Arrays.toString(arr)); 
		
		//배열의 길이 : <배열 이름> . length
		System.out.println("배열의 길이 : " + arr.length); 
		
		//배열을 선언하는 다양한 방법
		
//		int[] arr;
//		arr = new int[5];
		// 1st
		int[] arr2 = new int[3]; //***
		
		//2nd
		int[] arr3 = new int[] {1,2,3}; // 뒤에 중괄호{}를 열고, 초기화하고 싶은 초기값을 입력
		
		//3rd
		int[] arr4 = {1,2,3}; //***
		
		//배열은 초기값을 지정하지 않으면 기본값으로 자동초기화
		// int는 0, double은 0.0, String = null
	}
}
