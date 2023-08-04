package iotest01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

public class DataInputOutputTest {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("d:\\temp\\primitive.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.6);
		dos.writeInt(1);
		
		dos.writeUTF("이순신");
		dos.writeDouble(90.4);
		dos.writeInt(2);
		
		dos.flush(); dos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream("d:\\temp\\primitive.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println("이름\t점수\t학년");
		System.out.println("======================");
		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int grade= dis.readInt();
			System.out.println(name + "\t"+score+"\t"+grade);
			
		}
		dis.close(); fis.close();
	}
}
