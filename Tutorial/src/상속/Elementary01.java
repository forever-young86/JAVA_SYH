package 상속;

public class Elementary01 extends Student01 {

	public Elementary01(String _name,int _grade) {
		
		super(_name, _grade);
		System.out.println("인자 2개인 Elementary 생성자 호출");
		//name= _name;
		//grade= _grade;
		
	}
	public Elementary01(String _name, int _grade, String _gender, int _age) {
		super(_name, _grade);
		gender=_gender;
		age=age;
		System.out.println("인자 4개인 Elementary 생성자 호출");
		
		/*name = _name;
		grade = _grade;
		gender = _gender;
		age = _age;*/
	}

}
