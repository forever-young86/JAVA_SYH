package membertest;

import classex.MemberService;

public class Test {

	public void memberInfo() {
		MemberService.inputData(); //클래스접근
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.memberInfo(); //인스턴스 접급
	}
}
