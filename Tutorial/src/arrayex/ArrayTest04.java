package arrayex;

public class ArrayTest04 {

	public static void main(String[] args) {
		int[] num = {5,4,3,2,1};
		int temp=0;
		System.out.println("정렬 전 배열값");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"\t");
		}
		
		
		for (int i = 0; i < num.length; i++) {//i는 첫번째 index
			for (int j = i+1; j < num.length; j++) {//j는 첫번째 index 이후에 계속 비교해서 나갈 배열 요소의 index
				if(num[i]>num[j]) {	//비교할 index[0] 부터~
					//num[i,첫번째 인덱스값]이 num[j, 두번째 인덱스값]부터 비교해서 클때
					//nmu[i,첫번째 인덱스값]이 num[j, 비교 인덱스값]보다 작으면 
					temp=num[i]; //temp에 그 첫번째값[i]을 넣는다
					num[i]=num[j];//temp에 넣은 그 첫번째값[i] 위치에 비교했던 값[j]이 옮겨감
					num[j]=temp;//비교했던값[j]와 temp에 넣었던 첫번째값의 위치 교환
				}
			}
		}
		System.out.println("\n 정렬 후 배열값");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"\t");
			
		}
	}
}
