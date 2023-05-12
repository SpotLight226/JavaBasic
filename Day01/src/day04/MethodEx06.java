package day04;

import java.util.Arrays;

public class MethodEx06 {
	
	public static void main(String[] args) {
		
		// POP 시 앞에서 제거
		// Queue => First In First Out (FIFO - 선입선출)
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		System.out.println(Arrays.toString(arr));
		
		for(int i = 1; i<=5; i++) { // 5번 돌림
			pop();
			System.out.println(Arrays.toString(arr));
		}
		
	}
	
	static int[] arr = { };
	
	static void push(int data) {
		int[] tmp = new int[arr.length+1];
		
		for(int i = 0; i<arr.length; i++) {
			tmp[i] = arr[i];
		}
		tmp[tmp.length-1] = data;
		
		arr = tmp;
		tmp = null;
	}
	
	static int pop() {
		
		// 배열의 앞 요소부터 삭제되도록 처리
		if(arr.length>0) {
		// 1.삭제할 데이터 백업
		int del = arr[0];
		// 2. arr보다 -1인 배열 생성
		int[] tmp = new int[arr.length-1];
		// 3. 원본 배열을 사본으로 복사 (맨 처음 데이터 제외)
		for(int i = 0; i<tmp.length; i++) {
			tmp[i] = arr[i+1]; 
		}
		//
		arr = tmp;
		tmp = null;
		
		return del;
		}
	return 0;
	}
}
