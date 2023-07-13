package Day02;

public class Ex02_PlusMinusOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		
		c = ++a + b;
		System.out.println("c = " + c);//a에서 먼저 증감하고 연산함
		System.out.println("a = " + a);
		
		int x = 10;
		int y = 20;
		int z;
		
		z = x++ + y;
		System.out.println("z = " + z);
		System.out.println("x = " + x); //위에서 z를 계산하고 후위연산 함
	}
	
}
