package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Ex03 {

	public static void main(String[] args)throws IOException {
		List<Person> pList = new ArrayList<Person>();
		
		//1. 파일을 읽어온다.
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB_원본.txt");
		//2. 파일을 번역한다. in을 번역한다. 뭘로? UTF-8로
		InputStreamReader isr = new InputStreamReader(in, "UTF-8"); 
		//3. 번역된 파일을 프로그램에 보내준다.
		BufferedReader br = new BufferedReader(isr);
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			String[] sArray = str.split(",");
			
			pList.add(new Person(sArray[0], sArray[1], sArray[2]));
		}//while문 끝
		
		for(Person p : pList) {
			System.out.println("이름 :" + p.getName());
			System.out.println("핸드폰 :" + p.getHp());
			System.out.println("회사 :" + p.getCompany());
			System.out.println("");
		}
		
		pList.add(new Person("황일영", "010-2221-2222", "02-123-4567"));
		
		
		
		
		
		//1. 파일을 복사한다.
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\PhoneDB_원본.txt");
		//2. 복사할 파일을 번역한다.
		OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");//
		//3. 프로그램에서 번역할 파일을 번역기에 보내준다.
		BufferedWriter bw = new BufferedWriter(osw);
		
		for(int i = 0; i < pList.size(); i++) {
			bw.write("이름 : " + pList.get(i).getName());
			bw.newLine();
			bw.write("핸드폰 : " + pList.get(i).getHp());
			bw.newLine();
			bw.write("회사 : " + pList.get(i).getCompany());
			bw.newLine();
		}
		System.out.println("=================================");	
		for(Person p : pList) {
			System.out.println("이름 :" + p.getName());
			System.out.println("핸드폰 :" + p.getHp());
			System.out.println("회사 :" + p.getCompany());
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		bw.close();
		br.close();
	}

}
