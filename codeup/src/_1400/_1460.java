package _1400;

import java.util.Scanner;

public class _1460 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //정수를 입력 받아 변수 N에 저장
		int arr[][] = new int [N][N]; //N행 N열 
		int k=0; //초기값 선언
		
		//배열 반복하면서  k를 1씩 증가시켜 대입하고, 출력
		for (int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j]= k++;
				
				System.out.print(k+" ");
			}	
			System.out.println();
			
			//배열을 쓰지 않고도 답은 나올수 있다.
		//for (int i=0; i<N; i++) {
			//for(int j=0; j<N; j++) {					
				//System.out.print(k++" ");
				//}	
			//System.out.println();
		//}
		}
	}
}