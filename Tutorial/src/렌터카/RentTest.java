package 렌터카;

public class RentTest {
	public static void main(String[] args) {
	String carInfo;
	String resData;
	
	//회원 가입
	Member member = new Member();
	member.regMember();
	
	//렌트카 조회
	Car car = new Car();
	carInfo = car.checkCarInfo();
	car.displayData(carInfo);//부모클래스(Base클래스)의 메소드를 사용
	
	//예약
	Reserve reserve = new Reserve();
	resData = reserve.reserveCar();
	reserve.displayData(resData);//부모클래스(Base클래스)의 메소드를 사용
	}
}
