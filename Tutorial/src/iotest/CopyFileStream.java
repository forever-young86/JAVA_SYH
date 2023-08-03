package iotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileStream {

	public static void main(String[] args) {
		
		FileInputStream in = null; //입출력은 무조건 바깥쪽에 선언부터한다
		FileOutputStream out = null; //파일을 저장한다
		try {
			in = new FileInputStream("d:\\temp\\input.ini");
			out = new FileOutputStream("d:\\temp\\output.txt");//파일을 만들어 저장한다
			int c = 0;
			while((c=in.read())!=-1) 
				out.write(c); //out에 c (in의 내용) 를 저장한다
				
		} catch (FileNotFoundException e) {
			System.out.println("\"해당 경로에 파일이 없음\"+e.getMessage()");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				if(in!=null) in.close();
				if(out!=null) out.close();
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();

			}
			
		}
		
		
	}
	
}
