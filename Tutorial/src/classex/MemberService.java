package classex;
//외부요청
public class MemberService {
	final int MAX_CNT=50;
	Member [] member = new Member [MAX_CNT];
	int cnt = 0;
	
	public void inputData() {
		System.out.println("회원입력"); 
		System.out.print("ID : ");
		String id=InputScanner.sc.next();
		System.out.print("PWD : ");
		String pwd=InputScanner.sc.next();
	
		//입력한 내용을 객체로 생성후 배열에 저장
		member[cnt++]= new Member(id, pwd);
		System.out.println("데이터 입력이 완료되었습니다.");
	}
	
	public void searchData() {	
		//id로 검색한다
		//검색: compareTo()메소드 사용 => 두개가 같으면 0 출력, 뒤에가 크면 음수
		//삭제,변경 사용시 자료를 검색
		//공통 메소드 작성 ==> search(String id)
		System.out.println("데이터 검색합니다");
		System.out.print("ID:");
		String id = InputScanner.sc.next();
		int index=search(id); //입력받은 값을 위치에 저장 (위치값)
		
		if(index<0)
			System.out.println("데이터가 없음");
		else {
			//해당 검색 데이터를 출력
			System.out.println (member[index].toString());//toString을 이용해 배열의 위치에 있는것을 출력
			//System.out.println (member[index]); //배열의 위치에 있는것을 출력
			System.out.println("데이터 검색완료");
		}
	}
	private int search(String id) {
		//매개변수 id과 배열에 있는 id 비교
		for(int i=0; i<cnt; i++) {
		Member mem = member[i];
		if(id.compareTo(mem.getId())==0)
			return i; //해당 위치값 리턴
		
		}
		return -1; //일치하는 내용이 없다
	}

	public void deleteData() { 
		System.out.println("데이터 삭제합니다");
		System.out.print("ID:");
		String id=InputScanner.sc.next();
		int index=search(id); //ㄴ여기까지 검색
		
		if(index<0)
			System.out.println("데이터가 없음");
		else {		
			for (int i = index; i < cnt; i++) {
				member[i]=member[i+1]; 	
			}
			cnt--;//없앤 배열요소값의 위치를 없앰 (감소)
			//cnt = cnt+1; === 오른쪽에 있는 결과를 왼쪽에 담아 준다는 의미!!
			//대체 할 수 있는 연산자 : cnt++;
			System.out.println("데이터 삭제완료");
			}
		}

	
	public void updateData() {
	}
	
	public void totalPrint() {
	}
}
