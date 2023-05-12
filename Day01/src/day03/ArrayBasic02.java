package day03;

public class ArrayBasic02 {
	
	public static void main(String[] args) {
		
		//배열의 순회
		int[] arr = {1,2,3,4,5,6,7,8,9,10}; // 길이가 10
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
//		System.out.println(arr[6]);
//		System.out.println(arr[7]);
//		System.out.println(arr[8]);
//		System.out.println(arr[9]);
		
		//배열의 출력
//		int a = 0; // 배열의 index는 0부터 시작
//		while(a < arr.length) { // 마지막 index는 배열 길이 -1 -> arr.length(arr의 길이) -> 0~10
//			System.out.println("배열의 " + a + "인덱스: " + arr[a]);
//			a++;
//		}
		
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		//배열값들의 합
		int a = 0; 
		int sum = 0;
		while( a < arr.length) {
			sum += arr[a];
			a++;
		}
		System.out.println("배열 값들의 합 : " + sum);
		
		sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("배열 값들의 합(for문) : " + sum);
	}
}
