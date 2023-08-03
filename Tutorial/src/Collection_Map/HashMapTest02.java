package Collection_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import Collecction_Hash.MyStudent;

public class HashMapTest02 {

	public static void main(String[] args) {
		Map map = new HashMap(); 
		map.put("first", new Integer(100));
		map.put("second", "Hello Wordl!");
		map.put("third", new MyStudent());
		map.put("fourth", null);
		
		Set set = map.keySet(); //모든 키를 가져온다
		Collection col = map.values();//모든 값을 가져온다
		
		Iterator ite = set.iterator();
		System.out.println("키를 출력합니다");
		while (ite.hasNext()) {
			System.out.println(ite.next());
			
		}
		
		ite=set.iterator();
		System.out.println("\n키를 이용해서 값을 출력합니다.");
		while (ite.hasNext()) {
			String key = (String) ite.next();
			System.out.println(map.get(key));
		}
		
		ite=col.iterator();
		System.out.println("\n값을 출력합니다.");
		while (ite.hasNext()) {
			System.out.println(ite.next());
			
		}
			
		}
	

	
}
