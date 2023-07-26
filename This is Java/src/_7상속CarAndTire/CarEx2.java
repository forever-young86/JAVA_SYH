package _7상속CarAndTire;

public class CarEx2 {

	public static void main(String[] args) {
		Car2 car = new Car2(); //객체생성
		
		for(int i =1; i<=5; i++) { //Car 객체의 run()메소드 5번 반복 실행
			int problemLocation = car.run();
			
			if(problemLocation !=0) {
				System.out.println(car.tires[problemLocation-1].location+"HankookTire로 교체");
				car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("-------------------"); //1회전시 출력되는 내용구분선
		}
	}
}
;