package 다형성01;

public class StudentTest {
	public static void main(String[] args) {
		String sinsang=null;
		Person p1 = new Elementary ("이순신",2,"남",15);
		Person p2 = new University("홍길동",3,22,"남",22);
		Person p3 = new University("오나라",4,50);
		sinsang=((Student)p1).getStudInfo();
		System.out.println("학생정보:"+sinsang);
		
		sinsang=((Student)p2).getStudInfo();
		int courses=((University)p2).getCourses();
		System.out.println("학생정보:"+sinsang+",학점:"+courses+"점");
		
		sinsang=((Student)p3).getStudInfo();
		int courses1=((University)p3).getCourses();
		System.out.println("학생정보:"+sinsang+",학점:"+courses1+"점");
		
		
	}
}
