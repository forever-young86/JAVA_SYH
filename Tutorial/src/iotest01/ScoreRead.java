package iotest01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

public class ScoreRead {

	//파일에서 시험 점수를 읽어서 총점과 평균을 구하기
	public static void main(String[] args) {
		int totalScore = 0;
		int count =0;
		float average = 0.0f;
		File file = new File("d:\\temp\\scoreData.txt");
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			s = in.readLine();
			if(s!=null) {
				System.out.println("시험점수 : "+s);
				StringTokenizer st = new 
						StringTokenizer(s,",");
				//StringTokenizer: 하나의 문자열(String)을 여러개의 토큰으로 분리하는(Tonkenizer) 클래스!
				while(st.hasMoreTokens()) {//hasMoreTokens + nextToken 으로 분리된 문자열을 모두 출력
					totalScore +=Integer.parseInt(st.nextToken());
					count++;
				}
				System.out.println("총점:" + totalScore);
				System.out.println("시험 본 사람:"+count+"명");
				
				average=(float)totalScore/count;
				System.out.println("시험평균:"+average);
			}
			in.close();
		} catch (FileNotFoundException e1) {
			System.out.println("File not found");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
