package arrayex;

import java.util.Scanner;

public class ArrayTest07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr=new int [10];

		System.out.println("10개의 값을 입력해주세요");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+1+"번째 값 :"+arr[i]);
			
		}System.out.println("*************************");
		int sum =0;
		int avg =0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		avg=sum/arr.length; //위에 sum이랑 같이 놓으면 돌아갈때까지 계속 평균을 내므로 밖으로 뺌
		System.out.println("Result");
		System.out.print("합산:"+sum +'/');
		System.out.print("평균:"+avg +'/');
		
		int max =arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max<arr[i])max=arr[i];
		}
		System.out.println("최댓값:" + max);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
	}
		System.out.println();
		System.out.println("==========================");
		
		int temp =0;
		for (int i =0; i <arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}	
		
		}for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
	}
}
}
