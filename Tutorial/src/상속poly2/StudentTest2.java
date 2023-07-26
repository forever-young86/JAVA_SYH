package 상속poly2;

public class StudentTest2 {

	public static void main(String[] args) {
		University u = new University("홍길동",3,23); //자기자신으로 객체생성
		u.calcScore(u);
		Elementary e = new Elementary("java",3);
		e.calcScore(e); //--> 할때마다 맞는 메소드를(매개변수 객체만다르게) 또 만들어야한다, 그래서 부모변수를 넣어놓으면 계속 만들 필요없다
		
	}
}
