package Day01;

public class Ex09_Byte {
	
	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = (byte)128; //강제 캐스팅 해야함,양수는 127까지 가능 그래서 넘어가면 돌아가서 다시 음수 -128부터 시작함
		//byte var6 = 200; byte의 범위를 넘어가서 에러가 남 (-128~127까지)
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
	}

}
