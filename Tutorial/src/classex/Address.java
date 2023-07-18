package classex;


public class Address {
	private String city,gu,dong;
	
	public Address() {
	
	}
		
	public Address(String city, String gu, String dong) {
		this.city = city;
		this.gu = gu;
		this.dong = dong;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGu() {
		return gu;
	}

	public void setGu(String gu) {
		this.gu = gu;
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	@Override //-->상속받아 구현되었다는 표시
	public String toString() {
		return "Address [city=" + city + ", gu=" + gu + ", dong=" + dong + "]";
	}
	
}
