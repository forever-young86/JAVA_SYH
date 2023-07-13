package Day02;

public class Ex19_GuguAll {

	public static void main(String[] args) {
		//(단)x(1~9) 단에 대한 반복 : 2~9, 각단에 곱:1~9
		//i=단, j는 곱
		//이중반복문, 중첩반복문
		for (int i = 2; i <=9; i++) {
			for (int j = 1; j <=9; j++) {
				System.out.print(i + "*"+j+"="+i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}
}
