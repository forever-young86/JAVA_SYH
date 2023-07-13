package Day02;

import java.util.Scanner;

public class Ex12_SwitchBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int result = num%5;
				
		switch (result) {
			case (0):
				System.out.println("*");
				break;
			case (1):
				System.out.println("*");
				break;
			case (2):
				System.out.println("**");
				break;
			case (3):
				System.out.println("**");
				break;
			case (4):
				System.out.println("**");
				break;
			default:
				System.out.println("**");
				break;
		}
		
		sc.close();
	}
}
