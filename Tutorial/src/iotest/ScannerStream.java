package iotest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerStream {

	public static void main(String[] args) {
		Scanner sc = null;
		PrintWriter out = null;
		double sum = 0.;
		try {
			out=new PrintWriter(new FileWriter("d:\\temp\\scanner.txt"));
			out.write("9.7");
			out.write("123.456"); //내용저장
			out.flush();
			
			sc = new Scanner(new BufferedReader(new FileReader("d:\\temp\\scanner.txt"))); //파일읽기 **BufferedReader를 사용하면 속도향상!
			while(sc.hasNext()) {
				if(sc.hasNextDouble())
					sum+=sc.nextDouble();
				else
					sc.next();
			}

			System.out.println("합계:" + sum);
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(out!=null) out.close();
			if(sc!=null) sc.close();
		}
	}
}
