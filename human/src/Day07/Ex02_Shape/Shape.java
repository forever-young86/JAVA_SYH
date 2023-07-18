package Day07.Ex02_Shape;
	
	//추상클래스 정의
public abstract class Shape {
	
	//멤버변수로 Point 객체 선언
	Point point;
	
	/**추상메소드 :{} 블록없이 메소드 원형만 정의하고, 
	*자식 클래스에서 반드시 오버라이딩 해야만 사용할수 있는 메소드
	*형식 : abstract + 반환타입 + 메소드명 + (매개변수);**/
	//넓이와 둘레를 구하는 메소드 원형을 정의
	abstract double area();  //넓이
	abstract double round();  //둘레

	//getter,setter 메소드 정의
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	
}
