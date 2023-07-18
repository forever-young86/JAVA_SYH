package classex;

import java.util.Scanner;

public class MemberTest {
	//속성(변수), 메소드
	public static void main(String[] args) {
		/*Member member = new Member();
		System.out.println("1번: "+ member.toString());
		
		//member.name="java";
		//System.out.println(member.name);
		//String name = "자바";
		//System.out.println(name);
		
		///////////////////////////////////
		member.setId("자바...");
		member.setPwd("자바");
		System.out.println("2번 :"+ member);//toString()을 생략해도 적용하여 출력가능
		String id=member.getId();
		System.out.println(id);
		
		//member.setPwd("123456");
		//String pwd=member.getPwd();
		//System.out.println(pwd);
		
		member.setName("김휴먼");
		String name = member.getName();
		System.out.println(name);
		
		member.setEmail("123@gmail.com");
		String email = member.getEmail();
		System.out.println(email);
		
		Member member2=new Member("java","java");
		String id2=member2.getId(); //id가 이미 쓰였으므로 같은 이름으로 쓰일수 없음
		System.out.println(id2);
		
		String pwd2=member2.getPwd();
		System.out.println(pwd2);
		System.out.printf("id2=%10s, pwd2=%-10s\n",id2,pwd2);//printf : 문자자리를 10자리로 출력
		/////////////////////////////////////
		Address address = new Address("서울", "영등포구","영등");
		Member mem = new Member("javamem","javamem",address);
		System.out.println("주소:"+address);
		//힙영역의 주소가 아니라 address 객체의 매개변수값이 나오게 하려면 객체.toString을 쓰면 되는데, 
		//이미 Address 클래스에서 toString을해서 프린트할때 .toString을 생략하고 instance 객체명만써도 된다.
		System.out.println("Member :" +mem);
	 	*/
		//키보드로 부터 id,pwd를 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id=sc.next();
		System.out.print("PWD : ");
		String pwd=sc.next();
		//입력후 Member 클래스의 생성자 메소드(==set메소드)로 전달하여 출력
		Member member = new Member(id,pwd);
		String id2=member.getId(); //값을 가져오는것! 
		//String id2-"java"; 와 같은것!!
		String pwd2=member.getPwd();
		System.out.println("ID :" +id2 + " PWD :" + pwd2);
		
		//입력값을 set메소드로 전달하여 출력
		member.setId(id2); //매개변수 없는 기본생성자가 반드시 있어야함!!
		member.setPwd(pwd2);
		String id3 =member.getId();
		String pwd3 =member.getPwd();
		System.out.println("ID :" +id3 + " PWD :" + pwd3);
		
		//값 변경
		member.setId("computer"); //()안에 변경할 값 넣기
		System.out.println("ID :" +member.getId() + " PWD :" + pwd3);
		//바뀐값을 member.getId()로 불러온다
		
		//값 조회
		id3=member.getId();
		pwd3=member.getPwd();
		System.out.println("ID :" +id3 + " PWD :" + pwd3);

	}
}
		
	
