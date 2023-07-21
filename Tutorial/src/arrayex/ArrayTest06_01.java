package arrayex;

public class ArrayTest06_01 {

		public static void main(String[] args) {
			
			int[]arr= {1,3,9,23,15};
			float ave=0.0f;
			int total=0;
			
			for (int i = 0; i < arr.length; i++) {
				total+=arr[i];//total=total+arr[i];
				
				ave=(float)total/arr.length;//total과 arr.length 모두 int 형이여서 float형으로 바꾸어야함
			}
			System.out.println("합계 : " + total);
			System.out.println("평균 : " + ave);
			
			/////////////////////////////////
			int[] arr2 = new int [10];
			
			int v=1;
			for (int i = 0; i < arr2.length; i++) 
				arr2[i]=v++; //1먼저 대입하고 나서 증가시킴
				
			for (int i = 0; i < arr2.length; i++) 
				System.out.print(arr2[i]+"\t");
			
			}
		/////////////////////////////////////////////
		
}

