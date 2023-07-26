package 자동차;

public class Truck extends Car{

	private int load;//적재화물량

	public Truck(String carName, int velocity, int carSize, int load) {
		System.out.println("Truck 생성자 호출");
		super.carName=carName; 
		super.velocity=velocity;
		super.carSize=carSize;
		this.load=load;
	}

	public int getLoad() {
		return load;
	}

	public void setLoad(int load) {
		this.load = load;
	}
	
	public void carryLoad() {//화물을 운반하는 기능메소드
		if(load>0) {
			load++;
		}
		else {
			load=0;
		}
	}
	
}
