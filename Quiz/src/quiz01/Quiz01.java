package quiz01;

public class Quiz01 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		// y = y + 10 - x++
		System.out.println(y += 10 - x++); //13 
		System.out.println(x+=2); //5
		System.out.println( !('A' <= c && c <='Z') ); // false == (!(true))
		System.out.println('C'-c); //2  // 연산 시 int보다 작은 타입은 int로 통일
		System.out.println(c+1); //66 // int로 형변환
		System.out.println(c++); //A  // c++ ->대입 후 +1 67 = 'B'
		System.out.println(c);  //B

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
