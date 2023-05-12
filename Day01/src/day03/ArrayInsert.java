package day03;

import java.util.Arrays;

public class ArrayInsert {
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		int[] newArr = new int[arr.length + 1]; 
		
		int data = 100; //중간에 추가할 값
		int targetIndex = 2; // 추가 할 위치 -> 10,20,100,30,40,50
		
		// newArr 에 기존 배열(arr)의 값을 옮김
		for(int i = 0; i<arr.length; i++) { // 10,20,30,40,50,0  // 큰 배열에 작은 배열을 담음
			newArr[i] = arr[i]; 
		}
		
		// 마지막 직전까지 돌아야 에러 안 남
		// 배열의 마지막부터 ~ 타게인덱스 까지 옮겨담는 작업
		for(int i = newArr.length-1; i > targetIndex; i--) { //삭제와 달리 넣을 때는 끝부터 밀어줘야 한다
			newArr[i] = newArr[i-1];
		}
		
		newArr[targetIndex] = data;
		
		//기존arr를 newArr로 대체 ( 참조변수 arr의 주소값을 배열 newArr을 가르키게 변경, 리모컨 newArr 을 null로 없애버림)
		arr = newArr;
		newArr = null; // 완전삭제
		System.out.println(Arrays.toString(arr));
		}
	}

