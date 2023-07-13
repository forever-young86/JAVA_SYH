package Day04.Ex01_Student;

public class Student {
	//학생의 속성 : 이름, 나이, 학번, 전공 --> 변수
	String name;
	int age;
	String stdNo;
	String major;
	
	//생성자
	//-기본생성자
	public Student() {
		this("이름없음",1,"00000000","없음");
	}
	
	//-모든 매개변수를 포함하는 생성자
	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}
	
	
	//메소드:공부하기
	//접근지정자 반환타입 (static) 메소드명 (매개변수) {}
	//* void : 반환타입 없음을 지정하는 키워드
	// 반환 탕비 void면, return을 생략해도 된다. 써도됨-->return;
	public void study(String subject) {
		System.out.println(subject + "(을/를) 공부합니다.");
	}
	
	//메소드:성적 평균 구하기
	public double getAverage(int score1, int score2) {
		double average = 0.0;
		//평균 = 합계 / 개수
		average = (double)(score1 + score2)/2;
		return average;
	}
	
	//메소드 오버로딩
	public double getAverage(int score1, int score2, int score3) {
		double average = 0.0;
		//평균 = 합계 / 개수
		average = (double)(score1 + score2+ score3)/3;
		return average;
	}
	
	public double getAverage(int[] score) {
		double average = 0.0;
		//평균 = 합계 / 개수
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
		}
	//for (int i : scores) {
			//sum += i;
	//} foreach문으로 더 간결하게 구할수도 있다.
		
		average = (double) sum/score.length;
		return average;
	}
	
	

	
	
}
