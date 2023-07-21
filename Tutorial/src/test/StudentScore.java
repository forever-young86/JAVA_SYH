package test;

import java.util.Scanner;

//클래스 : 속성과 메소드()
public class StudentScore {
	private int kor,math,total; //클래스에 있는 속성은 모두 쓸수있다.

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}

	/**@Override
	public String toString() {
		return "StudentScore [kor=" + kor + ", math=" + math + ", total=" + total + "]";
	} //속성을 추가한뒤 (sum 추가)에는 투스트링 다시 넣어야함
	**/
	
	@Override
	public String toString() {
		return "StudentScore [kor=" + getKor() + ", math=" + getMath() + ", total=" + sum() + "]";
	} //메소드 이름을 넣어서 결과값 출력, 또는 속성을 변경하여 리턴한 값을 넣는다. #53~55

	public void inputScore() {
		System.out.print("국어 :");
		kor = intValue();//클래스에 있는 속성은 모두 쓸수있다. 그래서 kor 앞에 int를 안써도됨
		System.out.print("수학 :");
		math = intValue();
	}
	/**public void sum() {
		total=this.kor+this.math; //this.kor는 클래스에 선언된 멤버 구성원(속성), int sum은 현재 메소드 안에있는 지역변수
		//System.out.println("합계="+total);
	}**/
	public int sum() {
		total=this.kor+this.math; //this.kor는 클래스에 선언된 멤버 구성원(속성), int sum은 현재 메소드 안에있는 지역변수
		return total;
	}
	public static int intValue() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
}
}