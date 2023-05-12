package day08.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		
		me.setYear(2022); // 값 설정
		int year = me.getYear(); // 값 반환
		System.out.println(year);
		
		me.setMonth(12);
		me.setDay(32);
		me.setSsn("123123-1231231");
		
		int month = me.getMonth();
		int day = me.getDay();
		String ssn = me.getSsn();
		
		System.out.println(month);
		System.out.println(day);
		System.out.println(ssn);
	}
}
