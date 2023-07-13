package Day02;

public class Ex14_WhileSum {

	public static void main(String[] args) {
		
		int sum =0;
		int a =1;
		
		while(a<=100) {
			sum += a++;
			//sum = sum +a;
			//a=a+1; 을 한줄로 표현
		}
		System.out.println("합계 : " + sum);
	}
	
}
