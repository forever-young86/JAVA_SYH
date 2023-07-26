package 상속poly;

public class Elementary extends Student{

	public Elementary(String name,int grade, int point) {
		super(name,grade);
	}
	public Elementary(String name,int grade) {
		super(name,grade);	
	}
	public Elementary() {
		this("이순신",3);
	}
	
}
