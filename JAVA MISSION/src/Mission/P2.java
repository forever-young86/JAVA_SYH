package Mission;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		System.out.println( "입력" );
		
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		
		int i = 1;
		while (i<=N) {
			if (i%2==1) {
				sum1 +=i;
				System.out.print(i);
				if( i == N-1 )
					System.out.print("=");
				else
					System.out.print("+");
			}
			i++;
		}
		System.out.println(sum1);
		
		i = 1;
		while (i<=N) {
			if (i%2==0) {
				sum2 +=i;
				System.out.print(i);
				if( i == N )
					System.out.print("=");
				else
					System.out.print("+");
				
			}
			i++;
		}
		System.out.println(sum2);
	}
		
}
		
