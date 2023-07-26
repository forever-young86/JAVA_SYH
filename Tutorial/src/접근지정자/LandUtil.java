package 접근지정자;

public class LandUtil {

	public float calcLandTax(Land l){//인스턴스를 매개변수로 전달 (Land l)
		float total_tax=0f;
		float tax=0f;
		float area_tax=0f;
		int tax_rate=0;
		int n=0;
		if(l.land_type==1) { //토지면적당 토지세율 결정
			System.out.println("토지 종류: 건물이 없는 토지");
			if(l.land_size<=1800)
				tax_rate=1800;
			else if(l.land_size<=2500)
				tax_rate=2000;
			else
				tax_rate=3000;
			
			area_tax=tax_rate*l.land_size;// 토지면적당 세액 계산
			System.out.println("토지 면적 새액:" + area_tax);
			
			//토지 보유기간에 따른 감면액 계산
			if(l.land_own_year<3) //토지 보유 기간(년) (2≤n≤12) 
				n=0;
			else if (l.land_own_year<13)
				n=l.land_own_year-2;
			else 
				n=10;
			tax=area_tax-area_tax*0.05f*n; 
			/**토지 소유 기간이 3년 미만인 토지에 대해서는 100%, 소유 기간이 12년 이상인 토지는
			50% 감면된다.
			연토지세 =A(계산된 면적세액)−A액×𝟓/𝟏𝟎𝟎×(𝐧−𝟐)
			A표
			건물이 없는 토지 건물이 있는 토지
			토지 면적 𝒎𝟐당 세액 토지면적 𝒎𝟐당 세액
			1,000𝑚2이하 1,800원 1,000𝑚2이하 3,600원
			2,500𝑚2이하 2,000원 2,500𝑚2이하 4,000원
			3,000𝑚2초과 3,000원 3,000𝑚2초과 6,000원
			**/
			
		} 
		else {
			System.out.println("토지 종류: 건물이 있는 토지");
			if(l.land_size<=1800)
				tax_rate=3600;
			else if(l.land_size<=2500)
				tax_rate=4000;
			else
				tax_rate=6000;
			area_tax=tax_rate*l.land_size;
			System.out.println("토지 면적 세액은 " + area_tax);
			if(l.land_own_year<3)
				n=0;
			else if (l.land_own_year<13)
				n=l.land_own_year-2;
			else
				n=10;
			tax=area_tax-area_tax*0.05f*n;
		}
		total_tax=tax+0.3f*area_tax;//지방 교육세 : 연세액(A)의 30% 
		return total_tax;
		
	}
	
}
