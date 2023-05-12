package day08.encap.good;	

public class MyDate {

	private int year;
	private int month;
	private int day;
	private String ssn;
	
	/*
	 * 은닉된 변수에 접근할 때, 미리 생성 해놓은
	 * getter / setter 를 사용한다
	 * 
	 * setter메서드
	 * 1. 값을 저장하는 용도의 메서드
	 * 2. 접근제어자는 public으로 선언하고 이름은 (set + 멤버변수명)
	 */
	
	public void setYear(int year) { // 카멜표기법 -> set + year
		
		if(year < 1900 || year > 2023) {
			System.out.println("잘못된 값을 입력했습니다");
			return;
		}
		this.year = year;
	}
	
	/*
	 * getter메서드
	 * 1. 은닉변수의 값을 조회하는 메서드
	 * 2. 접근제어자는 public, 반환유형이 있고, 이름은 ( get + 멤버변수명 )
	 */
	// 기본 모형
	public int getYear() { // get + year 
		return year;
	}
	
	/*
	 * 1. month, day, ssn에 getter/setter생성
	 * 
	 * month - 1~12월까지만 저장
	 * day - 1~31일 까지만 저장
	 * ssn - 하이픈은 제거하고 13자리가지만 저장가능 replace(), length()
	 */
	// month
	public void setMonth(int month) {
		if(month <1 || month >12) {
			System.out.println("잘못된 값 입력");
			return;
		}
		this.month = month;
	}
	
	public int getMonth() {
		return month;
	}
	// day
	public void setDay(int day) {
		if(day < 1 || day >31) {
			System.out.println("잘못된 값 입력");
			return;
		}
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}
	// ssn
	public void setSsn(String ssn) {
//		if(ssn.replace("-", "").length() != 13) {
		ssn = ssn.replace("-", "");
		if(ssn.length() != 13) {
			System.out.println("잘못된 값 입력");
			return;
		}
		this.ssn = ssn;
	}
	
	public String getSsn() {
		return ssn;
	}
}
