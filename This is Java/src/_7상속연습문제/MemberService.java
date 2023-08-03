package _7상속연습문제;

public class MemberService { //Q.15 login(), logout()메소드 선언

	boolean login(String id, String password){
		if(id.equals("hong")&&password.equals("12345")) {
			return true; //아이디 hong,password가 12345 일때 true로 리턴
		} else {
			return false;
		}
	}
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
