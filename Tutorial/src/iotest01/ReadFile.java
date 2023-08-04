package iotest01;

import java.io.*;

public class ReadFile {

	public static void main(String args[]) {
		File file = new File("d:\\temp\\write.txt");
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			s = in.readLine();
			while(s != null) {
				System.out.println("read:"+s);
				s=in.readLine();
			}
				in.close();
			
		}catch (FileNotFoundException e1) {
			System.out.println("File Not Found");	
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}

