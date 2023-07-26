package 상속poly2;

public class Elementary extends Student{

	public Elementary(String name,int grade, int point) {
		System.out.println("Elementar 생성자 호출");
		super.name=name;
		super.grade=grade;
	}
	public Elementary(String name,int grade) {
		System.out.println("Elementay 생성자 호출");
		super.name=name;	
		super.grade=grade;

	}
	public Elementary() {
		this("이순신",3);
	}
	
}
