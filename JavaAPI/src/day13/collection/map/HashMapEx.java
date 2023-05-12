package day13.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		// Map인터페이스를 구현하는 클래스 HashMap
		// key에 대한 타입과 value에 대한 타입을 지정
		// 탐색이 빠르다
		
//		HashMap<Integer, String> map = new HashMap<>();
		Map<Integer, String> map = new HashMap<>(); // 다형성을 이용해 Map타입으로 
		
		//맵에 값을 저장 put(key, value) - 중복 : key X, value O
		
		map.put(1, "홍길동");
		map.put(2, "이순신"); 
		map.put(3, "홍길자");
		map.put(4, "홍길동");
		map.put(5, "신사임당");
		
		//문자열로 맵의 결과 출력
		System.out.println(map.toString());
		System.out.println(map.size()); // map의 객체 개수
		
		//맵에 동일한 키를 저장하면? 값이 변경된다
		map.put(4, "강감찬");
		System.out.println(map.toString());
		
		//맵의 값을 얻기 get(키) : 값을 반환
		String item = map.get(3);
		System.out.println("3번 키에대한 값:" + item);
		
		//key의 유무확인 containsKey(키)
		if(map.containsKey(3)) {
			System.out.println("3번 키가 존재함");
		}
		
		// 맵의 삭제 remove(키)
		map.remove(4); // key 4인 entry 삭제 ( 4, value ) -> valude
		System.out.println(map.toString());
		
		System.out.println("-------------------------");
		
		//맵의 순회
		Set<Entry<Integer, String>> entrySet = map.entrySet(); // map을 set으로 변경
		// 엔트리에는 key, value를 꺼내는 메서드가 있다
		// Entry를 import해주어야 한다
//		Iterator<Entry<String, Integer>> iter = entrySet.iterator(); // 다 쓸 필요는 없다
		
		for( Entry<Integer, String> entry : entrySet ){ // entryset에서 Entry타입을 꺼낸다
			System.out.println( entry.getKey()); // key
			System.out.println( entry.getValue()); // value
		}
		
		System.out.println("-------------------------");
		//방법2
		Set<Integer> set = map.keySet(); // key만 꺼내서 set에 저장
		for(int key : set) { // Set타입 인 set에서 Key를 꺼낸다 
			System.out.println(key); // key
			System.out.println(map.get(key)); // 주어진 key의 value를 반환
		}
		
		System.out.println("-------------------------");
		
		//맵에 객체를 담는 모형
		//Map<Integer, 유저> map2 = new HashMap<>();
		Map<Integer, Object> map2 = new HashMap<>();
	}
}
