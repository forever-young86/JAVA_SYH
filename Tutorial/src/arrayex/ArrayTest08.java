package arrayex;

public class ArrayTest08 {


		public static void main(String[] args) {
			
		//배열초기값 선언
		int[] score = {87,68,94,100,83,78,85,91,76,87};
		float avg=0;
		int sum=0;
		//학생 점수 출력()
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
			System.out.println("학생"+(i+1)+" :"+score[i]);
		}
		//평균메소드 ()--->getAverage()
		avg=sum/(float)score.length;
		System.out.println("과목평균 :"+avg);
		
		//getMaximum()
		
		//getMinimum()
		
		//챠트출력-->outputBarChart();
	
}	
	
}

