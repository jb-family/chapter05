package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args)throws IOException {

		//파일을 읽는다. Ex02에 있는 song.txt를 읽어옴
		//권총
		Reader fr = new FileReader("C:\\javaStudy\\file\\song.txt");
		
		//소음기 (권총은 그대로있고 부품만 달아놓는것)
		//buffer는 속도를 빠르게 해준다. buffer기능 다시 정리 
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			
			String str = br.readLine();//한줄씩 읽어온다. 줄바꿈기호는 제외

			if(str == null) {
				break;
			}
			System.out.println(str);
			
			
		}
		
		
		
		br.close();
	}

}
