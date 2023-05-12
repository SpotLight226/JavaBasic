package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz02 {

	public static void main(String[] args) {
		/*
	       * 1. Date클래스를 이용해서 File경로에 하위폴더로 20200421file 폴더를 생성합니다
	       * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
	       * 3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다.
	       *    \r\n을 적절하게 이용해서 파일 출력을 완료 
	       *    
	       * 4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클립스창에 출력.
	       */
		
		Scanner in = new Scanner(System.in); // 입력
		
		Date date = new Date(); // Date클래스
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd"); 
		String foldername = sdf.format(date); // date를 yyyyMMdd 형식으로
		// 파일명 입력 받음
		System.out.print("txt파일 명 입력>");
		String filename = in.nextLine();
		// 경로
		String folderPath = "C:\\Users\\wkdqh\\OneDrive\\바탕 화면\\course\\file\\" + foldername; // 폴더 경로
		String filePath = folderPath + "\\" + filename + ".txt"; // 파일 경로
		
		// 폴더 생성
		File file = new File(folderPath); // folderPath가 매개변수인 File객체 생성
		if(!file.exists()) {
			file.mkdir();  // 폴더가 없을 때만 생성
			System.out.println("폴더 생성");
		} else System.out.println("이미 폴더가 존재합니다");
		
		/*
		 * Reader rd = new FileReader(경로);
		 * BufferdReader br = new BufferdReader(리더 클래스);
		 * 합쳐서=> BufferdReader br = new BufferdReader(new FileReader(경로);
		 * Writer도 동일 : BufferdWriter bw = new BufferdWriter(new FileWriter(경로);
		 */
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
			BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			
			System.out.println("내용을 입력해주세요");
			//쓰는 작업
			while(true) {
				System.out.print(">");
				String str = in.nextLine();
				
				if(str.equals("그만")) { // "그만"입력시 입력 종료
					System.out.println("입력 종료");
					break;
				} else {
					bw.write(str + "\n"); // 입력받은 값을 쓴다
					bw.flush();	   // 모든 요소를 내보낸다 - 없다면 BufferdWriter를 종료해야 Reader가 작동함 
				}
			}
//			bw.close(); // flush가 없다면, BufferedWriter 닫아주어야 BufferedReader가 작동한다
			
			//읽는 작업
			String result;
			while( (result = br.readLine()) != null) {
				System.out.println(result);
			}
			// 향상된 try-catch문으로 자동으로 finally에 br.close()가 포함되어 있다
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
