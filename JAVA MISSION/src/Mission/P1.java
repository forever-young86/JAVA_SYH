package Mission;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int eng = sc.nextInt();
		System.out.println("영어 점수" +  ":" + eng);
	
		int math = sc.nextInt();
		System.out.println("수학 점수" +  ":" + math);
	
		int java = sc.nextInt();
		System.out.println("자바 점수" +  ":" + java);
	
		int sum = eng + math + java;
		int avg = sum/3;
		
		System.out.println("총점 : " + sum);
		System.out.println("합계 : " + avg);
		
		sc.close();
	}
}