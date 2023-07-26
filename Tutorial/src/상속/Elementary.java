package 상속;

public class Elementary extends Student{

	public Elementary(String _name,int _grade) {
	
		super(_name,_grade);
		System.out.println("Elementary 생성자 호출");
		//name = _name; //부모의 생성자를 사용하려면 super를 사용, 그렇지 않으면 직접 매개변수를 초기화시켜야함
		//grade= _grade;
	
	}
}
