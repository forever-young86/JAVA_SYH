package 자동차;

public class Bus extends Car {

	private int passenger; //버스 승객수
	private int fee; //버스요금
	
	public Bus(String carName, int velocity, int carSize, int fee, int passenger) {
		System.out.println("Bus 생성자 호출");
		super.carName=carName;
		super.velocity=velocity;
		super.carSize=carSize;
		this.passenger=passenger;
		this.fee=passenger*fee; //승객수*탑승요금을 초기화
	}

	public int getPassenger() {
		return passenger;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	
	public void ridePassenger() {//승객을 태우는 기능 메소드
		if(passenger>0) {
			passenger++;
			fee+=1000;
		}
	}
	
}
