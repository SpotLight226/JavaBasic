package day16.api.thread;
// Thread 상속
public class ThreadTest02 extends Thread {

	@Override
	public void run() {
		
		for(int i  = 1; i <= 10; i++) {
			
			System.out.println("쓰레드를 상속받은 클래스:" + i);
			System.out.println("스레드의 이름:" + getName()); // 이름 확인
			
			try {
				// Thread클래스를 상속받았기 때문에 
				sleep(1000);  // 상속받은 sleep 
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
