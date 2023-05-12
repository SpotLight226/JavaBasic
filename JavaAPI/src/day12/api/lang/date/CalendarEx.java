package day12.api.lang.date;

import java.util.Calendar;

public class CalendarEx {
	
	public static void main(String[] args) {
		
		//Calendar cal = new Calendar(); 추상 클래스이므로 객체 생성 x
		
		// 변수가 객체를 가지고 있는 모형
		// static메서드를 사용해서 객체를 반환하는 모형
		Calendar cal = Calendar.getInstance(); 
		
		System.out.println(Calendar.YEAR); // 1
		System.out.println(Calendar.MONTH); // 2
		System.out.println(Calendar.DATE); // 5
		
 		int year = cal.get(Calendar.YEAR); 
 		System.out.println(year); //년
 		
 		int month = cal.get(Calendar.MONTH);
 		System.out.println(month); // 월 ( 0 부터 시작한다 )
 		
 		int day = cal.get(Calendar.DATE); 
 		System.out.println(day); // 일
 		
 		int hour = cal.get(Calendar.HOUR); // 시
 		int min = cal.get(Calendar.MINUTE); // 분
 		int second = cal.get(Calendar.SECOND); // 초
 		
 		System.out.println(hour + "시 " + min + "분 " + second +"초");
 	}
}
