package Day03;

import java.util.Scanner;

public class Ex03_Min {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int arr[] = new int [N];
		int min = Integer.MAX_VALUE;
		
		for (int i=0; i<arr.length;i++) {//입력받은 N = 결국 만들어진 arr의 요소 길이(갯수)와 같다
			arr [i] = sc.nextInt();
		}
		for (int i=0; i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("최솟값 : " + min);
		sc.close();
	}
}
