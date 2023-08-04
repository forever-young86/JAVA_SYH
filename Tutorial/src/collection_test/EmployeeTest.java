package collection_test;

import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {
		Manager m1 = new Manager("자바", new MyDate(2000,01,01), 500000, "관리부", 10);
		Manager m2 = new Manager("자바2", new MyDate(2000,01,01), 500000, "관리부", 10);
		//EmployeeService service = new EmployeeService();
		
		//싱글톤 객체를 호출:new를 쓰지않고, 클래스와 getInstance()로 호출
		EmployeeService service = EmployeeService.getInstance();
		
		service.addEmployee(m1);
		service.addEmployee(m1);
		service.addEmployee(m2);
		
		//전부출력
		service.getAllEmployee();
		
		//사원 삭제
		service.deleteEmployee("자바3");
		
		//사원조회
		ArrayList<Employee> list=service.findEmployee("자바2");
		System.out.println(list);
	}

}
