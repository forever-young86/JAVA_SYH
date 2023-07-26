package 상속;

public class Student {

	String name;
	int grade; //private는 안됨!
	
	public Student(String name, int grade) {//클래스 생성자를 만들어야 자식클래스에서 super로 불러올수있
		this.name = name;
		this.grade = grade;
	}

	public Student() {//기본생성자
		System.out.println("Student 부모 생성자 호출");
		}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public String getName() {return name;}
	public int getGrade() {return grade;}
	
	public String getStudInfo(){//학생정보를 출력해주는 메소드
	System.out.println("Student 클래스의 getStudInfo() 호출");
	return "이름: " + name +" 학년 :" + grade ;
	}
}
