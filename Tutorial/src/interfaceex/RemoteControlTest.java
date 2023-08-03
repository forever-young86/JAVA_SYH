package interfaceex;

public class RemoteControlTest {

	public static void main(String[] args) {
		/**
		RemoteControl rc = new Television(); //부모이름(인터페이스)으로 상속받은 객체만듦==>업캐스팅!
		System.out.println(rc); //interfaceex.Television@1eb44e46 (rc라는 한개의 이름으로 두개의 객체를 만든다)
		rc.turnOn();
		rc.setVolume(100);
		Television tv=(Television) rc; //자식클래스에 있는 기능을 쓰려면 다시 다운캐스팅한다
		tv.print();
		
		rc = new Audio(); //업캐스팅
		System.out.println(rc); //interfaceex.Audio@379619aa (rc라는 한개의 이름으로 두개의 객체를 만든다)
		rc.setVolume(-100);
		Audio au = (Audio) rc;//다운캐스팅
		au.amp();
		
		rc = new SmartTelevision();
		System.out.println(rc);
		rc.turnOn();
		rc.setVolume(2);
		Searchable sc = new SmartTelevision(); // RemoteControl,Searchable 두개를 상속받았기때문에 따로따로 인스턴스 객체를 생성해야한다
		//그래야 해당 클래스에 대한 메소드를 호출할수 있다.
		sc.search("naver.com"); **/
		
		RemoteControl rc= null;
		rc=new Television();
		rc.setMute(true);
		
		rc=new Audio();
		rc.setMute(true);
	}
}
