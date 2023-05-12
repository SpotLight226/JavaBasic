package day15.api.ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); // list 생성
		
		list.add("홍길동");
		list.add("홍길자");
		list.add("이순신");
		list.add("신사임당");
		list.add("홍길동");
		
		//스트림
		Stream<String> stream = list.stream();
//		
//		stream.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		});
		
		stream.forEach( (t) -> System.out.println(t) ); 
	}
}
