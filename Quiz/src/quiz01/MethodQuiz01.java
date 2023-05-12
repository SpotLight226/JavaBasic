package quiz01;

public class MethodQuiz01 {
	
	public static void main(String[] args) {
		
		// <반환타입> <메서드이름> ( <매개변수> ) {
		//	}
		// return이 있을시 값을 받을 수 있다 ( 반환 타입과 같은 새로운 변수를 만들어 값을 받는다)
		method1();
		
		System.out.println(method2("hello"));
		
		System.out.println(method3(1, 4, 3d)); // double 타입은 뒤에 d를 붙인다
		
		System.out.println(method4(3));
		
		method5("bye", 3);
		
		System.out.println(maxNum(10, 9));
		
//		int r5 = abs(-5);  이런 식으로 값을 받아서 출력 가능
//		System.out.println(r5);
		
		System.out.println(abs(-5));
		
		// 퀴즈
		String str = java(3);  // 정수를 매개변수로 받고 String으로 반환한다
		System.out.println(str);
		
	}
	
	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String s) { 
		return s;
	}
	
	static double method3(int i, int j, double d) {
		return i + j + d;
//		double result = i + j + d;
//		return result;
	}
	
	static String method4(int i) {
		return (i%2 == 0) ? "짝수" : "홀수";
		/* 일반적인 if else 문
		String str = "";
		if( i%2 == 0 ) { //짝수
			str = "짝수";
		} else { //홀수
			str = "홀수";
		}
		return str;
		*/
		/* return문을 각 조건에 넣는 식 (가능할 때 사용가능)
		if( i % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
		*/
	}		
	
	static void method5(String s, int i) {
		String str = "";
		for(int j = 0; j<i; j++) {
			str += s;
		}
		System.out.println(str);
		
	}
	
	static int maxNum(int i, int j) {
		return (i>j) ? i : j ;
	}
	
	static int abs(int i) {
		return (i>0) ? i : -i ;
	}
	
	static String java(int i) {
		String str = "";
		String[] arr = {"자", "바"};
		
		for(int j = 0; j<i; j++) {
			str += arr[j%2];
		}
		return str;
	}
}
