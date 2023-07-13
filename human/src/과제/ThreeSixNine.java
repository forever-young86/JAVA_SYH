package 과제;

public class ThreeSixNine {
		
		public static void main(String[] args) {
			
			for (int i = 1; i <=100; i++) {
				int one = i %10; //1의 자리
				int ten = i /10; //10의 자리
				boolean one369 = false;
				boolean ten369 = false;
			
				if (ten == 3 || ten == 6 || ten == 9) {
					ten369 =true;
				}
		
				if (one == 3 || one == 6 || one == 9) {
					one369 =true;
				}
				
				if (one369&&ten369==true) { //1의자리와 10자리 모두 &&
					System.out.print("** ");
				}				
				else if (one369||ten369==true) { //1의자리거나 10자리 둘중에 하나 ||
					System.out.print("* ");
				}
				else
					System.out.print(i);
				
			}		
		}				
}
