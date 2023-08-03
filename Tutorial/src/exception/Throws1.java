package exception;

public class Throws1 {

	public static void main(String[] args) {
		ArrayUtil t = new ArrayUtil();
		try {
			t.call();
		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println("Hello");
		System.out.println("World");
	}
}
