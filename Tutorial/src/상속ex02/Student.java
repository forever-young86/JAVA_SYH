package 상속ex02;

public class Student {

	String name;
	int grade; //private는 안됨!
	
	public Student() {//기본생성자
		System.out.println("Student 부모 생성자 호출");
	}
	
	public String getName() {return name;}
	public int getGrade() {return grade;}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public String getStudInfo(){//학생정보를 출력해주는 메소드
	System.out.println("Student 클래스의 getStudInfo() 호출");
	return "이름: " + name +" 학년 :" + grade ;
	}
}
