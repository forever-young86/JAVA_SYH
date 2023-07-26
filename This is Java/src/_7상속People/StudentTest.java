package _7상속People;

public class StudentTest {

	public static void main(String[] args) {
		
		//객체생성
		Student student = new Student("홍길동","123456-123456",1);
		
		System.out.println("name:"+student.name);//속성(부모->자식)
		System.out.println("ssn:"+student.ssn);
		System.out.println("studentNo:"+student.studentNo);
	}
}

