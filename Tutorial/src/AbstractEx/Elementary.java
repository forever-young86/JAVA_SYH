package AbstractEx;

public class Elementary extends Student {

	public Elementary(String name, int grade, String teacher) {
		super(name, grade, teacher);
		System.out.println("Elementary 생성자 호출");

	}

	@Override
	public String getTeacher() {//상위클래스의 추상메소드를 반드시 구현
		return "담임선생님:" + super.teacher;
	}

	
	
	
}
