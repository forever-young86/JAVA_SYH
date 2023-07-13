package Day02;

public class Ex17_For {

	public static void main(String[] args) {
		//for(1초기식;2조건식;4증감식){3.실행문;}
		
		//1~10까지의 정수 출력
		for (int i = 1; i <=10; i++) {
			System.out.print(i+" ");
		}System.out.println();
		
		//50~100까지 정수 출력
		for (int i = 50; i <=100; i++) {
			System.out.print(i+" ");
		}System.out.println();
		//1~20 까지의 정수 중 짝수만 출력
		for (int i = 2; i<=20; i+=2) {
			//if(i % 2 ==0)
			System.out.print(i+" ");
		}System.out.println();
		//1~20 까지 정수 중 홀수만 출력
		for (int i = 1; i <=20; i+=2) {
			//if(i %2 ==1)
				System.out.print(i+" ");
		}System.out.println();
		
		
		
	}
	
}
