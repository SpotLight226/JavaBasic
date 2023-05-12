package day06.str_ex;

public class MainClass {

	public static void main(String[] args) {
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		String str3 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("==================");
		//str1, str2 는 같은 홍길동을 가르키고 죽솔라
		
		// 같은 파일에서 선언한 홍길동은 같은 객체를 참조하게 된다
		System.out.println(str1 == str2); 
		// 직접 생성명령을 내리거나 다른 클래스에서 넘어온 Stinrg은 다른 주소를 나타낸다
		System.out.println(str1 == str3); 
		
		// null safety (널 안정성) 이 없어서 에러를 발생시킬 수 있다
		if(str1.equals(str3)) { // .equals -> 실제 내용을 비교
			System.out.println("두 문자가 같음");
		}
		// 이런 식으로 작성해주어야 null 에러가 발생하지 않는다
		if(str1 != null && str1.equals(str3)) {
			System.out.println("두 문자가 같음");
		}
		
	
	}
}
