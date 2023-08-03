package interfaceEx02;

public class Driver {

	public void drive(Vehicle vehicle) { //vehicle 구현 객체
		if(vehicle instanceof Bus) { //타입체크후 다운캐스팅 진행
			Bus bus = (Bus)vehicle; 
			bus.checkFare();
		}
		
		vehicle.run(); // 구현객체의 run(); 메소드
		
	}
}
