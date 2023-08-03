package AbstractEx;

public abstract class Student { //추상클래스

	String name; //속성
	int grade;
	String teacher;
	
	public Student() { //생성자
		System.out.println("Student 생성자 호출");
	}
	

	public Student(String name, int grade, String teacher) {
		this.name = name;
		this.grade = grade;
		this.teacher=teacher;
	}

	
	
	public String getName() {
		return name;
	}


	public int getGrade() {
		return grade;
	}





	public String getStudInfo() {
		System.out.println("Student 클래스의 getStudInfo() 메소드 호출");
		return "이름은: " + name + ", 학년은"+ grade;
	}
	
	public abstract String getTeacher(); //추상메소드
	
}
