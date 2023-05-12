package quiz17;

import java.util.Scanner;

public class Calculator {
	
	public int input() throws Exception {
		/*
		 * 1. 스캐너로 정수 2개를 입력을 받아서 두 수의 합을 반환하는 기능
		 * 2. 입력된 값이 정수라면 합계를 반환
		 * 3. 예외가 발생하면, 직접 예외를 생성하고 예외 메시지를 외부로 전달하면 된다
		 * 4. scan.close(); 은 finally에서 처리한다
		 */
		
		Scanner in = new Scanner(System.in);
//		int sum = 0;
		
		try {
			//예외가 발생하면 가장 가까운 catch문으로 이동한다
			System.out.print("정수를 입력해주세요>");
			int a = in.nextInt();
			System.out.print("정수를 입력해주세요>");
			int b = in.nextInt();
//			sum = a + b;
			return a + b;
		} catch (Exception e) {
			throw new Exception("정수를 입력해주세요"); // 예외 생성
			// throw 안쓰고 바로 메세지 출력(내가 한 것)
//			e = new Exception("정수를 입력해주세요");
//			String msg = e.getMessage();
//			System.out.println(msg); 
		} finally {
			in.close();
		}
//		return sum;
	}
}
