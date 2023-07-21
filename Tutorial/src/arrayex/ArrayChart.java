package arrayex;

public class ArrayChart {

	public static void main(String[] args) {
		ArrayChart ac = new ArrayChart();
		ac.displayMessage();
		ac.processGrades();
	}
	
	public void displayMessage() {
		System.out.println("Java Programming");
	}
	
	static int[] score = {87,68,94,100,83,78,85,91,76,87};
	public void processGrades() {
	//배열초기값 선언
	//학생 점수 출력()	
	//평균메소드 ()--->getAverage()	
	//getMaximum()
	//getMinimum()
	//챠트출력-->outputBarChart();
	scorePrint();
	getAverage();
	getMaximum();
	getMinimum();
	outputBarChart();	
	
	}
	public void scorePrint() {
		for (int i = 0; i < score.length; i++) {
			System.out.println("학생" + (i+1) + ":" + score[i]);
			
		}
	}
	public void getAverage() {
		int sum=0;
		float avg=0;
		for (int i = 0; i < score.length; i++) 
		sum += score[i];
		avg = sum/(float)score.length;
		System.out.println("과목평균 :"+avg);
	}
	public void getMaximum() {
		int max = score[0];
		for (int i = 1; i < score.length; i++) {
			if(score[i]>max) 
				max=score[i];
		}
		System.out.println("최고점수 :"+max);
		
}
	public void getMinimum() {
		int min = score[0];
		for (int i = 1; i < score.length; i++) {
			if(score[i]<min) 
				min=score[i];
		}
		System.out.println("최저점수 :"+min); 

	}
		
	public void outputBarChart() {
		
	
	}
}

