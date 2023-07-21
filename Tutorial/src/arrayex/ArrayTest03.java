package arrayex;

public class ArrayTest03 {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		int len = num.length;
		int[] temp =new int [len];
		
		System.out.println("교환 전 배열 요소 값");
		
		for (int i = 0; i <len; i++) {
			System.out.print(num[i]+"\t"); //배열 요소 값 출력
		}
		for (int i = 0; i < len; i++) {
			temp[i]=num[len-1-i];			
			//temp에 배열요소개수-1-index[i]를 뺀 값을 넣기
			//tem[0]=num[10-1-0]==>num 배열에 index [9]번째 숫자 10
			//tem[1]=num[10-1-1]==>num 배열에 index [8]번째 숫자 9
		}
		for (int i = 0; i < len; i++) {
			num[i]=temp[i];
		}
		System.out.println("\n 교환 후 배열 요소 값");
		for (int i = 0; i < len; i++) {
			System.out.print(num[i]+"\t");
			
		}
	}
	
}
