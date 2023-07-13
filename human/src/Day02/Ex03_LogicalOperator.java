package Day02;

public class Ex03_LogicalOperator {

	public static void main(String[] args) {
		System.out.println(true && true); //&&: 모두 true 여야 true
		System.out.println(false && false);
		
		System.out.println(true || true); //||:둘중 하나가 true면 true
		System.out.println(true || false);
		System.out.println(true || (100<50));
		System.out.println((5 <20 || (5 > 2)));
		System.out.println();
		
		System.out.println(true ^ true);// XOR(^): A와B가 다를때 true
		System.out.println(true ^ false);
		System.out.println((9>=2) ^ (7>4));
		System.out.println();
		
		System.out.println(!true);//NOT(!):A가 true면 false, false면 true로 변환
		System.out.println(!false);
		System.out.println();
		
		
		int value1 =3;
		System.out.println(false && ++value1 > 10);//쇼트서킷 적용, 전위연산 실행X
		System.out.println(value1);
		
		int value2 =3;
		System.out.println(true || ++value2 > 5);
		System.out.println(value2);
		
		
		int value3 =3;
		System.out.println(false & ++value3 > 10);//비트연산자는 쇼트서킷 미적용, 전위연산 실행O
		System.out.println(value3);
		
		int value4 =3;
		System.out.println(true | ++value4 > 5);
		System.out.println(value4);
		
		
	}
	
}
