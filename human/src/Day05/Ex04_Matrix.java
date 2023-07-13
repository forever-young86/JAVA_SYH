package Day05;

import java.util.Scanner;

public class Ex04_Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("M : ");
		int M = sc.nextInt();
		System.out.print("N : ");
		int N = sc.nextInt();
		
		int arr [][] = new int [M][N];
		//입력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();	
			}
		}
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}sc.close();
	}	
}
