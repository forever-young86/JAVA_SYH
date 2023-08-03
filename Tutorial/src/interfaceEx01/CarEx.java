package interfaceEx01;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		
		myCar.run(); //네바퀴 모두 한국타이어가 굴러갑니다.
		
		/**
		myCar.frontLeftTire = new KumhoTire(); //금호타이어로 교체
		myCar.frontRightTire = new KumhoTire(); **/
		
		myCar.tires[0] = new KumhoTire(); 
		myCar.tires[1] = new KumhoTire();
		
		myCar.run(); //frontLeft, frontRight는 금호타이어, 나머지는 한국타이어가 굴러갑니다.

		

		
	
		
	}
}
