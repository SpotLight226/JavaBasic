package quiz22;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {
	
	public static void main(String[] args) {
		
		String str = "123123-1231231 GS25(치킨마요) 4,400원";
		String str2 = "123123-1231232 GS25(주부18단) 5,000원";
		
		String pattern1 = "\\d{6}-\\d{7}"; // 숫자 6개-숫자 7개
		String pattern2 = "[A-Za-z]+25";
		String pattern3 = "\\([가-힣0-9]+\\)"; // 메타문자인 ( 를 출력하려면 \\를 붙여준다, 문자 숫자 나눌 필요 없음
		String pattern4 = "[0-9,]+원"; // \\d+,\\d+원
		
		List<String> list = Arrays.asList(str, str2); // 리스트를 만들어 순서대로 값을 찾게 한다
		
		for(String s : list) {
			
			Matcher m1 = Pattern.compile(pattern1).matcher(s);
			Matcher m2 =Pattern.compile(pattern2).matcher(s);
			Matcher m3 =Pattern.compile(pattern3).matcher(s);
			Matcher m4 =Pattern.compile(pattern4).matcher(s);
			
			if(m1.find() && m2.find() && m3.find() && m4.find()) {
				System.out.println(m1.group());
				System.out.println(m2.group());
				System.out.println(m3.group());
				System.out.println(m4.group());
			}
		}
		
	}
}
