package quiz18;

public class StringQuiz03_1 {
	//회문비교 -> "다시 합창 합시다"
    /*
    1. String palindrome(String)함수는 매개변수로 String 값을 받아, 회문 여부를 검사하는 static 메서드입니다.
    2. 회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장.
    3. ex) 다시 합창 합시다, 다 같은 것은 같다, 아 좋다 좋아 등
    4. 문장은 공백을 포함하여 받을 수 있습니다.
    5. 회문이라면 "회문입니다", 아니라면 "회문이 아닙니다" 를 리턴합니다.
       조건
       빌더의 reverse() 는 금지 입니다.
    
    6. 힌트)
    * 공백은 없어져야 비교가 됩니다. 
    * 회문은 첫글자와, 마지막글자 가 똑같습니다.
    * 
    */
	public static void main(String[] args) {
		System.out.println(palindrome("다시 합창 합시다"));
		System.out.println(palindrome("abcabc"));
		System.out.println(palindrome("다 같은 것은 같다"));
	}
	
	//StringBuilder
	public static String palindrome(String word) {
		word = word.replace(" ", "");
		StringBuilder sb = new StringBuilder(word);
		
		// reverse()를 이용해서 반전(Stringbuider타입) toString()으로 문자열로 변환
		return sb.reverse().toString().equals(word) ? "회문" : "회문 아님";
	}
	
	// 선생님이 하신 거 
//	public static String palindrome(String str) {
//		String s = str.replace(" ", ""); // 공백 제거
//		
//		for(int i = 0; i < s.length()/2; i++) { // 문자열 길이가 짝수든 홀수든 문장의 가운데까지만 가면 된다 
//			
//			char a = s.charAt(i); // 앞에서 시작
//			char b = s.charAt(s.length()-i-1); // 끝에서 부터 시작 -> i가 시작값이 0이라서 -1
//			
//			if(a != b) { // 앞 != 뒤 가 다를 시 "회문 아님" 리턴
//				return "회문이 아님";
//			}
//		}
//		return "회문";
//		
//	}
	
}
