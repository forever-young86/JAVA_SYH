package interfaceEx02;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다");
	}

	public void checkFare() { //버스에만 있는 기능
		System.out.println("승차요금을 체크합니다");
	}
}
