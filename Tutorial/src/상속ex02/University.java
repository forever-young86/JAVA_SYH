package 상속ex02;

public class University extends Student {
	public int courses;
	
	public University(String name, int grade, int courses) {
		super();
		this.name=name;
		this.grade=grade;
		this.courses=courses;
	}
	public University() { //위에 생성자를 재호출
		this("이순신",2,20);
	}
	public int getCourses() {
		return courses;
	}
	
}
