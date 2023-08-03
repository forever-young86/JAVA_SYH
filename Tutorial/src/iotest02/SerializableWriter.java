package iotest02;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("d:\\temp\\ObjectEx.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		ClassA ca = new ClassA();
		ca.field1 = 1;
		ca.field2.field1 = 2;
		ca.field3 = 3;
		ca.field4 = 4;

		oos.writeObject(ca);
		oos.flush(); oos.close(); fos.close();

	}
}
