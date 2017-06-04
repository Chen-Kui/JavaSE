package com._520it._day03_02_sdandard;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//标准的IO操作
public class SystemIODemo {
	public static void main(String[] args) throws Exception {
		//标准输入操作
		/*System.out.println("...begin...");
		int data = System.in.read();//接受键盘录入的一个字节
		System.out.println(data);
		System.out.println("...ending...");*/
		//********************************************
		
/*		static void setIn(InputStream in) 
      	 重新分配“标准”输入流。 
		static void setOut(PrintStream out) 
                 重新分配“标准”输出流。*/ 

		//重定向标准输入流
		System.setIn(new FileInputStream("file/stream.txt"));
		//重定向标准输出流
		System.setOut(new PrintStream(new FileOutputStream("file/xx.txt")));
		System.out.println("...begin...");
		int data = System.in.read();//接受键盘录入的一个字节
		System.out.println(data);
		System.out.println("...ending...");
		
	
	}
}
