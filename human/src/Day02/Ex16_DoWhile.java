package Day02;

import java.util.Scanner;

public class Ex16_DoWhile {

	public static void main(String[] args) {
		int menuNo = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("##### 점심 메뉴판 #####");
			System.out.println("1. 칼국수");
			System.out.println("2. 제육덮밥");
			System.out.println("3. 편의점");
			System.out.println("4. 땅콩");
			System.out.println("5. 갈비탕");
			System.out.println("6. 굶음");
			System.out.println("0. 종료");
			System.out.print("메뉴번호 : ");
	
			
			menuNo = sc.nextInt(); //메뉴번호입력
			
			switch (menuNo) {
				case 1:menuName ="칼국수"; break;
				case 2:menuName ="제육덮밥"; break;
				case 3:menuName ="편의점"; break;
				case 4:menuName ="땅콩"; break;
				case 5:menuName ="갈비탕"; break;
				case 6:menuName ="굶음"; break;
				default:menuName ="도시락"; break;
			}
			// 메뉴번호 유효성 검사 (메뉴에 없는 번호가 나오면 아무것도 출력되지 않음
			if(menuNo >=1 && menuNo <=5) {
				System.out.println(menuName + "(을/를) 먹었습니다.");
			}			
		} while (menuNo !=0); //메뉴 0이 아닐때 계속 돌아감 (종료할때까지)
		System.out.println("메뉴판을 종료합니다.");
		sc.close();
	}
}
