package 상속ex04;

public class Employee {
	String name;
	int payPerMonth;
	int commision;
	
	public Employee(String name, int payPerMonth, int commision) {
		this.name = name; //속성을 생성하여 본인것 this를 사용하여 초기화
		this.payPerMonth = payPerMonth;
		this.commision = commision;
	}
	
	int calcTotalPay() {
		int totalPay=12*payPerMonth+commision;
		return totalPay;
	}
	
	
}
