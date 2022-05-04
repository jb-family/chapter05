package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args)throws IOException {

		//보조스트림은 섞어쓰기 안함(레퍼런스타입과 객체 )
		
		//InputStream(권총)
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		//Buffered(소음기) in(권총)이랑 연결되어있음
		BufferedInputStream bin = new BufferedInputStream(in);

		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\bufferedImg.jpg");
		
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		while(true) {
			int data = bin.read();
		
			if(data == -1) {
				System.out.println("복사시작");
				break;
			}
			System.out.println("복사끝" + data);
			bout.write(data);
		}
		//런 버튼 누르면 비워지고 처음부터 다시 만들어진다.
		
		
		
		
		
		bout.close();
		bin.close();
		in.close();
	}

}
