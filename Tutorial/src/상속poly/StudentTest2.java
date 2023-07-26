package 상속poly;

public class StudentTest2 {

	public static void main(String[] args) {
		Student s = new University("홍길동",3,20); //부모이름은 자식에게 접근

		//System.out.println(s.getCourses());
		
		University u = (University)s;//s(Studendt 부모클래스)를 (University 타입)으로 다운캐스팅 
		/**ex) 
		int i;				Student s = new University				
		i =(int)12.34;      University u = (University)s; 다운캐스팅 할때는 변형할 자료형을 (University) 적어준다
		**/
		System.out.println("학점은 >>"+ u.getCourses()+"점");
		
	}
}
