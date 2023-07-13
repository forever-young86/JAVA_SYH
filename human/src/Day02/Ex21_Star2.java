package Day02;

import java.util.Scanner;

public class Ex21_Star2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N : ");
		int N = sc.nextInt();
		
		for (int i = 1; i <=N; i++) {
			for (int j = N; j >=i; j--) { //int j =1; j<=N-i+1;j++ 와 같음
				//N=5-> i=1 -> j=5
				//		i=2 -> j=4
				//		i=3 -> j=3
				// i가 1일 되면 j 조건은 멈춤
				System.out.print("*");
			}System.out.println();
		}
		
		sc.close();
	}
}
