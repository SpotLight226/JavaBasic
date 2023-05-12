package day03;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		//삭제의 개념 - 배열은 삭제가 없다 == 뒤에 있는 요소로 덮어씌운다
		// 뒤에 있는 요소를 앞으로 당김 -> 1,2,3,4,5 에서 3을 삭제 -> 1,2,4,5,5 
		// for문 회전은 index부터 돌게
		// length-1까지 반복하게 만들어서 
//		for(int i = 삭제할index; i<arr.length-1; i++){
//			arr[i] = arr[i+1];
//		}
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] newArr = new int[arr.length-1]; // 삭제한 후 복사할 새로운 배열
		
		int index = 5; //삭제할 위치
		
		// 삭제하는 for문
		for(int i = index; i<arr.length-1; i++) { // 단순 length 시 10위치를 바꿀 때쓰는 11위치가 없어서 error 발생
			arr[i] = arr[i+1];
		}
		
		// 실제로 지워진 것 처럼 :
		// 크기가 작은 새로운 배열을 만들어서 새로 담음 
		for(int i = 0; i<newArr.length; i++) {
			newArr[i] = arr[i];
		}
		// 기존 arr을 지움
		arr = newArr;
		newArr = null;
		
		System.out.println(Arrays.toString(arr)); // 크기를 줄여서 실제로 지워진 것으로 보이는 배열
		
	}
}
