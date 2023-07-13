package Day05;

import java.util.Scanner;

/*
 * ########### 메뉴판 ##########
 * 1.교촌치킨 - 허니콤보
 * 2.처갓집 - 양념치킨
 * 3.굿후렌드 - 후라이드
 * 4.후라이드잘하는집 - 후라이드
 * 5.보드람 - 후라이드
 * 6.굽네치킨 - 볼케이노
 * 7.BBQ - 황금올리브 반반
 * 0.종료
 * ########## 입력 :
 */


public class Ex05_ChickenMenu {
		
	public static void printMenu() { //메뉴판 출력 메소드
		System.out.println("########### 메뉴판 ##########");
		System.out.println("1.교촌치킨 - 허니콤보");
		System.out.println("2.처갓집 - 양념치킨");
		System.out.println("3.굿후렌드 - 후라이드");
		System.out.println("4.후라이드잘하는집 - 후라이드");
		System.out.println("5.보드람 - 후라이드");
		System.out.println("6.굽네치킨 - 볼케이노");
		System.out.println("7.BBQ - 황금올리브 반반");
		System.out.println("0. 종료");
		System.out.print("##########입력 : ");
	}
	
	//메뉴선택 메소드
	//@param menuNo
	//@return
	public static String selectMenu(int menuNo) {
	//메소드 정의 : 접근지정자 + (static) + 반환타입 + 메소드명 +(매개변수)
		String menuName= "";
		switch (menuNo) {
			case 1:menuName ="교촌치킨 - 허니콤보"; break;
			case 2:menuName ="처갓집 - 양념치킨"; break;
			case 3:menuName ="굿후렌드 - 후라이드"; break;
			case 4:menuName ="후라이드잘하는집 - 후라이드"; break;
			case 5:menuName ="보드람 - 후라이드"; break;
			case 6:menuName ="굽네치킨 - 볼케이노"; break;
			case 7:menuName ="BBQ - 황금올리브 반반"; break;
			default:menuName="(선택안함)"; break;
		}
		return menuName;
	}
	public static void main(String[] args) {
		int menuNo = 0; //메뉴번호
		String menuName = ""; //메뉴이름
		int count =0; //주문개수
		Scanner sc = new Scanner(System.in);
		
		do {
			//메소드호출 
			//메소드명(인자1.인자2);
			//메뉴판 출력
			printMenu();
			
			menuNo = sc.nextInt();
			
			if(menuNo == 0) break; //종료조건
			//메뉴선택
			menuName=selectMenu(menuNo);
			
			//유효성검사 : 메뉴 번호는 0~7까지만 가능
			if(menuNo >= 0 && menuNo <=7) {
				System.out.println(menuName + "(이/가) 주문되었습니다.");
				count++; // 주문한 개수 카운트
			}
			else {
				System.out.println("0~7번 사이의 정수를 입력해주세요.");
			}
			
		}while (true);
		
		System.out.println(count + " 개의 주문을 완료합니다.");

			sc.close();
		}

}
