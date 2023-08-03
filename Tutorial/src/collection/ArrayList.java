package collection;

import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		List<String> list = new java.util.ArrayList<String>();
		
		list.add("java"); //String type의 객체를 저장
		list.add("JDBC");
		list.add("Servelt");
		int size = list.size(); //객체 수
		System.out.println("총 객체수 :"+size);
		System.out.println();
		
		
		String web =list.get(2); //인덱스 2번째 객체 검색
		System.out.println("3번째:"+web);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) { //저장된 총 객체 수만큼 출력
			String str=list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		
		list.remove(2); //인덱스 2번째 객체 삭제
		for (int i = 0; i < list.size(); i++) {
			String str=list.get(i);
			System.out.println(i+":"+str);
		}
	}

	
}
