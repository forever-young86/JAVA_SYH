package Practice;

public class MyCarTest {

	public static void main(String[] args) {
	Car myCar;
	myCar=new Car();
	myCar.setCarName("소나타");
	myCar.setCarColor("은색");
	myCar.setCarSize(2000);
	myCar.setVelocity(60);
	
	String carName=myCar.getCarName();
	String carColor=myCar.getCarColor();
	int carSize=myCar.getCarSize();
	int velocity=myCar.getVelocity(); //처음에는 값이 0 (입력값이 없을때)또는 설정한 값이 나옴
	System.out.println(velocity);
	myCar.speedUp(); //속도1이 추가
	myCar.speedUp(); //속도1이 추가
	velocity=myCar.getVelocity();
	System.out.println(velocity); //속도2가 추가된것이 출력
	
	System.out.println("내 차 정보 출력: ");
	//System.out.println("차 이름 : "+carName + "색상 :" + carColor + "배기량 :" + carSize + "현재속도 :"+ velocity +"입니다");
	System.out.println(myCar.toString());
	}

}