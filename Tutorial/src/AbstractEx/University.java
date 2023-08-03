package AbstractEx;

public class University extends Student{

	private int courses;

	public University(String name, int grade, int courses, String teacher) {
		super(name, grade, teacher);
		System.out.println("University 생성자호출");
		this.courses=courses;
	}

	public String getStudInfo() {
		System.out.println("University 클래스의 getStudInfo() 메소드 호출");
		return "이름은>> " + name + ", 학년은>>"+ grade + ",신청학점은>>"+courses;
	}
	
	
	@Override
	public String getTeacher() {//상위클래스의 추상메소드를 반드시 구현
		return "지도교수님:"+super.teacher;
	}

	




	
	
	
}
