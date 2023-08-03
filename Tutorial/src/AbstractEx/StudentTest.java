package AbstractEx;

public class StudentTest {

	public static void main(String[] args) {
		//Student s = new Student(); 추상클래스는 인스턴스 생성이 불가능
		Student st = new University ("홍길동", 3, 22, "차범근"); //추상클래스 타입은 업캐스팅 가능
		Elementary m = new Elementary ("이순신", 2, "홍명보");
		
		System.out.println("학생이름:" + st.name);
		System.out.println(st.getTeacher());
		System.out.println("학생이름:" + m.name);
		System.out.println(m.getTeacher());
	}
}
