package _7상속DownCasting;

public class ChildEx {

	public static void main(String[] args) {
		Parent p = new Child(); //업캐스팅 - 부모타입의 클래스에 사용된것만 호출가능
		p.field1="data1";
		p.method1(); //Parent-method1() 호출
		p.method2(); //Parent-method2()
		
		/**p.field2="data2";
		 * p.method3(); ==>는 Child 클래스에 있는 속성과 메소드여서 호출 불가능!
		 */
		System.out.println("---------------------");
		Child c =(Child) p; //다운캐스팅 - 자식클래스에 있는 메소드 호출
		c.field1="data1";
		c.field2="yyy";
		c.method1(); //Parent-method1() 호출
		c.method2(); //Parent-method2()
		c.method3(); //Child-method3() -자식 클래스에 있는 메소드 호출
	
	}
}
