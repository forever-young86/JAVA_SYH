package iotest01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageCopy {

	public static void main(String[] args) {
		
		try {
			File file = new File("d:\\temp\\gallery1.jpg");
			FileInputStream in = new FileInputStream(file);
			FileOutputStream out = new FileOutputStream("d:\\temp\\gallery1_copy.jpg");
			int data;
			System.out.println("파일 크기는 : " + file.length());
			
			long begin = System.currentTimeMillis();
			
			byte[] buffer = new byte[100];
			
			while(true) {
				int count = in.read(buffer);
				if(count == -1)
					break;
				
				out.write(buffer,0,count);
			}
			
			in.close();
			out.close();
			System.out.println("이미지를 복사했습니다");
			
			long end=System.currentTimeMillis();
			System.out.println("복사시간은 : " +(end-begin)+"ms입니다");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
