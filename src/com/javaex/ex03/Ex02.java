package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args)throws IOException {
	
		
		List<Person> pList = new ArrayList<Person>();
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB_원본.txt");//파일불러옴
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");//번역돌림
		BufferedReader br = new BufferedReader(isr);// 소음기장착 (권총에) 프로그램에 넣음


		while(true) {
			String str = br.readLine(); 
			if(str == null) {
				break;
			}
				String[] sArray = str.split(",");
				pList.add(new Person(sArray[0], sArray[1], sArray[2]));
		}//while끝
		
			System.out.println(pList.toString());
			
		
		
		
		
		
		br.close();
		
	}

}
