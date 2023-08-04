package Mission;

import java.util.Scanner;

public class P2_01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int sum1 =0;
		int sum2 =0;

		//홀수반복
		for(int i = 1; i < N; i +=2) {
			sum1 += i;
			System.out.print(i);
			if (i == N-1)
				System.out.print("=");
			else
				System.out.print("+");
		}
		System.out.println(sum1);
		
		//짝수반복
		for(int i = 2; i <= N; i +=2) {
			sum2 += i;
			System.out.print(i);
			if (i == N)
				System.out.print("=");
			else
				System.out.print("+");
		}
		System.out.println(sum2);
		
		//약수 (N%i==0)
		for (int i = 1; i <= N; i++) {
			if(N%i == 0)
				System.out.print(i+" ");
		}
		
		
		
	}

}
