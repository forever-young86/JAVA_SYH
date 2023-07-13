package Day03;

import java.util.Scanner;

public class Ex02_Max {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int arr [] = new int[N];//N을 입력 받은만큼 arr에 넣겠다
		//int max =0; //작은수와 비교하여 큰수가 max가 됨
		int max = Integer.MIN_VALUE; //int 타입의 최소값 -21억 부터 비교가능
		
		for (int i =0; i <N; i++) { //결국 N은 arr[갯수]와 같음
			System.out.print("");
			arr[i] =sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) { //arr[i]가 max 보다 클때 true 이므로 밑에 실행
			   max = arr[i];
			}
		}
		System.out.println("최댓값 : " +max);
		sc.close();
}
}
