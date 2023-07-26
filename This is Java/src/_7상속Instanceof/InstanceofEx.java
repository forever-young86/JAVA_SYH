package _7상속Instanceof;

public class InstanceofEx {

	public static void method1(Parent p) {
		
		if(p instanceof Child){ //Child 타입으로 변환 가능한지 확인
			Child c = (Child) p;
			System.out.println("method1 - Child 타입으로 변환 성공");
		}
		else {
		System.out.println("method1 - Child 타입으로 변환 실패");
		}
	}
	public static void method2(Parent p) { //ClassCastException 발생가능성있음
		Child c = (Child) p; //예외발생
		System.out.println("method2 - Child 타입으로 변환 성공");
	}

	public static void main(String[] args) {
		Parent pA = new Child(); //Child 객체를 매개값으로 전달
		method1(pA);
		method2(pA);
		
		Parent pB = new Parent(); //Parent 객체를 매개값으로 전달
		method1(pB);
		method2(pB); //예외발생
	}
	
	
}
