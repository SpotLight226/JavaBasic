package day15.api.io.buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class FastInput {

	public static void main(String[] args) {


		/*
		 * InputStreamReader는
		 * 
		 * 1바이트 데이터를 => 2바이트 기반으로 변경
		 * 
		 */

		//	Reader rd = new InputStreamReader(System.in); // 형변환 
		//	BufferedReader bw = new BufferedReader(rd);

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println(">");
			String name = br.readLine();
			
			System.out.println(name); // 입력받은 결과
			
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
