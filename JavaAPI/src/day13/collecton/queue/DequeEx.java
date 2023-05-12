package day13.collecton.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
	
	public static void main(String[] args) {
		
		//ArrayDeque<Integer> que = new ArrayDeque<>(); // Integer타입을 저장하는 Deque타입 list
		Deque<Integer> que = new ArrayDeque<>(); // 다형성을 이욯아여 Deque타입으로
		
		// 뒤에서 추가
		que.offerLast(1);
		que.offerLast(2);
		que.offerLast(3);
		que.offerLast(4);
		
		System.out.println(que.toString());
		
		// 앞에서 꺼내기
		int n = que.pollFirst(); // 반환하면서 list내 에서도 삭제
		System.out.println("반환된 원소:" + n);
		que.pollFirst();
		que.pollFirst();
		que.pollFirst();
		System.out.println(que.toString());
		
		System.out.println("------------------------");
		
		//앞에서 추가
		que.offerFirst(1);
		que.offerFirst(2);
		que.offerFirst(3);
		que.offerFirst(4);
		System.out.println(que.toString());
		
		//뒤에서 꺼내기
		int n1 = que.pollLast(); // 반환하면서 list내 에서도 삭제
		System.out.println("반환된 원소:" + n1);
		System.out.println(que.toString());
		
		//[4,3,2]
		// list의 get처럼 앞에서 or 뒤에서 값을 확인만 
		System.out.println(que.peekFirst());
		// 큐는 변함이 없다
		System.out.println( que.toString() );
	}
}
