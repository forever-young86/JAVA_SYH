package Day07.Ex02_Shape;

//Point 클래스
public class Point {
	//멤버변수 정수형 x,y 선언
	int x,y;

	//기본생성자와 x,y를 매개변수로 갖는 생성자 정의
	public Point() {
		this(0,0);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//toString() 메소드 재정의
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	

}
