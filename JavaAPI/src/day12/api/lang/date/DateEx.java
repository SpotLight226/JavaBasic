package day12.api.lang.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		// 1970년 1월 1일 0시 기준으로 밀리세컨으로 변경 => 날짜 연산
		long millis = date.getTime();
		System.out.println(millis);
		
		// 현재시간 + 1초
		Date date2 = new Date(System.currentTimeMillis() + 1000);
		System.out.println(date2);
		
		long millis2 = date2.getTime();
		//밀리세컨 이므로 1/1000 하면 초가 나온다
		System.out.println((millis2-millis)/1000); // 시간차(초)
		
		System.out.println("-------------------------------------");
		
		//사람이 보기 편한 날짜로 변환				      			     시 분  초
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		
		String now = sdf.format(date);
		System.out.println(now);
		
	}
}
