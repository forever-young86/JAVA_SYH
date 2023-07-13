package Day01;

public class Ex12_FloatDouble {
	
	public static void main(String[] args) {
		double var1 = 3.14D; //기본실수는 double로 인식하기에 리터럴 D 생략가능
		float var2 = 3.14F; //리터럴 F 써야함
		
		double var3= 0.123456789123456789; //실수형 정밀도를 표현하지 못함
		float var4= 0.123456789123456789F; //실수형 정밀도를 표현하지 못함
		
		double PI = Math.PI; //Math class를 사용
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		
		System.out.println("원주율 PI : " + PI);
		
	}

}
