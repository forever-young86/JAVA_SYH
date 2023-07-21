package arrayex;

public class ArrayExchange2 {

	public static void main(String[] args) {
		int[]num = {1,2,3,4,5,6,7,8,9,10};
		int len = num.length;
		int temp = 0;
		
		System.out.println("교환전 배열 내용");
		for (int i = 0; i < len; i++) {
			System.out.print(num[i]+"\t");
		}
	
		for(int i =0; i<len/2;i++) {
			temp=num[i];
			num[i]=num[len-1-i]; //index [i]의 위치를 대입!!
			//ex) num의 index가 6일때 
			//num[6]=num[10-1-6]=>3
			num[len-1-i]=temp;//즉 [6]과 [3]의 자리를 바꿈
		}
		
		System.out.println("\n");
		System.out.println("교환후 배열 내용");
		for (int i=0;i<len;i++) {
			System.out.print(num[i]+"\t");
		
		}
		
	}

}