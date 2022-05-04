package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args)throws IOException {

		
		InputStream in = new  FileInputStream("C:\\javaStudy\\file\\img.jpg");
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteBuffImg.jpg");
		
		
		byte[] buff = new byte[1024];	
		
		
		
		while(true) {
			
			System.out.println("복사시작");
			// in을 read()로 읽어오는데 읽어오는걸 buff변수에 byte단위의 배열에 담는다. 
			//그리고 data에 넣는다.
			int data = in.read(buff);	//1024개의 공간으로 읽는다.
			
			if(data == -1) {
				System.out.println("복사끝");
				break;
			}
			out.write(buff);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		out.close();
		in.close();
	}

}
