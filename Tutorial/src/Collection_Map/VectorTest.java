package Collection_Map;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import Collecction_Hash.MyStudent;

public class VectorTest {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("홍길동");
		v.addElement("이순신");
		v.addElement(new Integer(123));
		v.addElement("홍길동");
		v.addElement(new Integer(123));
		v.addElement(new MyStudent());
		
		/**Iterator elements = v.iterator();
		while (elements.hasNext()) {
			System.out.println(elements.next());	
		}**/
		
		Enumeration enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
			
		}
		
	}
}
