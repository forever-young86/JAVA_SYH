package Collection_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		//Map 컬랙션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
			//String: key, 값 :Integer				
		map.put("신용권", 85); //객체저장
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); //홍길동 key 값이 동일할때는 마지막것이 저장된다
		System.out.println("총 entry 수:"+map.size()); //저장된 총 객체 수
		
		System.out.println("\t홍길동: "+map.get("홍길동")); //key로 값을 검색
		System.out.println();
		
		Set<String> keySet = map.keySet(); //key set 얻기 (모든 key들의 집합)
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) { //반복해서 key를 얻고 값을 Map에서 얻는다
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		map.remove("홍길동"); //객체삭제 : key로 제거
		System.out.println("총 entry 수:" + map.size());
		
		//Map.Entry Set으로 entry (객체정보)를 모아 key 와 값(value)을 얻는다.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+":"+value);
			
		}
		System.out.println();
		
		map.clear(); //모든 entry 삭제
		System.out.println("총 entry 수:" + map.size());
	}
}
