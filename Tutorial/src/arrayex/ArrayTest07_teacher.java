package arrayex; //선생님 답안

import java.util.Scanner;

public class ArrayTest07_teacher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //class는 알기 쉽게 위에 선언
		
		int []arr=new int [10];
		int max=0, avg=0, sum=0; //어떤 변수든 초기값을 주고 시작!
		System.out.println("10개의 값을 입력하세요.");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+"번째 값:");//(i+1)무조건 문자열로 인식하기때문에 연산이 필요할때는 ()를 사용한다
			arr[i]=sc.nextInt();
			sum+=arr[i];//따로 for문을 빼서 써도 되지만 값이 입력될때마다 합을 바로 구해도 됨
			
			if(max<arr[i]) max=arr[i]; //따로 for문을 빼서 써도 되지만 값이 입력될때 바로 최댓값을 비교하여 구하기	
		}
		avg=sum/arr.length;//평균은 매번 구하는게 아니라, 입력값이 다 들어왔을때 한번만 돌리면 되므로 밖으로 뺌
		System.out.println("결과");
		System.out.println("합계:"+sum+"/평균:"+avg+"/최댓값"+max);//한번에 프린트

		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i]+"\t"); //입력값 그대로 출력
			
		//오름차순 정렬
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {//현재위치에서 한칸 더 간 배열요소를 비교해야하므로 int j = i+1;
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}//end for 표시하면서 하면 편함

		System.out.println("\n==================================");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		
		}
	}
	
}//end class