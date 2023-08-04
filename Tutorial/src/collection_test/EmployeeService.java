package collection_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class EmployeeService {

	private ArrayList<Employee> list; //필드선언
	private HashMap<Integer, Employee> map;
	
	//싱글톤 선언 = 외부에서 접근불가, 인스턴스 만들수없다!
	private static EmployeeService service = new EmployeeService();
	private EmployeeService() { //생성자 메소드 앞에 private 붙여야함
		list = new ArrayList<Employee>();
		map = new HashMap<Integer, Employee>();
	}
	public static EmployeeService getInstance() {
		return service;
	}
	
	/**public EmployeeService() {
		list = new ArrayList<Employee>(); //객체생성
	}**/
	
	//데이터 추가
	public void addEmployee(Employee e) {
		/**boolean flag=false;
		for (Employee emp:list) { //이름으로 비교해서 등록여부 판단
			if(e.getName().equals(emp.getName())) {
				flag=true;
				System.out.println(e.getName()+"님은 이미 등록되어있습니다.");
				return;
			}
		} //for
		
		//ArrayList를 add() 메소드를 사용하여 객체를 저장
		if(flag==false) {
		list.add(e);
		System.out.println(e.getName()+"님이 회원으로 가입되셨습니다.");
		} **/
		
		/**boolean flag=false;
		Set<Integer> set = map.keySet();
		for(int key:set) {
			if(map.get(key).getName().equals(e.getName())) {
				flag = true;
				System.out.println(e.getName()+"님은 이미 등록되어있습니다.");
				return;
			}
		}
		if(flag==false) {
			map.put(e.getSsn(),e);
			System.out.println(e.getName()+"님이 회원으로 가입되셨습니다.");	
		}**/
		if(map.containsKey(e.getSsn())) {
			System.out.println(e.getName()+"님은 이미 회원입니다.");
			return;
		}else {
			map.put(e.getSsn(), e);
			System.out.println(e.getName()+"님이 회원으로 가입되셨습니다.");	
		}
	}
	public void deleteEmployee(String name) {
		boolean flag = false;
		for(Employee emp:list) {
			if(emp.getName().equals(name)) {
				flag=true;
				list.remove(emp);
				System.out.println(emp.getName()+"님은 삭제되었습니다.");
				//break;
			}
		}//for
		
		if(flag==false) {
		System.out.println("삭제할 대상이 없습니다.");
		}
	}
		public ArrayList<Employee> findEmployee(String name){
		ArrayList<Employee> temp = new ArrayList<Employee>();
		for(Employee e:list) {
			if(e.getName().equals(name)) {
				temp.add(e);
			}
		}
		return temp;
	}
		public void getAllEmployee() {
		 /**for(Employee e:list) 
			 System.out.println(e); // e 클래스에 toString이 없으면 주소값 나옴**/
		 
		//HashMap으로 출력
		/**Set<Integer> set = map.keySet();
		for(int key:set)
			System.out.println(map.get(key)); //key값만 가져와서 출력**/
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer key=it.next();
			System.out.println(map.get(key));
		}
		
		}
}
