package Day02;

import java.util.Scanner;

public class Ex11_Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학점 : ");
		
		//sc.next() ->(String) 문자열로 가져옴
		//charAt(0) -> 0번째의 문자를 추출
		//toUpperCase():대문자로 변환
		char grade = sc.next().toUpperCase().charAt(0);
		
		switch (grade) {
			case 'A':
				System.out.println("90~100점 입니다");
				break;
			case 'B':
				System.out.println("80~89점 입니다");
				break;
			case 'C':
				System.out.println("70~79점 입니다");
				break;
			case 'D':
				System.out.println("60~69점 입니다");
				break;
			case 'F':
				System.out.println("60점 미만입니다");
				break;
				
			default:
				System.out.println("A~F 사이의 문자를 입력해주세요");
				break;
		}
		
		sc.close();
	}
	
}
