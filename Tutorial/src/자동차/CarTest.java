package 자동차;

public class CarTest {

	public static void main(String[] args) {
		Sedan myCar; //변수선언
		Truck truck;
		Bus bus;
		
		myCar=new Sedan("아반테",60,2000); //객체생성
		truck=new Truck("1톤 포토",60,2000,1);
		bus = new Bus("1001번 버스",60,2000,20,1000);
		
		/**Car myCar=new Sedan("아반테",60,2000); 
		Car truck=new Truck("1톤 포토",60,2000,1);
		Car bus=new Bus("1001번 버스",60,2000,20,1000);**/ 
		//==>위로 부를때는 밑에 메소드호출할때 캐스팅해야한다.  
		//ex)(Truck(truck)).getLoad()
		//(Bus(bus).getPassenger()
		
		//메소드호출
		System.out.println(myCar.getCarInfo()+"입니다.");
		System.out.println(truck.getCarInfo()+"이고, 적재량은" +truck.getLoad()+"톤 입니다.");
		
		truck.speedUp(10); //트럭의 속도 10증가
		truck.carryLoad(); //트럭이 짐 +1증가
		System.out.println(truck.getCarInfo()+"이고, 적재량은"+ truck.getLoad()+"톤 입니다.");
		
		System.out.println(bus.getCarInfo()+"이고, 승객수는"+bus.getPassenger()+"명이고, 승차요금은"+((Bus) bus).getFee()+"원 입니다.");
		
		bus.ridePassenger(); //승객한명 증가=>요금 증가
		System.out.println(bus.getCarInfo()+"이고, 승객수는"+ bus.getPassenger()+"명이고, 승차요금은"+((Bus) bus).getFee()+"원 입니다.");
	
	
	}
}
