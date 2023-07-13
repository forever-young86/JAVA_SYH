package Day05;

import java.util.Scanner;

public class Ex02_Ex {

	//입력받은 화폐 금액을 큰 단위부터 계산하여 화폐 매수를 출력
	public static void main(String[] args) {
		//1. 필요한 변수 선언
		int input, count, money=50000;
		// int input; 입력금액
		// int count; 화폐매수
		// int money=5000; 화폐단위 : 가장 큰 화폐단위 부터 시작
		
		//2. (입력금액) 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		input = sc.nextInt();
		
		//3-1. 화폐 매수 계산
		int sw = 1; // 마지막 sw=sw*(-1);를 넘겨 받아 하려면 while 밖에서 받아야 적용이 됨
		//boolean sw = true;
		
		//4. 3번의 과정 반복
		while (money>=1) {
			// 화폐 매수 = 입력금액 / 화폐단위
			count = input/money;
			
			//5.3-1에서 구한 화폐 매수를 출력
			System.out.println(money+ "\t:"+ count+ "개");
			
			//3.2. 잔액계산
			//잔액 =입력금액 / 화폐단위
			input = input % money;
			
			//3.3 화폐단위 변환
			// (화폐단위) = (화폐단위) /5  ex)50000/5=10000원으로 넘어가게함
			// (화폐단위) = (화폐단위) /2  ex)10000/2=5000원으로 넘어가게함
			
			if (sw ==1) {
				money = money/5;
			}
			else {
				money = money/2;
			}
			sw=sw*(-1); // sw =!sw;
	
		}sc.close();
	
	}
}