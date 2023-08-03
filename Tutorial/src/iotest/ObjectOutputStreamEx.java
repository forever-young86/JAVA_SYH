package iotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx {

	public static void main(String[] args) {
		FileOutputStream fos = null; //밖에서 선언
		
		try {
		fos = new FileOutputStream("d:\\temp\\Object.dat"); //저장한다 + 예외처리
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectOutputStream oos = null;
		try {
		oos = new ObjectOutputStream(fos); //저장할 내용
		oos.writeObject(new Integer(10));
		oos.writeObject(new Double (3.14));
		oos.writeObject(new int[] {1,2,3});
		oos.writeObject(new String ("홍길동"));
		
		oos.flush(); oos.close(); fos.close(); 
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		FileInputStream fis = null; //밖에서 선언
		try {
			fis = new FileInputStream("d:\\temp\\Object.dat"); //읽어올 경로
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(fis); //읽어올 타입
			Integer obj1 = (Integer) ois.readObject();
			Double obj2 = (Double) ois.readObject();
			int[] obj3 = (int[]) ois.readObject();
			String obj4 = (String) ois.readObject();
			
			ois.close(); fis.close(); //출력
			System.out.println(obj1);
			System.out.println(obj2);
			System.out.println(obj3[0]+ "," + obj3[1]+ "," + obj3[2]);
			System.out.println(obj4);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
