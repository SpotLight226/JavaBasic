package day13.collection.list;

import java.util.Stack;

public class StackEx {
	
	public static void main(String[] args) {
		/*
		 * Stack
		 * Last in First Out(후입 선출)
		 * push(), pop()
		 */
		
		// 다형성 이용하여 이런 식으로도 사용가능
//		List<String> stackList = new Stack<>();  // 단 push, pop을 사용하지 못 한다
		Stack<String> stack = new Stack<>(); // 자동으로 사이즈가 조정된다
		
		// 값의 추가
		stack.push("홍길동");
		stack.push("이순신");
		stack.push("홍길자");
		
		//형태를 문자열로 확인
		System.out.println(stack.toString());
		
		String n = stack.pop();
		System.out.println("pop: " + n);
		System.out.println(stack.toString());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		//에러
//		System.out.println(stack.pop()); // 값이 없으므로 에러
		
		
	}
}
