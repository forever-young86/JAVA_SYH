package iotest01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SystemInOut {

	public static void main(String[] args) {
		InputStream is = System.in; //키보드 입력 스트림
		OutputStream os = System.out; //모니터 출력 스트림
		
		try {
			char ch = (char)is.read();
			os.write(ch);
			os.flush();
		} catch (IOException e) {
			
		}
	}
}
