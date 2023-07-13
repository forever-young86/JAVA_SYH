package Day02;

import java.util.Scanner;

public class Ex12_01_SwitchBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
				
		switch (num%5) {
			case (0):
			case (1):
				System.out.println("*"); 
// 케이스 0과 1의 결과 값이 같으므로 케이스 0을 생략후 케이스 1로 넘어가 결과값을 출력하게 할수있다.
				break;
			default:
				System.out.println("**");
				break;
		}
		
		sc.close();
	}
}
