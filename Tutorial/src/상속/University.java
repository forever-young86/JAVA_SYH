package 상속;

public class University extends Student {

	private int courses;

	public University(String _name, int _grade, int _courses) {
		super(_name,_grade);
		this.courses = _courses;
	System.out.println("University 생성자 호출");
	//name = _name;
	//grade = _grade; // 원래 부모것이기때문에 부모것을 불러오면 됨
	//courses=_courses;
	}
	
	public int getCourses() {//학점을 출력하는 메소드
		return courses;
	}
	
	public String getStudInfo(){//student 클래서 가져온 오버라이딩
		System.out.println("Student 클래스의 getStudInfo() 호출");
		return "이름: " + name +" 학년 :" + grade + " 학점:"+getCourses();
	}
}
