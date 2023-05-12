package quiz01;


public class Quiz12 {

	public static void main(String[] args) {
		
		// 1. 1000까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 count(개수)
		int i = 1;
		int count = 0;
		int sum = 0;
		
		while(i<=1000) {
			if(i%4 == 0 && i%8 != 0) {
				count++;
			}
			if(50<= i && i <= 100) {
				sum += i;
			}
			i++;
		}
		System.out.println("4의 배수, 8의 배수 아닌 개수 : " + count);
		System.out.println("50~100까지 합 :" + sum);
		// 2. 50 ~ 100까지의 합계
	}
}
		
