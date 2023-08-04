package Mission;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
			
		for(int i=0;i<N;i++){ //N번 만큼 루프
			for(int j=0;j<N-i;j++){ //N행 기준으로 한개씩 줄어감
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){//*1개 시작으로 2개씩 증가, 별의 개수는 홀수로 만들기 위해 +1함
				System.out.print("*"); 
			}
			System.out.println("");
		} 
}

}
