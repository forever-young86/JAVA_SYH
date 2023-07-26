package 다형성;

public class Research extends Employee {
	private String position;
	public Research(String name, String position) {
		super.name=name; //생성자메소드를 대신함
		this.position=position;
		}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

}
