package 복습;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
	
		System.out.println("과목을 선택하세요");
		System.out.println("1.자바 2.JSP 3.AI 4.스프링");
		System.out.println("과목선택 : ");

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String subject ="";
		
		if(n>=1||n<=4) {
			if(n==1) {
				subject="자바";
				//System.out.println("자바");
			}else if (n==2) {
				//System.out.println("JSP");
				subject="JSP";
			}else if (n==3) {
				//System.out.println("AI");
				subject="AI";
			}else if (n==4) {
				//System.out.println("스프링");
				subject="스프링";
			}else {
				System.out.println("1~4번 사이의 메뉴를 눌러주세요");
				return;
			}
				System.out.println("과목="+subject);
		}
		
	}
}
