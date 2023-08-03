package collection;

import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Member> set = new java.util.HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체수:" + set.size());
	}
}
