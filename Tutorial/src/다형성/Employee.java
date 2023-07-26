package 다형성;

public class Employee {
	protected String name;
	protected String job;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public void getEmpInfo(Employee a) { //매개변수 a가 Account일때, instanceof type과 일치할때 true 실행
		if(a instanceof Account){
		System.out.println("직급: "+ a.getJob());
		}
		else if(a instanceof Research) {//매개변수 a가 Research일때(instanceof type과 일치할때) true 실행
			Research res = (Research)a;
			System.out.println("직책 : "+res.getPosition());
		}
	}

}
