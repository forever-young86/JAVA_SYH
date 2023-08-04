package IOPractice;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Strike { //야구게임

	static int com_val[] = new int [3]; //컴퓨터가 가지는 3수를 저장하는 배열
	public static void main(String[] args) throws IOException {
		boolean result = false;
		int try_count =1; //도전 횟수
		com_val=init(); //컴퓨터의 볼 카운트를 초기화
		for (int i = 0; i < 3; i++) {
			System.out.println("컴퓨터값:"+com_val[i]);
			
		}
	
		System.out.println("=========BaseBall Game==========");
		System.out.println("총 10번의 기회 중" + try_count+"회 도전");
		System.out.println("세 수를 연속하여 입력하세요. \n 예)123");
		System.out.println("숫자입력:");
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String s;
			s = in.readLine();
			while(s!=null) {//입력값이 0이 아니면 밑에 실행 try_count>=10까지!
				System.out.println("입력값:"+s);
				result=compare(s); //입력한값과 컴퓨터의 값을 비교
				if(result==true) {
					System.out.println("정답입니다.");
					break;
				}else {
					try_count++;
					if(try_count>=10){
						System.out.println("도전 실패입니다. \n 다시도전 (Y), 종료(N)");
						System.exit(1);
						
					}
			
					System.out.println("총 10번의 기회 중" + try_count+"회 도전");
					System.out.println("세 수를 연속하여 입력하세요. \n 예)123");
					System.out.println("숫자입력:");
					s = in.readLine();
					
				}//end if
				
			}//end while
			in.close();
		} catch (IOException e) {
			System.out.println("IOExceptin");
		}
	}
	
	private static int[] init() { //프로그램 실행시 컴퓨터의 볼 카운트를 초기화하는 메소드
		int[]val = new int [3];
		int num=0;
		int count= 0;
		
	label1: //1~9사이의 임의의 수를 구한후 구한수가 이미 배열에 있는 체크. 존재하지 않으면 차례대로 배열에 저장
		while(count<3) {
			num=(int)(Math.random()*1000)%9+1;
			//두 수사이의 난수구하는 방법: ((int)(Math.random( )∗1000)/(마지막수−시작수)+시작수)+시작수
			for (int i = 0; i < 3; i++) {
				if(num==val[i])
					continue label1;
			}
			val[count]=num;
			count++;
			num=0;
		}
		return val;
	}
	
	private static boolean compare(String str) { //컴퓨터의 볼 카운트와 사용자가 입력한 볼 카운트를 비교하는 메소드
		int ball=0, strike=0; //볼 카운트
		boolean result = false;
		int num = 0;
		char ch=0;
		
		for (int i = 0; i < 3; i++) { //입력한 수가 컴퓨터수와 일치하면 ball 증가
			ch=str.charAt(i);
			num=Integer.parseInt(Character.toString(ch));
			for (int j = 0; j < 3; j++) {
				if(num==com_val[j] && i!=j)
					ball++;
			}
		}
		for (int i = 0; i < 3; i++) {//입력한 수가 컴퓨터수와 수와 순서(자리)까지 일치하면 strike 증가
			ch=str.charAt(i);
			num=Integer.parseInt(Character.toString(ch));
			if(num==com_val[i])
				strike++;
		}
		
		if(strike==3) //3숫자를 다 맞추었을경우
			result = true;
		displayCount(ball,strike); //볼카운트를 표시
		return result;
	}

	private static void displayCount(int ball, int strike) {
		System.out.println(ball+"ball,"+strike+"strike");
		
	}
	
	
}
