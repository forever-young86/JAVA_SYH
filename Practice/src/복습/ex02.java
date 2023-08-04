package 복습;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		double maxValue =0.0;
		maxValue=n;
		
		if(n2>maxValue) {
			maxValue=n2;}
		if(n3>maxValue) {
			maxValue=n3;}
		
			System.out.println("maxValue : " +maxValue);
	}
		
}

