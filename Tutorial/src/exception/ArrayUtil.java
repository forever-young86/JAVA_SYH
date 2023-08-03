package exception;

public class ArrayUtil{

	public void call() throws Exception { //throws를 사용해 메인으로 예외처리를 넘김
		System.out.println("call 메서드 시작"); 
		 int [ ] num = new int[2]; 
		 num[0] = 1; 
		 num[1] = 2; 
		 num[2] = 3; //예외 발생
	
		 System.out.println("call 메서드 종료");
	}
}
