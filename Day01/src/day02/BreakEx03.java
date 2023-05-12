package day02;

public class BreakEx03 {
	
	public static void main(String[] args) {
		
//		for(char c = 'A'; c <='Z'; c++) {  // A~Z
//			for(char l = 'a'; l <= 'z'; l++) {
//				
//				System.out.println(c + "-" + l);
//				
//				if(l == 'f') {
//					break;
//				}
//			}  // 소문자(l)이 f일 때 소문자 for문을 빠져나옴
//		}
		
		
		// 고전적인 방법 : 변수를 사용하는 방법
//		boolean flag = false; // 탈출을 위한 변수
//				
//		for(char c = 'A'; c <='Z'; c++) {  // A~Z
//			for(char l = 'a'; l <= 'z'; l++) {
//				
//				System.out.println(c + "-" + l);
//				
//				if(l == 'f') {
//					flag = true; // 탈출을 위해 true (실행 했는지 아닌지 구분할 때 사용)
//					break;
//				}
//			} // end
//			
//			if(flag) break;  // flag가 true라면 break
//		
//		} // end
		
		// label 방식
		
		x: for(char c = 'A'; c <='Z'; c++) {  // x for문
			for(char l = 'a'; l <= 'z'; l++) {
				
				System.out.println(c + "-" + l);
				
				if(l == 'f') {
					break x;  // x라는 이름의 for문을 완전 탈출
				}
			}  // l for 문
		} // c for문
		
	}
		
}

