package Day01;

import java.util.Scanner;

public class Ex07_Circle {

	public static void main(String[] args) {
		
		final double PI = 3.141592; //상수선언 final 자료형+상수명=값;
		Scanner sc= new Scanner(System.in);
		System.out.print("반지름 : ");
		double radius = sc.nextDouble();
		double area = PI * radius * radius;
		
		System.out.println("원의 넒이 : " + area);
		
		
		sc.close();
		
	}
	
}
