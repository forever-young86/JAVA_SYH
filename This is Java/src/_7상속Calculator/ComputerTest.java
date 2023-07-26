package _7상속Calculator;

public class ComputerTest {

	public static void main(String[] args) {
		int r= 10;
		
		Calculator c = new Calculator();
		System.out.println("원면적:"+c.areaCircle(r));
		System.out.println();
		
		Computer cp = new Computer();
		System.out.println("원면적:"+cp.areaCircle(r));
	}
}

