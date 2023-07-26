package 상속;

public class Student01 extends Person{
	protected String name;
	protected int grade;

	public Student01() {//기본 생성자
		System.out.println("Student 부모 생성자 호출");
	}
	 
	
	public Student01(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String getStudInfo() {
		System.out.println("Student 클래스의 getInfo () 입니다");
		return "이름은: " + name + "학년은: "+grade;
	}
	
}
