package iotest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWrite {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);//키보드로 부터 입력받는다
		FileWriter fout = null;
		int c = 0;
		try {
			fout = new FileWriter("d:\\temp\\test.txt"); //파일을 저장할 경로 지정
			while((c=in.read())!=-1)
				fout.write(c); //write=저장!
			in.close();
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}//콘솔창에 입력하고 컨트롤 +z 로 저장하면 해당 위치에 파일이 생김
				
	}
}
