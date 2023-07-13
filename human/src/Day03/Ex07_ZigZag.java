package Day03;

import java.util.Scanner;

public class Ex07_ZigZag {

	
	public static void main(String[] args) {
		//NxN 구조의 배열에 1부터 시작하여 1씩 증가하는 값 대입
		//1행부터 왼쪽에서 오른쪽 순서로 값 대입
		//행이 바뀔때마다 순서를 반대로 대입하는 2차원배열
		
		//1.N을 입력받는다
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
				
		//2.NxN 구조의 배열 생성
		int arr[][]=new int[N][N];
		
		//3.초기값인 1인 변수 k를 선언
		int k = 1;
		int sw = 1;
		//4.배열 반복 하여 출력
		//바깥쪽 반복은 : i -행
		for (int i = 0; i < arr.length; i++) {		
			//안쪽 반복문 : j -열
			// i) 정방향으로 값 대입 (+1 증가)
			if (sw == 1) {
				for (int j = 0; j < N; j+=sw) {
				arr[i][j] = k++;
				}
				//sw = -1;
			}	
		
			else {
				//ii) 역방향으로 값 대입 (-1 감소)
				for (int j = N-1; j >=0; j+=sw) {
					arr[i][j] = k++;
				}	
				//sw =1;
				
			}
			sw=sw*(-1); // else 가 끝나고 실행되야함!
			
		}for (int i = 0; i <arr.length;i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
		
	}

}