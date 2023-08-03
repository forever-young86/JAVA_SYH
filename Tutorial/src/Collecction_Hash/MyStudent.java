package Collecction_Hash;

public class MyStudent {

	private String name;
	private int grade;
	
	public MyStudent() {
		this("이순신",2); //this 는 다른생성자 메소드를 호출하는것!
	}

	public MyStudent(String name, int grade) {
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

	@Override
	public String toString() {
		return "학생이름은 " + name + ", 학년은 " + grade + "학년입니다.";
	}
	
	
	
	
	
	
}
