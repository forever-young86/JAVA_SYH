package exception;

public class ExceptionArray2 {

	public static void main(String[] args) {
		int [] num =new int[2];
		try {
			num[0] = 100;
			num[1] = 200;
			//num[2]=300;
			num[1]=100/0;
			System.out.println("Hello");
		}catch (ArrayIndexOutOfBoundsException e) {
			
			//System.out.println("예외:"+e.getMessage());		
			e.printStackTrace();//예외발생원인을 출력해준다
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("오류 발생 유무와 무관하게 반드시 수행된다");
		}
		System.out.println("프로그램 종료");
	}
}
