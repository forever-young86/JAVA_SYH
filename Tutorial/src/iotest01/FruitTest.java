package iotest01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class FruitTest {

	static HashMap<String, Number> map;
	
	public static void main(String[] args) {
	
		String fruitName = null;
		int value=0;
		
		File file = new File("d:\\temp\\fruitData.txt");
				
		try {
			map = new HashMap<String,Number>();
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			s = in.readLine();
			System.out.println("과일정보:");
			System.out.println("=====================");
			while (s!=null) {
				System.out.println(s);
				calcFruit(s);
				s=in.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			 
		System.out.println("==========================");
		System.out.println("과일 개수 출력하기");
		System.out.println(map);
		/**Set set = map.keySet();
		Iterator ite = set.iterator();
		
		while(ite.hasNext()) {
			fruitName=(String)ite.next();
			value=(Integer)map.get(fruitName);
			System.out.print(fruitName+":"+value+"개");
		}**/
	}
	
	private static void calcFruit(String s) {
		String fruitName = null;
		int value =0;
		boolean isExisted = false;
		
		StringTokenizer st = new StringTokenizer(s,","); //문자열을 토큰화하여 ,를 구분자로하여 분리
		while (st.hasMoreTokens()) {
			Set set = map.keySet();
			Iterator ite = set.iterator();
			fruitName=st.nextToken(); 
			while (ite.hasNext()) {//과일이름을 하나하나씩 센다
				String name = (String)ite.next();
				if (fruitName.equals(name)) {
					value=(Integer)map.get(name);
					map.put(name, ++value);
					isExisted = true;
					break;
				}
			} //end while
			
			if(isExisted==false) {
				map.put(fruitName,++value);
			}
			value=0;
			isExisted = false;
		}
		
		
		
		
	}
}
