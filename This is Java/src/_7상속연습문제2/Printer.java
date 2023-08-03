package _7상속연습문제2;

public class Printer {
	
	public static void println(int a) { //Q.17 static을 붙이고, 객체 생성없이 printer 클래스를 호출
		System.out.println(a);
	}
	public static void println(boolean b) {
		System.out.println(b);
	}
	public static void println(double c) {
		System.out.println(c);
	}
	public static void println(String d) {
		System.out.println(d);
	}	
		

	/**int a = 0; Q.16
	public void println(int a) { //Q.16 void를 사용하여 println()메소드 사용
		System.out.println(a);
	}
	public void println(boolean b) {
		System.out.println(b);
	}
	public void println(double c) {
		System.out.println(c);
	}
	public void println(String d) {
		System.out.println(d);
	}**/  
	
	
}
