package test;

public class ScoreTests2 {

	public static void main(String[] args) {
		StudentScore stsc = new StudentScore(); 
		//StudenStore 다른 클래스에서 stsc라는 instance 객체를 만들어서 가져옴
		stsc.inputScore();
		stsc.sum();
		System.out.println(stsc);
	}
}
