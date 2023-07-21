package arrayex;

public class ArrayTest02 {

	public static void main(String[] args) {
		int[] num1= {11,22,33,44,55};
		int[] num2= {100,200,300,400,500};
		int[] num3= new int[5];
		int total=0;
		
		//num1 i 값 출력
		for (int i = 0; i < num1.length; i++) {
			System.out.println("num1["+i+"]="+num1[i]);
		}
		System.out.println();
		
		for (int i=0;i<num1.length;i++) {
			num3[i]=num1[i]-num2[i];
		}
		System.out.println();
		
		//num3 = num1 -num2 값 출력
		for (int i = 0; i < num1.length; i++) {
			System.out.println("num3["+i+"]="+num3[i]);
		}
		System.out.println();
		
		//total = num3 i값의 총합 출력
		for (int i = 0; i < num1.length; i++) {
			total+=num3[i];
		}
		System.out.println();
		System.out.println("total="+total);
	}
}
