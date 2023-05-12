package day12.api.lang.sb;

public class StringBuilderEx {
	
	public static void main(String[] args) {
		
		String str = new String("Java "); // 원래 이렇게 만들어진다
		StringBuilder sb = new StringBuilder("Java ");
		
//		StringBuilder - 싱글 쓰레드에서 사용
//		StringBuffer - 멀티 쓰레드에서 사용
		
		// 차이점
		str = str + "Program"; // 새로운 객체를 생성하여 참조변수 값 변경
		sb.append("program");  // 기존 객체에 추가
		
		System.out.println(str); 
		System.out.println(sb); 
		
		//빌더의 메서드
		//append() - 문자열 끝에 추가
		sb.append("ming");
		System.out.println(sb); 
		
		//insert() - 중간에 추가
		sb.insert(5, "study "); // index 4에 study 가 추가
		System.out.println(sb);
		
		//replace() - 문자열 변경
		sb.replace(5, 10, "book"); // start <= x < end
		System.out.println(sb);
		
		//delete() - 삭제
		sb.delete(5, 10);  // start <= x < end
		System.out.println(sb);
		
		sb.deleteCharAt(0); // 해당 index의 단어 삭제
		System.out.println(sb);
		
		//reverse() - 거꾸로
		sb.reverse(); // 맨 끝의 단어부터 다른 끝쪽 단어끼리 반대, 점차 안으로
		System.out.println(sb);
		
		//toString() - 문자열로 형변환
		//StringBuilder 를 String으로
		String result = sb.toString();
		System.out.println(result);
	}
}
