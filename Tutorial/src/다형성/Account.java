package 다형성;

public class Account extends Employee {

	public Account(String name, String job) {
		super.name=name; //생성자메소드를 대신함
		super.job=job;
	}
	
	
}
