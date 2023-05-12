package day12.api.util.arrays;

import java.util.Arrays;

public class ArrayEx {
	
	public static void main(String[] args) {
		
		int[] arr = {3,1,2,5,6,7 };
		
		//정렬
		Arrays.sort(arr);
		//배열을 문자열로
		System.out.println(Arrays.toString(arr));
		
		//탐색 -> 이진탐색 - 선행조건: 정렬!! -> 하기전에 .sort로 오름차순 정렬
		int result = Arrays.binarySearch(arr, 4); // (배열, 찾고싶은 값) -> 있으면 인덱스번호, 없으면 음수
		System.out.println(result); // arr에 4가 없으므로 -4
		//음수가 나오면 값은 없음
		
		int result2 = Arrays.binarySearch(arr, 5);
		System.out.println(result2); // 값에 대한 위치 반환
		
		//배열 복사
		int[] newArr = Arrays.copyOf(arr, arr.length); //복사할 배열, 새로운 배열의 길이
		System.out.println(Arrays.toString(newArr));
		System.out.println(arr == newArr); // 깊은복사(완전히 새로운 배열객체) - 주소값이 다르다
		
		int[] newArr2 = Arrays.copyOf(arr, arr.length * 2);
		System.out.println(Arrays.toString(newArr2));
		//배열 크기 지정복사
		int[] newArr3 = Arrays.copyOfRange(newArr, 1, 3);
		System.out.println(Arrays.toString(newArr3));
		
		//배열의 원소비교 - 각 배열의 요소 값들을 비교한다
		if(Arrays.equals(newArr, arr)) {
			System.out.println("배열의 원소가 정확히 일치함");
		}
		
		
	}
}
