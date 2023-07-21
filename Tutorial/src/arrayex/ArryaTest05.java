package arrayex;

public class ArryaTest05 {

	public static void main(String[] args) {
		int[] num = {34,56,78,99,23,46,21,46,76,55};
		int temp = 0;
		System.out.println("정렬 전 배열값");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"\t");
		}
		for (int i = 0; i < num.length; i++) { //첫번째 인덱스
			for (int j = i; j < num.length; j++) {//두번째부터 비교할 인덱스
				if(num[i]>num[j]) {//첫번째 비교 인덱스값이 비교값보다 클때
					temp=num[i]; //첫번째 비교값 temp 임시저장
					num[i]=num[j]; //첫번째 비교값 있던 인덱스에 비교값 옮김
					num[j]=temp; //옮겨진 비교값 인덱스에 temp에 저장되었던 첫번째 비교값 옮김
				}
			}
		}
		System.out.println("\n정렬 후 배열값");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"\t");
			
		}
	}
}
