package _7상속연습문제;

public class MemberServiceEx { //Q.15

	public static void main(String[] args) {
		MemberService mS = new MemberService();
		
		boolean result = mS.login("hong","12345"); //아이디 hong,password가 12345 일때 로그인.
		if (result) {
			System.out.println("로그인 되었습니다.");
			
			mS.logout("hong");//아이디만 넣으면 로그아웃
			}
		else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
