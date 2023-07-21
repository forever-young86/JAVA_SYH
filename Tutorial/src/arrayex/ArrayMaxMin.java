package arrayex;

import java.util.Scanner;

public class ArrayMaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [5];
		
		System.out.println("값입력 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt(); //입력한 값을 배열에 저장
			
		}
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {//int i = 1; max,min을 0으로 초기화했기때문에, 1로 설정
			if(max<arr[i])max=arr[i];
			if(min>arr[i])min=arr[i];
		}
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
	}
	
}
