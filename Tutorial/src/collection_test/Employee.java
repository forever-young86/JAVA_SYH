package collection_test;

public class Employee {

	private int ssn;
	private String name;
	private MyDate birthDate;
	private double salary;

	//ArrayList 사용 생성자 메소드 
	public Employee(String name, MyDate birthDate, double salary) {
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	
	//map사용 생성자 메소드
	public Employee(int ssn, String name, MyDate birthDate, double salary) {
		this.ssn = ssn;
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return name + birthDate + salary;
	}
	
	
}
