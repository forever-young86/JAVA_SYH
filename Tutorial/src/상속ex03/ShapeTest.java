package 상속ex03;

public class ShapeTest {

	public static void main(String[] args) {
		int width=10, height=20;
		
		Rectangle rec=new Rectangle();
		rec.calcArea(width, height);
		rec.printArea();
		
		Triangle tri = new Triangle();
		tri.calcArea(width, height);
		tri.printArea();
	}
}
