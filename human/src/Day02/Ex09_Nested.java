package Day02;

import java.util.Scanner;

public class Ex09_Nested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		System.out.print("학년(1~4) : ");
		int year = sc.nextInt();
		//중첩 if문 (if문 안에 if문)-->권하지 X
		if (year >=4) {
			if (score >=60) {
				System.out.println("합격!");
			}else {
				System.out.println("불합격!");
			}
		}else {
			System.out.println("응시 자격요건에 해당되지 않습니다.");
		}
		//중첩하지 않고 조건 주기
		if (year >=4 && score >=60) {
			System.out.println("합격!");
		}
		if (year >=4 && score< 60) {
			System.out.println("불합격");
		}
		if (year <4) {
			System.out.println("응시 자격요건에 해당되지 않습니다.");
		}
		
		sc.close();
	}
}