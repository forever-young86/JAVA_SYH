package interfaceEx02;

public class VehicleEx {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); //업캐스팅
		
		vehicle.run();
		//vehicle.checkFare(); checkFare();는 버스에만 있는 메소드라 호출 X
		
		Bus bus = (Bus) vehicle; //다운캐스팅해서 불러온다
		//Driver에서 instanceof를 사용해 타입을 확인후 다운캐스팅 진행도 가능
		bus.run();
		bus.checkFare();
	}
}
