package 상속;

public class StudentTest {

	public static void main(String[] args) {
		
		Student st=new Student();
		st.setName("자바");
		st.setGrade(3);
		System.out.println("부모:"+st.getStudInfo());
		
		String sinsang = null;
		Elementary e = new Elementary("이순신",2); //상속받은 자신이 객체생성
		University u = new University("홍길동",3,20);
		
		Student st2 = new Elementary("java",5); //업캐스팅
		System.out.println(st2.getStudInfo());
		
		st2=new University("Javajava",4,30);
		System.out.println(st2.getStudInfo());//getStudInfo()을 오버라이딩 해야지 결과값이 모두 나온다
		
		sinsang=e.getStudInfo();
		System.out.println("학생정보:" + sinsang);
		sinsang=u.getStudInfo();
		System.out.println("학생정보:" + sinsang + "수강학점:"+ u.getCourses()+ "점");
	}
}
