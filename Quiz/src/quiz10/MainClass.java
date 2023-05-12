package quiz10;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	      System.out.println("----------문제1----------");
	      /* 문제1
	       * 1. 클래스 User를 생성하세요
	       * 2. 멤버변수 name: String ,  int rrn, int age 를 선언후 은닉 처리합니다 (private 지정)
	       * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
	       * 4. main에서 User객체를  생성 후  
	       *    (홍길동, 123123, 20)을 저장 하고 값을 확인하세요.
	       */
	       
	      	// 참조변수 u, User 객체 생성
//	      	User u = new User();
	      	// setter 메서드를 사용해 private 변수에 접근
//	      	u.setName("홍길동");
//	      	u.setRrn(123123);
//	      	u.setAge(20);
	      	
	      	User u = new User("홍길동", 123123, 20); // 생성자를 사용해 접근
	      	
	      	System.out.println("이름: " + u.getName() + ", RRN: " + u.getRrn() + ", 나이: " + u.getAge());
	      	
	      System.out.println("----------문제2----------");
	      /* 문제2
	       * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
	       * 2. 두번째 User객체를 생성하세요. ("김길동", 456456, 30)을 저장.
	       * 3. User배열에 두 객체를 저장하세요.
	        * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
	        * ex) User[] arr = new User[2];
	       */
	      
	      User[] arr = new User[2]; // User 객체를 저장할 User배열
	      
	      // getter /setter 메서드 사용
//	      User u2 = new User();
//	      u2.setName("김길동");
//	      u2.setRrn(456456);
//	      u2.setAge(30);
	      
	      User u2 = new User("김길동", 456456, 20); // 생성자 이용
	      
	      arr[0] = u;  // 참조변수의 주소값을 대입
	      arr[1] = u2;
	      
	   // 향상된 for문 : for( 꺼낼 타입 : 배열 )
//	      for (User user : arr) { 
//			System.out.println(user); // User 타입 출력 -  참조변수와 같다
//			System.out.println("이름: " + user.getName()); // 참조변수와 같으므로 getter메서드 접근가능
//			System.out.println("RRN: " + user.getRrn());
//			System.out.println("나이: " + user.getAge());
//		}
	    
	   // 일반 for문 
	      for(int i = 0; i<arr.length; i++){
	    	  System.out.println(arr[i].getName());
	    	  System.out.println(arr[i].getRrn());
	    	  System.out.println(arr[i].getAge());
	      }
	      
	      System.out.println("----------문제3----------");
	      /* 문제 3
	       * 1. 5개의 크기를 갖는 User배열을 선언하세요.
	       * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
	       * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
	       * 4. while문 안에서 User객체를 User배열에 저장하세요.
	       * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
	       */
	      
	      User[] arr2 = new User[5];
	      int i = 0;
	      Scanner in = new Scanner(System.in);
	      
	      while(i<arr2.length) { // arr2 배열의 길이만큼 돌림
	    	  
	    	  System.out.print(">");
	    	  String name = in.next();
	    	  System.out.print(">");
	    	  int rrn = in.nextInt();
	    	  System.out.print(">");
	    	  int age = in.nextInt();
	    	  
	    	  User user = new User(name, rrn, age); // 객체 1개 x 5
	    	  arr2[i]= user;
	    	  
	    	  i++;
	    	  
	    	  System.out.println(Arrays.toString(arr2));
	      }
	      in.close();
	}
}
