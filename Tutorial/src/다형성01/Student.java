package 다형성01;

public class Student extends Person{
	protected String name;
	protected int grade;
	public Student() {
		System.out.println("Student 부모 생성자 호출");
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	
	public String getStudInfo() { //나중에 Elementary, University가 사용가능
		System.out.println("Student 클래스의 getStudInfo() 호출");
		if(getGender()!=null&&getAge()!=0)
		return "이름: " + name + ",학년:"+ grade +",성별:"+ gender + ",나이:"+age;
		else
		return "이름: " + name + ",학년:"+ grade;
	}

}
