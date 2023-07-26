package 상속;

public class Person {

	String gender;
	int age;
	public Person() { //기본생성자
		System.out.println("Person 생성자 호출");
	}
	
	public Person(String gender, int age) {
		this.gender = gender;
		this.age = age;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [gender=" + gender + ", age=" + age + "]";
	}
	
	
	
	
	
}
