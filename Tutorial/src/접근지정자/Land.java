package 접근지정자;

public class Land {

	int land_type; //default 지정자는 앞에 생략가능
	int land_size;
	int land_own_year;
	
	public Land() {
	}
	public Land(int land_type, int land_size, int land_own_year) {
		this.land_type = land_type;
		this.land_size = land_size;
		this.land_own_year = land_own_year;
	}
	
	
}
