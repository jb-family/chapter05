package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args)throws IOException {
	
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB_원본.txt");//파일불러옴
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");//번역돌림
		BufferedReader br = new BufferedReader(isr);// 소음기장착 (권총에) 프로그램에 넣음

		
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}else {
			String[] sArray = str.split(",");
			System.out.println( "이름 :"  + sArray[0]);
			System.out.println( "핸드폰 :"  + sArray[1]);
			System.out.println( "회사 :"  + sArray[2]);
			System.out.println("");
			}
		}
		
		
		
		br.close();
		
	}

}
