package iotest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_01 {

	public static void main(String[] args) {
		FileReader in = null; //하드디스크에 파일로 저장된것을 읽어올때
		int n = 0;
		try {
			in = new FileReader("c:\\windows\\system.ini");
	//경로를 쓸때는 \\를 넣어준다. 그리고 무조건 경로가 잘못될것을 예상해서 예외처리를 해줘야함!
	
			/**n=in.read(); //파일이 있다하더라도 읽을수 없는 상태일수도 있으므로 예외처리!
			System.out.println((char)n);//-->아스키코드가 나온다, 문자로 형변환 해야함
			n=in.read();
			System.out.println((char)n);//문자 하나하나를 불러오도록 쓸수없기때문에 while문을 쓴다
			**/
			
			while((n=in.read())!=-1){//(n=in.read())가 -1이 아니면 계속 돌림,-1이 되면 빠져나감
				System.out.print((char)n);
			}
			in.close(); //출력할것이 없을때 빼져나옴
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로에 파일이 없음"+e.getMessage());
		} catch (IOException e) {
			System.out.println("파일 입력 오류: "+e.getMessage());
		}
	}
}
