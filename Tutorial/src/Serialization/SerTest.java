package Serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerTest {

	public static void main(String[] args) {
		Employee p = new Employee("박지성", "대전", "11111-222222", "123-1234");
		Employee p2 = new Employee("차범근", "서울","33333-444444", "987-6543");
		
		ArrayList list = new ArrayList();
		list.add(p);
		list.add(p2);
		try {//serial.ser 생김
			//ObjectOutputStream의 writeObject( )를 이용하여 직렬화
			//객체는 바이트 데이터로 저장되거나 전송
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("d:\\temp\\serial.ser")));
			oos.writeObject(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
