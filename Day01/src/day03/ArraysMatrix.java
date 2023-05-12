package day03;

import java.util.Arrays;

public class ArraysMatrix {
	
	public static void main(String[] args) {
		
		//다차원 배열 - 매트릭스
		//배열 안에 배열이 저장되는 형태
		//int[][] = 2차원 배열
		
//		int[] arr = {10,20,30};  1차원 배열
		
		int[] kor = {10,20,30};
		int[] math = {40,50,60};
		int[] eng = {70,80,90};
		
//		int[][] arr = {배열, 배열, 배열};
		int[][] arr = { kor, math, eng}; // 0번쨰 index = kor
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		// 2차원 배열의 사용
		System.out.println(arr[0][0]); // // [세로열] [가로열]
		System.out.println(arr[2][2]);
		
		//2차원 배열을 한번에 생성하고, 초기화하는 방법
		int[][] arr2 = { // 중괄호 안에 중괄호로 초기화
				{10, 20, 30},
				{40, 50, 60},
				{70, 80, 90}
		};
		
		//2차원 배열의 크기만 지정하는 방법
		int[][] arr3 = new int[3][4];  // [세로 행] [가로 열]  -> 크기가 3행 4열인 2차원 배열
		
		//2차원 배열의 모형을 한번에 보는방법
		System.out.println(Arrays.deepToString(arr3)); // 다차원 배열은 Arrays.deepToString(배열이름)
		
		//2차원 배열의 순회 ( 처음부터 끝까지 도는 것 )
		int x = 1;
		for(int i = 0; i<arr3.length; i++) { // 0,1,2 -> 3행
			for(int j = 0; j<arr3[i].length; j++) { // 각 배열의 길이만큼 반복
				arr[i][j] = x++; // 1,2,3,4,5.....
			}
		}
		
		System.out.println(Arrays.deepToString(arr3));
		
	}

}
