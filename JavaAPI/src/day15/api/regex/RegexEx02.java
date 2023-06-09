package day15.api.regex;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {

	public static void main(String[] args) {
		
		/*
		 * [0-9]{2, 4} 숫자 중 2~4개 연속된 형태
		 * [0-9]{3} : 0~9 숫자 중 3개가 연속된 형태
		 * [A-Z]+ : 대문자 한개이상
		 * [a-zA-Z]? : 알파벳 0~1개 나오는 경우
		 * [가-힣]* : 한글이 0회 이상 ( 0 포함)
		 * 
		 * 정규표현식에 속하지 않은 문자는 그냥 사용할 수 있다
		 * ex) - , % # 
		 * [0-9]{3}-[0-9]{4} : - 은 정규표현식에 속하지 않음 => 숫자3개-숫자4개 나오는 형태
		 * 
		 * 정규표현식에 포함되는 문자를 쓰고 싶다면 \\
		 * \\+  \가 한개 이상  -> \ 뒤의 문자를 쓸 수 있다
		 * \?+ ?가 한개 이상
		 * 
		 * 정확히 일치하는 문자
		 * \?. : 정확히 ?에 일치하는
		 * [0-9]{3}원 : 000원 형식을 찾는다 => 0~9 숫자 중 3개가 연속되고, 뒤에 원 이 붙어있는 형태 
		 * 
		 * \\d [0-9]와 같은 의미 - 숫자
		 * \\w [a-zA-Z_] 와 같은 의미
		 * \\s 공백을 나타냄
		 * 
		 */	
		
		String info = "홍길동/주소/02-123-4567/aaa123@naver.com";
		String info2 = "이순신/주소/010-1234-1234/bbb123@naver.com";
		
		// 전화번호 형식 // \\d = [0-9]
		String pattern1 = "\\d{2,3}-\\d{3,4}-\\d{4}"; // 숫자가 2~3개-숫자가 3~4개-숫자가 4개
		
		// 이메일 형식 (숫자문자@문자.문자)
		String pattern2 = "[a-zA-Z0-9]+@[a-z]+.[a-z]+"; // 문자,숫자가 하나 이상@소문자 하나 이상 . 소문자 하나 이상
		
		// 패턴을 컴파일 -> Pattern은 static 메서드 
		// compile(패턴) 
		Pattern p1 = Pattern.compile(pattern1);
		Pattern p2 = Pattern.compile(pattern2);
		
//		p1.matcher(문자열)
		Matcher m1 = p1.matcher(info); // 전화번호 패턴
		Matcher m2 = p2.matcher(info); // 이메일 패턴
		
		// find() - 일치하는 부분이 있다면 true
		// start() - 일치하는 부분의 첫번째 인덱스
		// end() - 일치하는 부분의 마지막 인덱스
		// group() - 일치하는 부분의 추출
		
		while(m1.find()) { // 패턴이 여러번 나오면 순서대로 찾는다
			System.out.println("첫번째 인덱스:" + m1.start());
			System.out.println("마지막 인덱스:" + m1.end());
			System.out.println(m1.group());
		}
		
		while(m2.find() ) {
			
			System.out.println("첫번째 인덱스:" + m2.start());
			System.out.println("마지막 인덱스:" + m2.end());
			System.out.println(m2.group());
		}
		
		if(m2.find() ) { // 패턴이 가장 처음 발견되는 1번을 찾는다
	
			System.out.println("첫번째 인덱스:" + m2.start());
			System.out.println("마지막 인덱스:" + m2.end());
			System.out.println(m2.group());
		}
		
		System.out.println("------------------------------------------------------------");
		// 리스트 안의 요소들에서 순서대로 값을 찾는 형태
		List<String> list = Arrays.asList(info, info2); // list를 빠르게 만드는 방법
		System.out.println(list.toString());
		
		
		for(int i = 0; i < list.size(); i++) {
			
			String str = list.get(i);
			
			//패턴생성
//			Pattern x = Pattern.compile(pattern1);
//			Matcher y = x.matcher(str); // 문자열에 대한 패턴 생성
			
			// 2줄을 하나로
			Matcher x = Pattern.compile(pattern1).matcher(str); // 1번째 패턴 적용
			Matcher y = Pattern.compile(pattern2).matcher(str); // 2번째 패턴 적용
			
			if(x.find() && y.find()) { // 둘 다 찾았을 떄
				System.out.println(x.group());
				System.out.println(y.group());
				
			}
			
			
		}
		
	}
}
