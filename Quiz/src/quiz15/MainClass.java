package quiz15;

public class MainClass {
	
	public static void main(String[] args) {
		
		IBag i = new MyBag();
		
//		i.insert("사자");
//		i.print();
//		i.insert("기린");
//		i.print();
//		i.delete("기린");
//		i.print();
		i.insert("tv");
		i.insert("tv");
		i.insert("tv");
		i.insert("radio");
		i.insert("radio");
		
		i.print();
		System.out.println("인덱스 위치:" + i.search("radio"));
		
		System.out.println("삭제:" + i.delete("radio"));
		i.print();
	}
}
