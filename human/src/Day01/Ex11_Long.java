package Day01;

public class Ex11_Long {

	public static void main(String[] args) {
		long ln1 = 1000;
		long ln2 = 2100000000;
		long ln3 = 2200000000L; //int로 인식하므로 뒤에 L으로 long을 표현
		
		int max = Integer.MAX_VALUE; //int의 최댓값 final로 선언한 상수는 대문자&스네이크 형으로 씀
		int min = Integer.MIN_VALUE;
		
		System.out.println("int 최댓값 : " + max);
		System.out.println("int 최솟값 : " + min);
			
		
		System.out.println("ln1 : " + ln1);
		System.out.println("ln2 : " + ln2);
		System.out.println("ln3 : " + ln3);
	}
	
}
