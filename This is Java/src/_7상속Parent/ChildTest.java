package _7상속Parent;

public class ChildTest {

	public static void main(String[] args) {
		Child c = new Child();
		
		Parent p = c; //자식타입 c를 부모타입 P에 넣는다
		//==Parent p = new Child();
		p.method1(); //-부모것
		p.method2(); //-재정의한 자식의 메소드가 호출
		//p.method3(); 호출 불가능
		
		/**Child c = (Child) p; //다운캐스팅(부모를 자식타입으로 소환)
		c.method1(); -부모것
		c.method2(); -재정의한 자식것
		c.method3(); - 자식것 **/
		
		
		
		
	}
}
