package Day07.Ex02_Shape;

//shape 클래스 구현 (상속받기)
public class Triangle extends Shape{

	//멤버변수로 가로, 높이 길이를 저장할 변수를 선언
	double width, height;
	
	
	//생성자를 정의하시오.
	public Triangle() {
		this(0,0);
	}
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		return width * height / 2; //가로x세로/2
	}
	
	@Override
	double round() { 
		return width *3; //(정삼각형) : (한변의 길이)x3
	}
	
	//getter, setter 메소드를 정의하시오.
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	//toString() 메소드를 재정의하시오.
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}

	
}
