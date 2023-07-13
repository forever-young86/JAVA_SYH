package Day02;

public class Ex04_BitOperator {

	public static void main(String[] args) {
		int result = 20 & 16;
		System.out.println(result);
		
		//Integer.toBinaryString():십진수 숫자를 이진수 문자열로 변환하는 메소드
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("------------------------");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();
		
		
		
		int result2 = 20 | 16;
		System.out.println(result2);
		
		//Integer.toBinaryString():십진수 숫자를 이진수 문자열로 변환하는 메소드
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("------------------------");
		System.out.println(Integer.toBinaryString(result2));
		System.out.println();
		
		
		
		int result3 = 20 ^ 16;
		System.out.println(result3);
		
		//Integer.toBinaryString():십진수 숫자를 이진수 문자열로 변환하는 메소드
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("------------------------");
		System.out.println(Integer.toBinaryString(result2));
		System.out.println();
		
		//NOT ~로 표시
		int result4 = ~20;
		System.out.println(result4);
	
		System.out.println(Integer.toBinaryString(20));
		System.out.println("------------------------");
		System.out.println(Integer.toBinaryString(result4));//Int는 32비트이므로 32자리로 표현
		System.out.println();
		
		
	///시프트 연산
		System.out.println("<<연산하면 2배씩 증가");
		System.out.println(2 << 1); //정수 2의 비트를 왼쪽으로 1칸 이동
		System.out.println(2 << 2);
		System.out.println(2 << 3);
		System.out.println();
		
		System.out.println(">> 연산하면 1/2배씩 감소");
		System.out.println(16 >> 1);
		System.out.println(16 >> 2); //정수 16의 비트를 오른쪽으로 2칸 이동
		System.out.println(16 >> 3);
		System.out.println();
		
		
		System.out.println("부호가 있는 경우");
		System.out.println(-2 << 1); //최상위 부호비트는 그대로 가져간다
		System.out.println(-2 << 2);
		System.out.println(-2 << 3);
		System.out.println();
		
		
		System.out.println(2 >> 1); 
		System.out.println(-2 >> 31);
		System.out.println(-2 >>> 31);
		System.out.println(Integer.toBinaryString(2));
		System.out.println(Integer.toBinaryString(-2));
		System.out.println();
		
		
	}
	
}
