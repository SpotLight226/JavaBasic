package quiz22;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class RegexQuiz03 {

	public static void main(String[] args) {

		/*
		 * 1. 버퍼리더를 사용해서 건담.txt 를 한줄씩 읽어들인다
		 * 2. 정규표현식을 이용해서 날짜, 지점, 등급, 내용, 가격 을 정규표현식으로 패턴분석
		 * 	  Product객체에 저장하고, 리스트에 저장
		 * 
		 * 3. 외부라이브러리 (POI) - 자바에서 엑셀파일 xlsx 형태로 파일을 쓸 수 있도록하는 기능
		 * 	  하나의 시트에 각 행테이터를 엑셀 파일로 출력
		 */
		List<Product> list = new ArrayList<>();


		String path = "C:\\Users\\wkdqh\\OneDrive\\바탕 화면\\course\\work\\Quiz\\src\\quiz22\\건담.txt";
		String exelPath = "C:\\Users\\wkdqh\\OneDrive\\바탕 화면\\course\\work\\Quiz\\src\\quiz22\\건담.xlsx";;
		
		try ( BufferedReader br = new BufferedReader(new FileReader(path));
			  FileOutputStream fos =  new FileOutputStream( path))  {
			// 주석처리는 하나로 합친 것
			
//			String parttern = "(\\\\d{8}-\\\\d{2}-\\\\d{12,13})([가-힣]{2,5} [가-힣]+)(\\\\[[a-zA-Z가-힣]{2,4}\\\\])((?<=\\\\]\\s)[0-9a-zA-Z가-힣/?\\s\\\\(\\\\).]*(?<!\\s[0-9원]+))([0-9,]+원) ";

			String str; 

			while((str = br.readLine()) != null ) {
				String pattern1 = "\\d{8}-\\d{2}-\\d{12,13}"; // 날짜
				String pattern2 = "[가-힣]{2,5} [가-힣]+"; // 지점
				String pattern3 = "\\[[a-zA-Z가-힣]+\\]"; // 등급
				// 후방탐색으로 "]_" 뒤의 문자열부터, '원'이 포함된 가격을 제외한 문장 
				String pattern4 = "(?<=\\]\s)[0-9a-zA-Z가-힣/?\s\\(\\).]*(?<!\s\\d+,*\\d+원)"; // 내용
				String pattern5 = "\\d+,*\\d+원"; //가격
				
//				Matcher m = Pattern.compile(parttern).matcher(str);
				Matcher m1 = Pattern.compile(pattern1).matcher(str);
				Matcher m2 = Pattern.compile(pattern2).matcher(str);
				Matcher m3 = Pattern.compile(pattern3).matcher(str);
				Matcher m4 = Pattern.compile(pattern4).matcher(str);
				Matcher m5 = Pattern.compile(pattern5).matcher(str);
				
//				if(m.find(0) && m.find(1) && m.find(2) && m.find(3) && m.find(4)) {
//					Product p = new Product(m.group(0), m.group(1), m.group(2), m.group(3), m.group(4));
//					list.add(p);
//					
//				}
				if(m1.find() && m2.find() && m3.find() && m4.find() && m5.find()) {
					Product p = new Product(m1.group(), m2.group(), m3.group(), m4.group(), m5.group());
					list.add(p);
				}
				
				// 빈 workbook 생성
				XSSFWorkbook workbook = new XSSFWorkbook();
				// 빈 Sheet생성
				XSSFSheet sheet = workbook.createSheet("건담");
				// 컬럼 너비 설정
				for(int i =0; i<list.size(); i++) {
					sheet.autoSizeColumn(i);
					sheet.setColumnWidth(i, sheet.getColumnWidth(i)+1000);
				}
				// 셀 너비 넓게
				sheet.setColumnWidth(0, sheet.getColumnWidth(0)+5000);
				sheet.setColumnWidth(1, sheet.getColumnWidth(0)+1000);
				sheet.setColumnWidth(2, sheet.getColumnWidth(0));
				sheet.setColumnWidth(3, sheet.getColumnWidth(0)+6000);
				sheet.setColumnWidth(4, sheet.getColumnWidth(0)+500);
				
				//---------------------------------------------
				// 첫째 줄에 날짜, 지점, 등급, 내용, 가격 을 입력 
				XSSFRow row1 = sheet.createRow(0); // 행
//				XSSFCell cell = row1.createCell(0); // 열
//				cell.setCellValue("날짜");
				row1.createCell(0).setCellValue("날짜");
				row1.createCell(1).setCellValue("지점");
				row1.createCell(2).setCellValue("등급");
				row1.createCell(3).setCellValue("상세");
				row1.createCell(4).setCellValue("가격");
				
				for(int i = 0; i<list.size(); i++) {
					XSSFRow row = sheet.createRow(i+1);
					Product p = list.get(i);
					
					row.createCell(0).setCellValue(p.getDay());
					row.createCell(1).setCellValue(p.getStore());
					row.createCell(2).setCellValue(p.getGrade());
					row.createCell(3).setCellValue(p.getDetail());
					row.createCell(4).setCellValue(p.getPrice());
				}
				
				workbook.write(fos);
				workbook.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}
}
