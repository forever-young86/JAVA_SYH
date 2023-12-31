package Day01;

public class Ex10_Char {

	public static void main(String[] args) {
		
		char c1 = 'A'; //문자 리터럴 (작은 따옴표사용)
		char c2 = 65; //아스키코드
		char c3 = '\u0041'; //유니코드
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		int uniCode = c1; //int>char (자동형변환)
		char b = (char) (c2 + 1); // 65 + int(1) = 66 int로 출력되는걸 char로 강제변환하여 출력
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		System.out.println("c4 : " + c4);
		System.out.println("c5 : " + c5);
		System.out.println("c6 : " + c6);
		System.out.println("A의 코드값 : " + uniCode);
		System.out.println("b : " + b);
	}
	
}
