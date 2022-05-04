package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

   public static void main(String[] args) throws IOException{
      
	   //InputSteam, FileInputStream은 데이터 불러오는것
	   InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
	   //OutputSteam, FileOutputStream은 데이터 내보내는것
	   OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteimg.jpg");
      
      System.out.println("복사시작");
      while(true) {
         int data = in.read();	// int형 data변수에 파일을 읽어오는 것
         if(data == -1) {		//data 값이 -1이 되면 멈춘다.
        	 System.out.println("복사끝"+data);
            break;
         }
         out.write(data);	// //write메소드로 읽어온 파일은 out에 써넣는다.
      
 		//런 버튼 누르면 비워지고 처음부터 다시 만들어진다.
      }
      
      
      
      out.close();		//실행이 끝나면 out 종료
      in.close();		//실행이 끝나면 in 종료
   }

}
