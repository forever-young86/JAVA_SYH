package iotest01;

import java.io.IOException;
import java.io.InputStream;

public class SystemInOut2 {

	public static void main(String[] args) throws IOException {
		System.out.println("==메뉴==");
		System.out.println("1.셔츠");
		System.out.println("2.아우터");
		System.out.println("3.바지");
		System.out.println("4.수트");
		System.out.println("상품을 선택하세요");
		
		InputStream is = System.in; //키보드 입력 스트림 얻기
		char inChar = (char)is.read();
		switch (inChar) {
		case '1':
			System.out.println("셔츠를 선택하셨습니다.");
			break;
		case '2':
			System.out.println("아우터를 선택하셨습니다.");
			break;
		case '3':
			System.out.println("바지를 선택하셨습니다.");
			break;
		case '4':
			System.out.println("수트를 선택하셨습니다.");
			break;
	
		}
	}
}
