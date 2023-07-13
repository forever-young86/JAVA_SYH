package Day03;

public class EX04_Foreach {

	public static void main(String[] args) {
		String [] week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"
	};
		for (int i = 0; i < week.length; i+=2) {
			System.out.print(week[i]+ " "); 
			//for문은 index를 대입하여 출력, 조건식 또는 증감식 이용!
		}
			System.out.println();
			
			//foreach문 - 배열, 또는 컬렉션의 모든 요소를 순서대로 반복 
			//(무조건 전체반복), 조건 받지 않음!
			//for (자료형 요소명 : 배열){}
			for (String day : week) {
				System.out.print(day + " "); //day : week[i]
			}
			System.out.println();
		}
	
}
