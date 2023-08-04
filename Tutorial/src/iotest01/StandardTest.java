package iotest01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardTest {

	public static void main(String[] args) {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		String msg = null;
		System.out.println("Exit: ctrl+z");
		
		try {
			msg = in.readLine();
			while(msg!=null) {
			System.out.println("읽기:"+msg); //반복해서 입력,읽기가 가능, 빠져나오려면 ctrl+z : 더이상 입력이 안됨
			msg=in.readLine();
			
			}
			in.close(); //안에것부터 종료한다
			ir.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
