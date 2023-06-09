package day16.api.thread;

public class MainClass {
	
	public static void main(String[] args) {
		
		//1. 작업 스레드로 사용할 객체 생성
		ThreadTest test = new ThreadTest();
		
		//2. 스레드 클래스를 사용해서 작업스레드를 실행
		Thread thread = new Thread(test, "Thread_A");
		thread.start();
		
		try {
			Thread.sleep(5000); // 5 초간 멈춤
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드 종료");
	}
}
