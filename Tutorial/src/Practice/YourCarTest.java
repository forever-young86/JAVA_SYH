package Practice;

public class YourCarTest {

	public static void main(String[] args) {
		Car yourCar=new Car("그랜져","검은색",2500,60);//의존관계 :yourCar는 Car에 의존,없으면 사용못함
		//yourCar.setCarName("그랜져");생성자메소드를 만들었기때문에 set메소드를 안써도됨
		String carName=yourCar.getCarName();
		String carColor=yourCar.getCarColor();
		int carSize=yourCar.getCarSize();
		int velocity=yourCar.getVelocity();
		
		System.out.println("차 정보");
		System.out.println(yourCar);//객체이름만 써도, toString을 불러온다
	}

}
