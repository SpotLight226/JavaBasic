package day15.api.regex;

public class RegexEx01 { // 정규 표현식

	public static void main(String[] args) {
		
		String info = "홍길동 | 30세 |서울시 강남구| 010-1234-5678";
		
		// 전화 번호 형식을 찾아서 ***-****-****을 하자
		
		String pattern = "[0-9]{3}-[0-9]{4}-[0-9]{4}";
		
//		info.replaceAll(정규표현식, 치환될 문자)
		
		//특정 API에 regex가 있다면, 정큐표현식을 적용할 수 있다는 의미
		String result = info.replaceAll( pattern, "***-****-****");
		System.out.println(result);
		
	}
}
