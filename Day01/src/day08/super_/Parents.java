package day08.super_;

public class Parents {
	
	String mother;
	String father;
	
//	Parents() {  // 기본생성자 : 컴파일러가 자동 생성
//		super();
//	} 
	
	Parents(String mother, String father){
		this.mother = mother;
		this.father = father;
	}
	
	String info() {
		return "name: " + mother + ", name: " + father;
	}
}
