package _1400;

import java.util.Scanner;

public class _1402 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		//입력
		for (int i = 0; i < N; i++) {
			arr[i]=sc.nextInt();
			
		}
		//거꾸로출력 1)
		//for (int i = N-1; i >=0; i--) {
			//System.out.print(arr[i] +" ");
			
		//}
		//거꾸로출력 2)
		for (int i = 0; i <N; i++) {
			System.out.print(arr[N-i-1] +" ");
			
		}
	}
	
}
