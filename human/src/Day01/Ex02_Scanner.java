package Day01;

import java.util.Scanner;

public class Ex02_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt(); //정수입력 받는 메소드
		
		System.out.println("a : " + a);
		
		sc.close();
		// close() :  scanner 객체를 메모리에서 해제하는 메소드
	}
	
}
