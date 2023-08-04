package iotest01;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		File file = new File("d:\\temp\\write.txt");
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			int readChar;
			while((readChar=fr.read())!=-1){
				System.out.println((char)readChar); //개행문자 (문자를 하나하나씩 행을 바꿔)출력
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fr!=null)fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
