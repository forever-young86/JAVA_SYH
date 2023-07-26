package 상속poly2;

public class Student {

	String name;
	int grade;
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public Student() {
		System.out.println("Student 부모 생성자 호출");
		}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public String getName() {return name;}
	public int getGrade() {return grade;}
	
	public String getStudInfo(){
	System.out.println("Student 클래스의 getStudInfo() 호출");
	return "이름: " + name +" 학년 :" + grade ;
	}
	
	/**
	public void calcScore(University uni) {
		System.out.println("시험점수 구하기");
	}
	public void calcScore(Elementary e) {
		System.out.println("시험점수 구하기");
	}**/
	
	/*public void calcScore(Student st) { //매개변수를 부모이름으로하면 여러개의 객체에서도 사용가능
		System.out.println("시험점수 구하기");
	}*/
	
	public void calcScore(Student st) { //instanceof 사용
		if(st instanceof University)
			System.out.println("시험점수 구하기");
		else if(st instanceof Elementary)
			System.out.println("시험점수 구하기");
	}
	

}
