package _7상속People;

public class Student extends People {

	public int studentNo; //자식이 쓰는 속성

	public Student(String name, String ssn, int studentNo) {//부모 속성 호출 + 자식의 속성 생성
		super(name, ssn);
		this.studentNo = studentNo;
	}


	
	
	
	
}
