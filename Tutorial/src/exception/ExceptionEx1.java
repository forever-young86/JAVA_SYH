package exception;

import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		try {
		System.out.println("번호");
		num = sc.nextInt();
		} catch (Exception e) {
			System.out.println("예외:"+ e.getMessage());
		}
		
		System.out.println(num);
		
		System.out.println("프로그램 종료");
	}
	
}
