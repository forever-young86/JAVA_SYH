package iotest01;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class SystemInOut3 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in; //콘솔에 문자열 입력
		PrintStream ps = System.out; //콘솔로 문자열을 출력함
		
		byte[] datas = new byte[1000]; //배열로 문자열 저장, 읽어오기
		
		System.out.println("이름:");
		int nameLen=is.read(datas);//is.read(datas) 입력내용저장
		String name= new String(datas, 0, nameLen-2);//배열로 문자열 불러오기. 0 :처음 인덱스/ -2: 엔터값
		
		System.out.println("하고싶은말:");
		int commLen = is.read(datas);
		String comment = new String (datas, 0, commLen -2);
		
		ps.println("입력한 이름:" + name); //콘솔로 문자열 출력 = System.out.println 와 같음
		ps.println("입력한 하고 싶은말:" + comment);
		
		System.out.println("입력한 이름:" + name);
		System.out.println("입력한 하고 싶은말:" + comment);
	}
}
