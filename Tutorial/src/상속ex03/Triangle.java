package 상속ex03;

public class Triangle extends Shape {

	public void Triangle() {
		System.out.println("Triangle 생성자 호출");
	}
	public void calcArea(float width, float height) {//오버라이딩. 부모클래스 메소드 재정의
		super.area=width*height/2.0f;
	}
}
