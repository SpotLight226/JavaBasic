package day04;

import java.util.Arrays;

public class MethodEx04 {
	
	public static void main(String[] args) {
		
		//배열을 매개변수로 전달 할 수 있다
		char[] arr = {'a', 'b', 'c', 'd', 'e'};
		
		method01(arr); // 변수명을 매개변수로 전달한다 (주소 값을 전달)
		
		//배열을 반환유형으로 전달 받을 수 있습니다
		
		int[] result = method02(); // int 배열을 반환 받기에 int 배열로 받아야 한다
		System.out.println(Arrays.toString(result));
	}
	
	static void method01(char[] arr) { // <메서드이름> (배열[] 이름(아무거나) )
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " " );
		}
		System.out.println();
	}
	
	// int[]을 반환하는 메서드
	static int[] method02() { // 반환 타입 <메서드 이름>(){ } 
		
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		return arr; // 변수명을 반환한다 (주소 값을 전달)
		
	}
}
