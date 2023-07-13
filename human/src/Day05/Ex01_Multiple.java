package Day05;

import java.util.Scanner;

public class Ex01_Multiple {
	//3의 배수 (N%3==0) 판단여부 후 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N%3==0) {
			System.out.print("3의 배수입니다.");
		}
		else
			System.out.print("3의 배수가 아닙니다.");
		sc.close();
	}

}
