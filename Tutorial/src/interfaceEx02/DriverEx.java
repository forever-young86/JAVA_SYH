package interfaceEx02;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //업캐스팅: Vehicle vehicle = bus;
		//Vehicle vehicle로 넣어놨기때문에 자식 객체를 바로 넣어도 호출이 가능하다
		driver.drive(taxi);
		
	}
}
