package Day02;

import java.util.Scanner;

public class Ex22_Continue {

	public static void main(String[] args) {
		//5개의 정수를 입력받고 입력받은 수 중 양수(+)만 합계를 출력하기
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i =0; i <5; i++) {
			int n = sc.nextInt();
			
			//음수일때만 합계에 누적하지 않고 넘어갈때
			if (n<0)
				continue; //0 밑에 음수들은 true로 간주되어 contiue가 실행, 위로 다시 올라간다
			sum+=n;	//sum =sum+n;
		}
		System.out.println("양수의 합 : "+sum);
		sc.close();
	}
	
}
