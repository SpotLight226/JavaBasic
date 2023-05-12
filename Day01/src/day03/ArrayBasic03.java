package day03;

public class ArrayBasic03 {

	public static void main(String[] args) {
		
		//배열은 크기가 고정
		//크기가 100인 배열에 1~100까지 수를 저장
		int[] arr = new int[100];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		///////////////////////
		// 배열 요소의 문자열 합
		String str = "";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i] + " "; // 문자열의 합 ( int + 문자열(" ") =>  문자열
			
//			System.out.print(arr[i] + " "); // 계속 출력해 나가는 것 -> 자원 많이 씀 
											// str로 모아서 문자열로 출력시 더 빠름
			
 		}
		System.out.println(str);  // 문자열 한번에 출력!!!
	}
}
