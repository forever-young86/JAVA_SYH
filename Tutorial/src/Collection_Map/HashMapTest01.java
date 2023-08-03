package Collection_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import Collecction_Hash.MyStudent;

public class HashMapTest01 {

	public static void main(String[] args) {
		Map map = new HashMap(); //키와 값을 넣지 않음
		map.put("first", new Integer(100));
		map.put("second", "Hello Wordl!");
		map.put("third", new MyStudent());
		map.put("fourth", null);
		
		Set set = map.keySet(); //모든 키를 가져온다
		Collection col = map.values();//모든 값을 가져온다
		
		Object[] obj = set.toArray();
		System.out.println("키를 출력합니다");
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
		System.out.println("\n키를 이용해서 값을 출력합니다.");
		for (int i = 0; i < obj.length; i++) {
			String key = (String) obj[i];
			System.out.println(map.get(key));
		}
		
		System.out.println("\n값을 출력합니다.");
		obj = col.toArray();
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
			
		}
	
	}
}
