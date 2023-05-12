package quiz18;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {
		/* 주민번호 검증메서드 masking(String)
		 * 마스킹 메서드는 주민번호값이 매개변수로 들어올 때
		 * 950101-*******로 마스킹 처리하여 리턴하는 static메서드를 만들어주세요.
		 * 
		 * 조건
		 * 1. 문제의 간소화를 위해 생년월일은 정상범위라고 가정합니다.
		 * 2. 13자리가 아니거나, 남,여 가 아니라면 throws처리합니다.
		 * 3. 주민번호는 - 를 포함해서 받을 수 있습니다.
		 * 4. 남, 여에 대한 정보를 출력해줍니다.
		 *  
		 * masking메서드를 만들어주세요 
		 * 검증데이터 950101-1000000 -> 남자
		 * 검증데이터 9501012000000 -> 여자
		 * 검증데이터 950101-5000000 -> 예외
		 * 검증데이터 9501015000000 -> 예외
		 * 검증데이터 950101511111 -> 예외
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("주민번호를 입력해주세요>");
		
		String str = in.nextLine().replace("-", ""); // - 포함시 제거
		
		try {
			masking(str);
		} catch (Exception e) {
			System.out.println("주민번호를 확인해 주세요");
		}
		


	}

	public static String masking(String s) throws Exception {
		if(!(s.length() == 13 || s.charAt(6) != 1 || s.charAt(6) != 2 || s.charAt(6) != 3 || s.charAt(6) != 4)) {
			throw new Exception();
		}
		// chatAt은 문자라서 '0'을 빼준다
		if(s.charAt(6)-'0' == 1 || s.charAt(6)-'0' == 3) {
			System.out.println("남자");
		} else if (s.charAt(6)-'0' == 2 ||s.charAt(6)-'0' == 4){
			System.out.println("여자");
		}
		
		String result = s.substring(0, 6);
		return result + "-*******";
	}
}
