package _7상속연습문제;

public class Member {

	String name;  //Q.13 데이터를 가지고 (이름, 아이디, 패스워드, 나이) 멤버클래스 선언
	String id;
	String password;
	int age;
	
	public Member(String name, String id) { //Q.14 초기화 
		this.name = name; 
		this.id = id;

	}
	
	Member user1 = new Member ("홍길동","hong");
	Member user2 = new Member ("강자바", "java");



}
