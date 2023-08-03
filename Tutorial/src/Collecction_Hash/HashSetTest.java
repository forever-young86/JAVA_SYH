package Collecction_Hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<MyStudent> set = new HashSet<MyStudent>();
		//list, set 에는 데이터 타입을 꼭 넣어준다 --> <MyStudent>Type
		Set set1= new HashSet();
		set1.add("Hello");
		set1.add(new Integer(100));
		set1.add(300);
		set1.add(12.345F);
		set1.add(new MyStudent());
		set1.add(new MyStudent("Java",3));
		
		/**
		Object[] obj =set.toArray(); //Object 타입
		for (int i = 0; i < set.size(); i++) 
			System.out.println(obj[i]);
			
		System.out.println(set);**/
	
		//set.add("Hello"); --><MyStudent>타입이 아니기때문에 오류!
		/**set.add(new MyStudent());
		set.add(new MyStudent("java",3)); //-->Total 객체 2개!**/
		
		/**Object[] obj =set.toArray(); //Object 타입
		for (int i = 0; i < set.size(); i++) 
			System.out.println(obj[i]);
		System.out.println();
		System.out.println(set);**/
		
		Iterator elements = set1.iterator();
		while (elements.hasNext()) {
			System.out.println("Set="+elements.next());
		}
		
	}
}
