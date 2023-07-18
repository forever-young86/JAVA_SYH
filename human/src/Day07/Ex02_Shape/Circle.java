package Day07.Ex02_Shape;

//Shape 클래스를 구현하시오.
public class Circle extends Shape{

	//멤버변수로 반지름 길이를 저장할 변수를 선언하시오.
	double radius;
	
	
	//생성자를 정의하시오.
	public Circle() {
		this(0);
	}	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	double area() {
		return Math.PI*radius*radius; // 원주율x반지름x반지름
	}
	@Override
	double round() {
		return 2*Math.PI*radius; // 2x원주율x반지름
	}
	
	
	//getter, setter 메소드를 정의하시오.
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//toString() 메소드를 재정의하시오.
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	

}
