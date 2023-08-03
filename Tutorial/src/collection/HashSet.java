package collection;

import java.util.Iterator;
import java.util.Set;

public class HashSet {

	public static void main(String[] args) {
		Set<String> set = new java.util.HashSet<String>();
		set.add("java"); //list 처럼 순서가 없다!!
		set.add("jdbc");
		set.add("servlet");
		set.add("spring");
		
		Iterator<String> it = set.iterator();//set에 있는 데이터들을 반복해서 검색하겠다
		while (it.hasNext()) {//hasNext()  :가져올 객체가 있으면 true로 밑에 실행
			String element =it.next(); //it.next(); 하나의 객체를 가져온다
			System.out.println(element); //set에 들어있는 데이터들이 순서없이 출력
		}
		System.out.println();
		set.remove("jdbc");//remove(): 삭제하려는 객체를 똑같이 쓴다
		System.out.println("개수:"+set.size());
		System.out.println();
		
		it = set.iterator();
		while (it.hasNext()) {
			String element =it.next(); 
			System.out.println(element);
		}
		set.clear();//전체 삭제
		if(set.isEmpty()) //isEmpty(): 데이터가 비어있는지 확인
			System.out.println("비어있음");
	}
}
