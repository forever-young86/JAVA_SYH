package Day05;

import java.util.Scanner;

public class Ex02_NumberOfCurrency {

	//입력받은 화폐 금액을 큰 단위부터 계산하여 화폐 매수를 출력
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int arr []= new int[] {50000,10000,5000,1000,500,100,50,10,5,1};
		for(int i=0; i<arr.length;i++) {
		
			int k =0;
			k=input/arr[i];
			System.out.println(arr[i] + "원 = " + k);
			
			input = input%arr[i]; //나머지값을 다시 input으로 넣어서 for문 다시 실행
					
		}
		

	}
	
}
