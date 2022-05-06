package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Ex03 {

	public static void main(String[] args)throws IOException {
		List<Person> pList = new ArrayList<Person>();
		/*
		//1. 파일을 읽어온다.
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB_원본.txt");
		//2. 파일을 번역한다. in을 번역한다. 뭘로? UTF-8로
		InputStreamReader isr = new InputStreamReader(in, "UTF-8"); 
		//3. 번역된 파일을 프로그램에 보내준다.
		BufferedReader br = new BufferedReader(isr);
		*/
		
		//읽기 Stream
		Reader rd = new FileReader("C:\\javaStudy\\file\\PhoneDB_원본.txt");
		BufferedReader br = new BufferedReader(rd);
		
		
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			String[] sArray = str.split(",");
			String name = sArray[0];
			String hp = sArray[1];
			String company = sArray[2];
			pList.add(new Person(name, hp, company));
		}//while문 끝
		
		pList.add(new Person("황일영", "010-2221-2222", "02-123-4567"));
		
		for(Person p : pList) {
			System.out.println("이름 :" + p.getName());
			System.out.println("핸드폰 :" + p.getHp());
			System.out.println("회사 :" + p.getCompany());
			System.out.println("");
		}
		
		
		//쓰기 Stream	
		// Writer Stream은 사용하는 순간 백지됨. 그래서 내용 다 읽어오고 써야한다.	
		Writer wt = new FileWriter("C:\\javaStudy\\file\\PhoneDB_원본.txt");
		BufferedWriter bw = new BufferedWriter(wt);
		
		/*
		//1. 파일을 복사한다.
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\PhoneDB_원본.txt");
		//2. 복사할 파일을 번역한다.
		OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");//
		//3. 프로그램에서 번역할 파일을 번역기에 보내준다.
		BufferedWriter bw = new BufferedWriter(osw);
		*/
		
	
		
		for(Person person : pList) {
			//saveStr에 pList를 담는다. (pList는 person변수에 담음)
			//저장할때에는 원본 파일을 바꾸지않는다. 그래야 위에서 입력한 값들이 동일하게 읽어올수있다. 
			String saveStr = person.getName() + "," + person.getHp() + "," + person.getCompany();
			bw.write(saveStr);
			bw.newLine();
		}
		
		
		
		
		bw.close();
		br.close();
	}

}
