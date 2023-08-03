/** 바이트 스트림으로 바이너리 파일 쓰기
 * 1.파일 출력 스트림 생성 (파일 열기) *Stream이면 무조건 1바이트 개념으로 생각하기!
 * FileOutputStream fout=new FileOutputStream ("d:\\temp\\test.out")
 * 2.파일 쓰기
 * write() 로 문자 하나씩 파일에 기록
 * fout.write(b);
 * 스트림 닫기 close()
 * 
 * byte[]에 있는 바이너리(이진법) 값을 d:\\temp\\test.out에 저장
 **/

package iotest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamBinaryOut {

	public static void main(String[] args) {
		FileOutputStream fout = null;
		
		byte[] b = {7,5,1,3,4,12,-9}; //b라는 배열에 초기값 설정
		
		try {
			fout = new FileOutputStream("d:\\temp\\test.out");
			for (int i = 0; i < b.length; i++) 
				fout.write(b[i]); //배열의 b의 바이너리를 기록 (파일에 저장)
			fout.close();
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
 