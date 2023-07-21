package arrayex;

public class ArrayExchange {

	public static void main(String[] args) {
		int[]num = {1,2,3,4,5,6,7,8,9,10};
		int len = num.length; //배열요소개수
		int[] temp = new int[len]; //temp 교환할 배열요소 보관장소, num의 length (배열요소개수)와 같도록 설정
		
		System.out.println("교환전 배열 내용");
		for (int i = 0; i < len; i++) 
			System.out.print(num[i]+"\t");
	
		for(int i =0; i<len;i++) 
		temp[i]=num[len-1-i];//num[len]=> num[10]-->11번째 //num[len-1]=>num[9]-->10번째
		
		for (int i=0;i<len;i++)
			num[i]=temp[i];//num[i]에 temp[i]를 넣는다
		
		System.out.println("\n"); //\n 줄바꿈
		System.out.println("교환후 배열 내용");
		for (int i=0;i<len;i++)
			System.out.print(num[i]+"\t");
		
		}
		
	}

