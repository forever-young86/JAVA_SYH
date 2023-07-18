package Day07.Ex02_Shape;

//shape 클래스를 구현 (상속받기)
public class Rectangle extends Shape{
	
	//멤버변수로 가로, 높이 길이를 저장할 변수를 선언
	double width, height;
	
	//생성자를 정의
	public Rectangle() {
		this(0,0);
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
	double area() {
		return width * height; 	//가로 X 세로

	}

	@Override
	double round() {
		return (width * height) *2;  //(가로 X 세로) X2
	}

	//getter, setter 메소드정의
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	//toString() 메소드 재정의
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	
	
	
	
	
}
