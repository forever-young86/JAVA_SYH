package 상속poly2;

public class University extends Student {

	private int courses;

	public University(String name, int grade, int courses) {
		super(name,grade);
		this.courses = courses;
	System.out.println("University 생성자 호출");
	
	}
	public University() {
		this("이순신",2,20);
	}
	
	public int getCourses() {
		return courses;
	}
	
	public String getStudInfo(){//오버라이딩 : 기존의 student의 getStudInfo +학점>>"+getCourses()내용추가 재정의
		System.out.println("University 클래스의 getStudInfo메소드호출");
		return "이름>> " + name +" 학년>>" + grade + " 학점>>"+getCourses();
	}
}
