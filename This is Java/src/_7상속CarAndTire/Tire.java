package _7상속CarAndTire;

public class Tire {
	
	//속성
	public int maxRotation; //최대회전수 (타이어수명)
	public int accumulatedRotation; //누적 회전수
	public String location; //타이어의 위치
	
	
	//생성자 (속성의 초기화)
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation; //누적 회전수 1증가
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "tire 수명:" + (maxRotation - accumulatedRotation) + "회");
			 return true;  //정상회전 (누적<최대) 일때 실행
		}
		else {
			System.out.println("***"+ location +"Tire 펑크 ***");
			return false; //펑크(누적=최대)일때 실행
		}
	}

}
