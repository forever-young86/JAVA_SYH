package test;

import java.util.Scanner;

public class ScoreTests {
	static Scanner sc = new Scanner(System.in); //전역 변수처럼 사용가능
	public static void main(String[] args) {
		//1.과목 점수 입력
		System.out.print("국어 :");
		int kor = intValue();
		System.out.print("수학 :");
		int math = intValue();
		scorePrint(kor,math);
		
		//점수 합계 계산
		sum(kor,math);
		//2.과목점수입력
		//inputScore(); //italic 체는 static 에서 가져왔다는 뜻!
		//과목 점수 출력
		
		//int sum=kor+math;
		//System.out.println("합계 :" + sum);
		
		//int sum = sumReturn(kor,math);
		//System.out.println(sum);//main()메소드에 있는 sum()
		
	}
	
	public static void inputScore() {
		System.out.print("국어 :");
		int kor =sc.nextInt();
		System.out.print("수학 :");
		int math =sc.nextInt();
		//scorePrint(kor,math);
	}
	public static void scorePrint(int kor, int math) {//매개변수를 자료형과 함께 전달
		System.out.println("국어: " +kor);//메소드 또는 {}로 된것은 지역변수로 안에서만 사용, stack에 저장되었다가 사용하고 사라짐
		System.out.println("수학: " + math);
		//System.out.println("합계: " + (kor+math)); //scorePrint()메소드
	}
	
	//입력 객체 sc가 중복이 발생하기 때문에 입력 메소드를 작성한다
	public static int intValue() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
		
	}
	
	//public static int sumReturn(int kor, int math) {
		//return kor+math;*///return 해서 값을 불러올때
		
	public static void sum(int kor, int math) {
		int sum = kor+math;
		System.out.println("합계= " +sum); //sum()메소드
	}
	
	
}
