package Day02;

import java.util.Scanner;

public class Ex18_Gugu {

	public static void main(String[] args) {
		//구구단 1~9단 원하는 단을 입력하면 구구단 수식 출력가능
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int input = sc.nextInt();
		//입력단x반복변수(1~9)=결과
		for (int i =1; i<=9;i++) {
			int result = input*i;
			System.out.println(input + "*"+ i + "="+ result);
		}
		sc.close();
	}
}
