package day03;

public class ArraySearch {
	
	public static void main(String[] args) {
		
		//큰 값 찾기
		int[] arr = { 54, 23, 12, 76, 99, 1, 2, 3 };
		
		// for문
//		int max = arr[0];
		
//		for(int i = 0; i<arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//		}
		
		int max = 0; // 큰값을 저장할 변수
		int i = 0;
		while(i < arr.length) {
			
			if(max < arr[i]) {
				max = arr[i];
			}
			i++;
		}
		
		System.out.println("가장 큰 값은 : " + max);
		
	}
}
