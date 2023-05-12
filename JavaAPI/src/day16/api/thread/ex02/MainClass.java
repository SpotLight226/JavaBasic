package day16.api.thread.ex02;

public class MainClass {
	
	public static void main(String[] args) {
		
		//1개의 객체를 N개의 쓰레드로
		ThreadTest thread = new ThreadTest(); // 작업스레드로 사용할 객체 생성
//		
		// 1개의 객체를 각각 다른 스레드에 지정
		Thread th1 = new Thread(thread, "Thread_A"); // 스레드 클래스를 사용해서 작업 스레드실행
		Thread th2 = new Thread(thread, "Thread_B");
		th1.start();
		th2.start();
		
		//2개의 각각 돌리는 경우
		// 각각 객체 생성
//		ThreadTest thread01 = new ThreadTest();
//		ThreadTest thread02 = new ThreadTest();
//		
//		Thread th1 = new Thread(thread01, "Thread_A");
//		Thread th2 = new Thread(thread02, "Thread_B");
//		th1.start();
//		th2.start();
	}
}
