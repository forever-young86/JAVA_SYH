package 상속ex01;

public class SuperMain {

	public static void main(String[] args) {
		University u = new University();
		u.setName("자바"); 
		u.setGrade(21);
		u.setCourses(12);
 		System.out.println(u.getStudInfo());
	}
}
