package Day02;

public class Ex05_TernaryOperator {

	public static void main(String[] args) {
		int a =3, b =5; 
		
		//조건연산자-> (조건) ? (참일때 문장) : (거짓일때 문장)
		int result = (a>b) ? a-b : b-a;
		
		//If문과 같은 역할
		//if(a>b)
			//result ="a-b"; 
		//else
			//result="b-a";
		
		
		System.out.println("두 수의 차 : " + result);
	
		
	}
	
}
