package _4조건과반복;

public class Exercise04 {

	public static void main(String[] args) {
	
		while(true) {
			int num1 = (int) (Math.random()*6) + 1;
			int num2 = (int) (Math.random()*6) + 1;
			System.out.println("("+num1+","+num2+")");
			if((num1+num2)==5) { //합이 5가 나오면 멈춤
				break;
			
			} 
		}
	}	

}
