package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class UnSerTest {

	public static void main(String[] args) {
		try {//serial.ser불러옥기
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("d:\\temp\\serial.ser")));
			ArrayList list = (ArrayList)ois.readObject();
			//ObjectInputStream의 readObject( )를 이용하여 역직렬화
			//객체가 다시 문자화로 전송
			
			Iterator ite = list.iterator(); //내용이 있으면 next에 대입한다
			System.out.println("사원 정보 출력\n");
			while (ite.hasNext()) {
				Employee p = (Employee) ite.next();
				System.out.println("이름:"+ p.getName());
				System.out.println("주민번호:"+ p.getJumin());
				System.out.println("주소:"+p.getAddr());
				System.out.println("전화번호:"+p.getPhone());
				
			}
		} catch (Exception e) {
		}
	}
}
