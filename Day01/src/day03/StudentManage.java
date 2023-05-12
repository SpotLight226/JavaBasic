package day03;

import java.util.Scanner;

public class StudentManage {
	
	public static void main(String[] args) {
		// 꺼지는 프로그램
		
		Scanner in = new Scanner(System.in);
		
		//학생정보를 등록할 배열을 while문 바깥에 선언
		String[] nameList = new String[100]; 
		int[] ageList = new int[100]; 
		String[] infoList = new String[100]; 
				
		//고객수 - 정보 입력시 ++
		int count = 0;
		//조회할 위치
		int index = -1;
		boolean run = true;
		
		while(run) {
			
			System.out.println("[정보]고객수: " + count + ", 조회위치: " + index);
			System.out.println("[메뉴]1.추가, 2. 이전정보, 3.다음정보, 4.현재정보, 5.정보수정, 6.정보삭제, 7.종료");
			System.out.println("======================================================================");
			System.out.println("메뉴입력>");
			String menu = in.next();
			
			switch (menu) {
//			case "추가" :  // case 2개 겹치기도 가능
			case "1":
				
				/*
				 * 이름, 성별, 간단한정보 를 입력받아서 각각의 배열에 순서대로 저장될 수 있게 처리합니다
				 * count를 증가합니다 
				 */
				index++;
				System.out.print("이름>");
				nameList[index] = in.next();
				System.out.print("나이>");
				ageList[index] = in.nextInt();
				System.out.print("정보>");
				infoList[index] = in.next();
				count++;
				break;
				
			case "2" :
				
				/*
				 * 이전정보 출력:
				 * 정보출력은 index위치로 출력합니다
				 * 이전 정보출력을 누르면 index를 -1시키고, 해당위치의 정보를 출력
				 * 조건
				 * index가 0보다 작다면, 출력하지 않도록 처리
				 */
				index--;
				if(index<0) {
					System.out.println();
				} else if(nameList[index] == null){
					System.out.println();
				} else {
					System.out.println("이름: " + nameList[index] + " 나이: " + ageList[index] + " 정보: " + infoList[index]);
				}
				
				
				
				break;
			case "3" :
				
				/*
				 * 다음정보 출력:
				 * 다음출력은 index위치로 출력한다
				 * 다음정보출력을 누르면 index를 +1시키고 해당위치에 정보를 출력
				 * 조건
				 * count-1 보다 index가 같거나 크다면, 출력하지 않도록 처리.
				 */
				if(count-1 <= index) {
					System.out.println();
					index++;
				} else {
					index++;
					System.out.println("이름: " + nameList[index] + " 나이: " + ageList[index] + " 정보: " + infoList[index]);
				}
				
				break;
			case "4" :
				
				/*
				 * 현재정보출력
				 * index가 가르키고 있는 위치정보를 출력
				 * 
				 * 조건
				 * 출력할 수 있는 조건을 생각해서 처리(현재 정보)
				 */
				if(index<0) {
					System.out.println();
				} else if(nameList[index] == null){
					System.out.println();
				} else {
					System.out.println("이름: " + nameList[index] + " 나이: " + ageList[index] + " 정보: " + infoList[index]);
				}
				
				break;
			case "5" :
				
				/*
				 * 정보수정
				 * 새로운 이름, 나이, 정보를 입력받아서
				 * 현재 위치를 수정해주면 된다
				 * 
				 * 조건 : 4번과 동일
				 */
				System.out.print("이름>");
				nameList[index] = in.next();
				System.out.print("나이>");
				ageList[index] = in.nextInt();
				System.out.print("정보>");
				infoList[index] = in.next();
				
				break;
			case "6" :
				
				/*
				 * 현재정보 삭제.
				 * 현재 삭제하려는 index부터 ~~뒤에있는 배열요소를 당겨와서 덮어 씌운다
				 * 
				 * 사람수를 감소시켜줘야함-> count--
				 * 
				 * 조건 : 4번과 동일
				 */
				for(int i = index; i<nameList.length-1; i++) {
					nameList[i] = nameList[i+1];
					ageList[i] = ageList[i+1];
					infoList[i] = infoList[i+1];
				}
				count--;
				
				break;
			case "7" :
				//while문의 탈출
				 System.out.println("종료합니다");
				 run = false;
				 break;

			default:
				System.out.println("잘못 입력했습니다");
				break;
			}
			
		}
	}
}
