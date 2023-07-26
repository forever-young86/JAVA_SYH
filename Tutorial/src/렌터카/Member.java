package 렌터카;

//import 렌터카.Base; -->다른패키지에 생성된것을 불러올때는 import + 패키지네임 + 클래스네임 

public class Member extends Base{
	private String id;
	private String password;
	private String name;
	private String address;
	private String phoneNum;
	
	//새로운 회원 등록을 하는 메소드
	public void regMember() {
		System.out.println("회원 등록시간:"+showTime());
		System.out.println("회원 가입합니다.");
	}
	//기존 회원의 정보를 조회
	public String viewMember() {
		System.out.println("회원 조회시간:"+showTime());
		return "조회된 회원 정보";
	}
	//기존 회원의 정보를 수정
	public void modMember() {
		System.out.println("회원 수정시간:"+showTime());
		System.out.println("회원 정보를 수정합니다.");
	}
	
	//기존 회원의 정보를 삭제
	public void delMemeber() {
		System.out.println("회원 삭제시간:"+showTime());
		System.out.println("회원 정보를 삭제합니다.");
	}
	
}
