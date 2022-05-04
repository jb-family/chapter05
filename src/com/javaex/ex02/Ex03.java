package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex03 {

	public static void main(String[] args)throws IOException {

		//MS949라 번역안됨
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\MS949.txt");
		
		//in에 있는 MS949를 br로 번역기돌림 첫번째변수는 파일명 두번째변수는 번역할 타입
		InputStreamReader isr = new InputStreamReader(in, "MS949");	
		BufferedReader br = new BufferedReader(isr);		//돌려진걸 읽음
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\MS949-copy.txt");//복사
		OutputStreamWriter osw = new OutputStreamWriter(out, "MS949");
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			System.out.println(str);
			bw.write(str);
			bw.newLine();
			
		}
		
		bw.close();
		br.close();
		in.close();
		isr.close();
		br.close();
	}

}
