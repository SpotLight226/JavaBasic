package day01;

public class VariableScope {

	public static void main(String[] args) {
		
		// 변수는 중괄호 안에서 선언되고, 중괄호 안에서만 유효합니다.
		
//		int num1 =10;
//		int num2 =20;
		
		int num1 = 10, num2 = 20; // 같은 표현
		
		// 여기서 num4를 선언
		
		
		if(true) {
			
			int num3 = num1 + num2; // num1, num2는 위에서 만들어 짐
		
			//여기에서 num4값을 변경하고, 밖에서 사용하고 싶음
			int num4 = 1000;
					
		}
		
//		System.out.println(num3);  // num3은 if문에서 선언되었고 거기서만 사용가능
		int num3 = 100; // num3이 if문장을 벗어나면서 사라젔기 때문에, 동일 이름 사용가능
		int num4 = 1000;
		System.out.println(num4);
									
				
	}

}
