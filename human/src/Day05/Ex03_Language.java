package Day05;

public class Ex03_Language {

	public static void main(String[] args) {
		
		int count[] = new int [6];
		for (int i = 0; i < count.length; i++) {
			count[i] =i+1;
			
		}
		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i]+" ");
			
		}
		System.out.println();
		
		//배열 선언 및 초기화
		String language[] = {"java", "html", "css", "javascript", "sql", "python"
		};
		
		//배열.length :배열의 길이 (배열 요소의 개수)
		for (int i = 0; i < language.length; i++) {
			System.out.print(language[i] + " ");
					
		}
		System.out.println();
		
		//foreach - 배열의 모든 요소를 반복
		for (String lang: language) {
			System.out.print(lang + " ");
			
		}
		System.out.println();
	
	}
	
	
}
