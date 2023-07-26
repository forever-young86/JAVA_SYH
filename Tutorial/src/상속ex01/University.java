package 상속ex01;

public class University extends Student {

	private int courses;
	public University() {
		super();
		System.out.println("University 생성자 호출");
		super.name=name;
		super.grade=grade;
	}
	
	public void setCourses(int courses) {
		this.courses = courses;
	}

	public int getCourses() {
		return courses;
	}
	public String getStudInfo(){//오버라이딩안하면, 메인에서 getStudInfo 호출하면 부모것을 호출
		System.out.println("University 클래스의 getStudInfo() 호출");
		return "이름: " + name +" 학년 :" + grade +" 학점: " + getCourses();
		}
}
