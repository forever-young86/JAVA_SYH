package iotest01;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file = new File (".","FileTest.java");
		System.out.println("파일의 경로는?" + file.getPath());
		System.out.println("파일의 이름은?" + file.getName());
		System.out.println("파일의 상위디렉토리는?" + file.getParent());
		System.out.println("파일의 절대경로는?" + file.getAbsolutePath());
		System.out.println("파일이 절대경로냐?" + file.isAbsolute());
		System.out.println("파일이 존재하냐?" + file.exists());
		System.out.println("파일의 바이트 크기는?" + file.length());
		boolean b = new File("."+File.separator+"hello").mkdir();		
		
		String[] listing = new File(".").list();
		System.out.println("현재 디렉터리 내용은?");
		for (int i = 0; i < listing.length; i++) {
			System.out.println(listing[i]);
			
		}
	}
}
