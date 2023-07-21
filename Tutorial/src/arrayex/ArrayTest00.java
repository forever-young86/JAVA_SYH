package arrayex;

public class ArrayTest00 {
	 public static void main(String[ ] args) {
		 int [ ] num;
		 int total=0;
		 num=new int[10];

		 for(int i=0; i<num.length;i++){
		 num[i]=i+1;
		 }
		 for(int i=0; i<num.length;i++){
		 total+=num[i];
		 }
		 System.out.println("num 배열 요소값들의 합은 "+total);
		 total=0;
		 for(int i=0; i<num.length;i++){ 
			 //짝수번째 배열 요소합 구하기, i%2==1일때 짝수, i%2==0일때 홀수
			 //ex)index [1]%2=나머지 1이므로 값호출 ->index[1]=2 (짝수)
			 //ex)index [2]%2=나머지 0이므로 값호출 ->index[2]=3 (홀수)
		 if(i%2==1)
		 total+=num[i];
		 }
		 System.out.println("num 배열의 짝수 번째 요소값들의 합은"+total);
		 }
	
}
