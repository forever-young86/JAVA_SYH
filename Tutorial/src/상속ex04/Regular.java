package 상속ex04;

public class Regular extends Employee {

	public Regular(String name, int payPerMonth, int commision) {
		super(name, payPerMonth, commision); //Employee에서 가져온(호출한) 속성을 super를 이용해 초기화
	}
	
	
}
