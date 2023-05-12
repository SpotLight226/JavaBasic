package quiz21;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		
		
		//지역명, 규모구분, 연도, 월, 분양가격 -> 1행 x 4800개
		// 1행의 객체를 저장 - List<객체>
		/* 연계데이터(다른 회사에서 매 일정시에 전송되는 데이터)
		 * 
		 * 1. 버퍼리더 이용해서 한줄씩 읽는다
		 * 2. split(",", 5) 를 사용해서 Data객체에 한줄 단위로 저장하고 // ","로 나누고 5개로 나눈다
		 * 3. List<Data>에 하나씩 추가한다 - 제대로 추가되었을 시, size = 4506
		 * 
		 * 4. 람다식을 이용해서 (지역:서울, 4분기중 9~12월, 분양가격: 2000이상) 인 객체만 뽑아서
		 * 	  새로운 리스트로 반환
		 * 
		 */
		
		List<Data> list = new ArrayList<>(); // Data를 저장할 list
		
		String path = "C:\\Users\\wkdqh\\OneDrive\\바탕 화면\\course\\file\\주택도시보증공사_전국 평균 분양가격.csv";
			// 파일의 인코딩형식이 다를 때 사용한다
		try (BufferedReader br = new BufferedReader( new InputStreamReader(new FileInputStream(path), "EUC-KR"));) { // 파일을 읽어서 저장
			
			br.readLine(); // 제목행 넘어감
			
			String tmp;
			
			while((tmp = br.readLine()) != null) {
				String[] str = tmp.split(",", 5); // [지역, 규모구분, 년, 월, 가격]
				// 가격의 , 와 " 를 제거한다
				str[4] = str[4].replace(",", "").replace("\"", "").replace(" ", "").replace("-", "");
				
				str[4] = str[4].equals("") ? "0" : str[4]; // 가격이 "" 일 때, 0으로, 아닐 때, 그대
				// data 객체를 생성
				Data data = new Data(str[0], str[1], str[2], str[3], str[4]); // 지역, 규모구분, 년, 월, 가격
				// list에 추가
				list.add(data);
			}
			
		} catch (Exception e) {
			
		}
		
		List<Data> newList = list.stream().filter( a -> a.getRegion().equals("서울") 
										             && 9 <= Integer.parseInt(a.getMonth()) 
										             && 2000 <= Integer.parseInt(a.getPrice()) )
										  .collect( Collectors.toList() );
		
		System.out.println(newList.size());
	}
}
