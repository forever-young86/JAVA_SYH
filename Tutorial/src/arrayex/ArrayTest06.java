package arrayex;

public class ArrayTest06 {

		public static void main(String[] args) {
			
			int[]arr= {1,3,9,12,15};
			int sum =0;
			int avg =0;
			
			for (int i = 0; i < arr.length; i++) {
				sum+=arr[i];
				avg=sum/arr.length;
			}
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			
			int [] num = new int[10];
			int a=1;//--> 증가해야하므로 변수한개 선언하기.
			
			for (int i = 0; i < num.length; i++) 
				num[i]=a++; //-->1부터 증가시키기위해 a변수를 대입
			
			for (int i = 0; i < num.length; i++) 
			System.out.print(num[i]+" ");
				
			}
	
	
}
