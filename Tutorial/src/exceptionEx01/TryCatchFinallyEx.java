package exceptionEx01;

public class TryCatchFinallyEx {
	public static void main(String[] args) {
		
		/**
		 * Class clazz = Class.forName("java.lang.String2"); 는 존재하지 않는다.
		 * 그래서 실행하면 ClassNotFoundException 이유의 에러가 뜬다.
		 * try로  에러가 발생했을 곳을 넣고,  catch로 에러 이유의 메소를 만들어 오류난 이유를 출력한다
		 * 오류가 나도 프로그램은 멈추지 않고 돌아간다.
		 **/
		
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
				System.out.println("클래스가 존재하지 않습니다.");//오류가 난 이유를 출력
				//e.printStackTrace(); //오류내용을 출력
		}
		}	
}
