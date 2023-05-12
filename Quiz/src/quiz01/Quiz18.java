package quiz01;

public class Quiz18 {
	
	public static void main(String[] args) {
		
		// 배열 요소들 중 짝수인 값들의 합
		int[] arr = {54, 32, 3, 5, 7, 14, 20};
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("짝수인 값들의 합(for문) : " + sum);
		
		int a = 0;
		int sum1 = 0;
		
		while(a<arr.length) {
			if(arr[a]%2 == 0) {
				sum1 += arr[a];
			}
			a++;
		}
		System.out.println("짝수인 값들의 합(while문) : " +sum );
	}
}
