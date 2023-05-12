package day04;

import java.util.Arrays;

public class MethodEx05 {

	public static void main(String[] args) {
		//배열의 한계점 -> 크기가 정적
		//Stack 
		// 	
		// Last In First Out => LIFO (마지막에 들어간 것은 먼저 빠진다)
		
		push(4);
		push(5);
		push(6);
		push(7);
		System.out.println(Arrays.toString(arr));
		
		pop();
		pop();
		int r = pop(); // return이 있어서 삭제된 데이터도 확인 가능]
		System.out.println("삭제된 데이터: " + r);
		System.out.println(Arrays.toString(arr));
	}
	
	static int[] arr = {1,2,3}; // main클래스가 아닌 class에 생성
	
	//push -> 특정요소를 마지막에 추가
	static void push(int data) { // 정수 data를 받아 작업
		
		//1. 배열의 크기를 +1 한 새로운 배열을 생성
		int[] tmp = new int[arr.length+1];
		//2. arr배열의 요소를 복사
		for(int i = 0; i<arr.length; i++) {
			tmp[i] = arr[i];
		}
		//3. 마지막에 추가
		tmp[tmp.length-1] = data; // tmp = {1,2,3,data}
		
		//4. 원본배열을 tmp로 변경
		arr = tmp; // arr의 주소값을 tmp의 주소값으로 변경
		tmp = null; // 참조변수 tmp 삭제
		
	}
	
	//pop -> 특정요소를 마지막에서 삭제(반환 - 삭제데이터)
	static int pop() {
		
		if(arr.length>0) { // arr의 길이가 0보다 클 떄
			
			//1. 삭제할 데이터를 백업 (마지막 데이터)
			int del = arr[arr.length-1];
			//2. arr보다 -1 인 새로운 배열을 생성
			int[] tmp = new int[arr.length-1];
			//3. 원본배열을 사본으로 복사 (맨마지막 데이터만 제외)
			for(int i = 0; i<tmp.length; i++) { // tmp 길이까지만 돌리기
				tmp[i] = arr[i];
			}
			// 4. 사본배열을 원본 배열로 변경
			arr = tmp; // arr에 tmp의 주소값 대입
			tmp = null; // tmp 삭제

			return del;  // 삭제된 데이터 반환
			}
		return 0;
	}
}