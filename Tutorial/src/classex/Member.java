package classex;
//dto(data transfer object) vo (value object)
public class Member {
 private String id;
 private String pwd;
 private String name;
 private String email;
 private Address address;
 
 	public Member() {
 		/*System.out.println("생성자 메소드");
 		System.out.println("id="+ id);
 		System.out.println("pwd="+ pwd);
 		System.out.println("name="+ name);
 		System.out.println("email="+ email);*/
 	}
 	
 	public Member(String id, String pwd) {
 		this.id=id;
 		this.pwd=pwd;
 	}
 	public Member(String id, String pwd,Address addr) {
 	 	this.id=id;
 	 	this.pwd=pwd;
 	 	this.address=addr; //현재 클래스에 있는 멤버를 복사해서 사용
 	 	
 	} //매개변수를 갖는 생성메소드
 	
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	
	public void setPwd(String pwd) {
		this.pwd=pwd;
	}
	public String getPwd() {
		return pwd;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", address=" + address + "]";
	}
		

}