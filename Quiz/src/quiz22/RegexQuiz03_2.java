package quiz22;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


// 선생님
public class RegexQuiz03_2 {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\Users\\wkdqh\\OneDrive\\바탕 화면\\course\\Java\\work\\Quiz\\src\\quiz22\\건담.txt";
		
		try ( BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String str;
			while((str=br.readLine()) != null) {
				String pattern1 = "[0-9]{8}-[0-9]{2}-[0-9]{12,13}"; // 날짜
				String pattern2 = "[가-힣]+ [가-힣]+(점|)"; // 지점 (점|) -> or 점 있거나 없거나
				String pattern3 = "\\[[a-zA-Z가-힣]+\\]"; // 등급
				String pattern4 = "\\d+,*\\d+원"; //가격
				
				Matcher m1 = Pattern.compile(pattern1).matcher(str);
				Matcher m2 = Pattern.compile(pattern2).matcher(str);
				Matcher m3 = Pattern.compile(pattern3).matcher(str);
				Matcher m4 = Pattern.compile(pattern4).matcher(str);
				
				if(m1.find() && m2.find() && m3.find() && m4.find()) {
					String day = m1.group();
					String store = m2.group();
					String grade = m3.group();
					// 내용 패턴을 만들지 않고 m3의 end와 m4의 start 인덱스를 이용해 자른다 // 앞뒤 공백을 자르기 위해 +1, -1
					String detail = str.substring(m3.end()+1, m4.start()-1); // from <= x < to 
					String price = m4.group();
					
					//1행을 Product객체에 저장
					Product p = new Product(day, store, grade, detail, price);
					//Product를 리스트
					list.add(p);
				}
			} // end while
			
			//엑설 쓰기 호출
			createExcel(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main
	
	public static void createExcel( List<Product> list ) {
		// 워크북 객체 생성
		XSSFWorkbook workbook = new XSSFWorkbook();
		// 시트 생성
		XSSFSheet sheet = workbook.createSheet();
		//시트 안에 행
		XSSFRow row1 = sheet.createRow(0);
//		XSSFCell cell = row1.createCell(0);
//		cell.setCellValue("내용");
		// 줄인 것
		row1.createCell(0).setCellValue("날짜");
		row1.createCell(1).setCellValue("지점");
		row1.createCell(2).setCellValue("등급");
		row1.createCell(3).setCellValue("상세");
		row1.createCell(4).setCellValue("가격");
		
		//리스트를 엑셀파일로
		for(int i = 0; i <list.size(); i++) {
			XSSFRow row = sheet.createRow(i+1);
			Product p = list.get(i); // 리스트 안에 객체
			
			row.createCell(0).setCellValue( p.getDay() );
			row.createCell(1).setCellValue( p.getStore() );
			row.createCell(2).setCellValue( p.getGrade() );
			row.createCell(3).setCellValue( p.getDetail() );
			row.createCell(4).setCellValue( p.getPrice() );
			
			
		}
		
		String path = "C:\\Users\\wkdqh\\OneDrive\\바탕 화면\\course\\Java\\work\\Quiz\\src\\quiz22\\건담.xlsx";;
		
		try (FileOutputStream fos = new FileOutputStream(path) )  {
			
			workbook.write(fos);
			
		} catch (Exception e) {
			
		}
	}// createExcel
}
