package Practice;

public class Car {

	private String carName;
	private String carColor;
	private int carSize;
	private int velocity;
	
	public Car() {}//만약 오류가 나면, 기본생성자는 만들어놓기
	public Car(String carName, String carColor, int carSize, int velocity) {
		//생성자 메소드
		//this.carName = carName; //set 메소드랑 이름이 같다. 중복이 있으면 안되므로, set 메소드를 이곳에 불러온다
		//this.carColor = carColor;
		//this.carSize = carSize;
		//this.velocity = velocity;
		setCarName(carName);
		setCarColor(carColor);
		setCarSize(carSize);
		setVelocity(velocity);
	}
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public int getCarSize() {
		return carSize;
	}
	public void setCarSize(int carSize) {
		this.carSize = carSize;
	}
	public int getVelocity() {
		return velocity;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carColor=" + carColor + ", carSize=" + carSize + ", velocity=" + velocity
				+ "]";
	}
	public void speedUp() {
		velocity=velocity+1;
	}
	public void speedDown() {
		velocity=velocity-1;
		if(velocity<0)
			velocity=0;
	}
	public void stop() {
		velocity=0;
	}
	public void park() {
		System.out.println("주차합니다.");
	}
}
