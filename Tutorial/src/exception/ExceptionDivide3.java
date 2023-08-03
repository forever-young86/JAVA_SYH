package exception;

public class ExceptionDivide3 {

	public static void main(String[] args) {
		int num2=0;
		try { //try 안에 문제 있는 코드를 넣는다
			int num1 = 100;
			num2 = num1 / 0; //{}안에 있으면 지역변수이므로, 밖으로 (int num2=0;) 빼주어야함
			num2 = num1 * 100;

		}catch (ArithmeticException e) { //예외명을 알면 catch에 넣어준다, 모르면 그냥 Exception이라고 하면됨
			System.out.println("0으로 나눌수 없다"); //예외처리후 나오는 메세지
		}
		System.out.println(num2);

		System.out.println("프로그램 종료");
	}
}
