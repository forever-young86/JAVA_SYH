package classex;

public class MemberMain {
	//static Scanner sc = new Scanner(System.in);//static을 붙여서 멤버메인이 호출되기전에 스캐너가 먼저 할당됨
	//static은 반드시 클래스이름가지고 접근해야함!
	
	//메소드에 속성( private,sting,,,etc )이 없으면 무조건 static을 붙인다.-->그러면 instance를 생성하지 않음
	//속성을 있어 사용할때는 instance를 생성하여 사용
	public static void showMenu() {
		System.out.println("1.회원입력\n2.회원조회\n3.회원삭제\n4.회원변경\n5.전체출력\n6.종료");
		System.out.print("메뉴선택");
	}	
	public static void main(String[]args) {
		MemberService ms = new MemberService();
		int sel=0;		 
		while(true) {
			showMenu();
			sel = InputScanner.sc.nextInt();	
		
			switch (sel) {
				case 1: 
					ms.inputData(); //메소드가 static여서 클래스명 MemberService로 접근함
					break;			//속성을 사용할때는 instance를 만들어 사용 (MemberService ms = new MemberService();)
					
				case 2: 
					System.out.println("회원조회");
					ms.searchData();
					break;
				case 3:	
					System.out.println("회원삭제"); 
					ms.deleteData();
					break;
				case 4:
					System.out.println("회원변경");
					break;
				case 5:	
					System.out.println("전체출력");
					break;
				case 6:	System.out.println("프로그램을 종료함");
				System.exit(0);
		
				InputScanner.sc.close();
		}
		}	
	
}
}
