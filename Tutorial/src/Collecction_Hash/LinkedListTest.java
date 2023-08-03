package Collecction_Hash;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList fruitList = new LinkedList();
		
		fruitList.add("사과");
		fruitList.add("바나나");
		fruitList.add("수박");
		fruitList.add(2,"망고"); //2번째 인덱스에 수박대신 망고가 들어간다, 수박은 4번째로 밀린다
		
		int position = fruitList.indexOf("수박");
		System.out.println("수박의 위치:"+position);
		
		fruitList.set(0,"오렌지"); //인덱스 0번째 사과대신에 오렌지가 들어간다
		Object fruitName = fruitList.get(0);//Object는 최상위클래스이기에 넣으면 모든타입을 받는다
		//=String fruitName = (String) fruitList.get(0)
		System.out.println("과일이름:"+fruitName);
		
		fruitList.remove(1);
		fruitList.remove("수박");
		int size = fruitList.size();
		System.out.println("연결리스트 값 출력하기");
		
		for (int cnt = 0; cnt < size; cnt++) {
			fruitName = fruitList.get(cnt);
			System.out.println(fruitName);
		}
	}
}
