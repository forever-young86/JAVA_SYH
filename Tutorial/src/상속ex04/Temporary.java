package 상속ex04;

public class Temporary extends Employee {

	private int workedHour; //Temporary만 씀

	public Temporary(String name, int payPerMonth, int commision, int workedHour) {
		super(name, payPerMonth, commision); //불러온것 super를 사용하여 초기화
		this.workedHour=workedHour; //자신의 것 this를 사용하여 초기화
	}
	int calcTotalPay() {//부모메소드에서 호출하여 재정의(오버라이딩)
		//int totalPay=12*payPerMonth+commision+workedHour*2000;

		int temp=super.calcTotalPay();//부모에 썼던 메소드를 temp에 넣고, 다시 불러서 workedHour를 더하여 재정의한다.
		
		int tempTotalPay=temp+workedHour*2000; //*2000은 시급
		//int tempTotalPay=super.calcTotalPay()+workedHour*2000; temp(객체를만들지않고)를 사용하지 않고 직접 super.calcTotalPay()를 넣어 사용해도됨!
		return tempTotalPay;
		
		
	}
	
	
}
