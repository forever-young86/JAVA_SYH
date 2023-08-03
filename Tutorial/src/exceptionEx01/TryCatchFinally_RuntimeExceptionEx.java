package exceptionEx01;

public class TryCatchFinally_RuntimeExceptionEx {
	
	public static void main(String[] args) {//(String[] args) args 라는 이름의 문자열 배열을 사용하겠다는 뜻!
											//arguments 입력받아 실행하기: run-run as confiturations -(x)Arguments
		String data1= null; 
		String data2 = null;
		
		try {//예외처리하는 부분 try
		data1= args[0]; //ArrayIndexOutOfBoundsException (실행매개값을 주지 않았음)
		data2= args[1]; 
		}catch(ArrayIndexOutOfBoundsException e) { //예외발생하면 실행되는 부분
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("java TryCatchFinally_RuntimeExceptionEx num1 num2");
			return;
		}
		try {
		int value1= Integer.parseInt(data1);
		int value2= Integer.parseInt(data2);
		int result = value1 +value2;
		System.out.println(data1+ "+" + data2 + "="+result);
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("다시 실행하세요.");
		}
		
		
	}
}
