package com._520it._day02_03_buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//字符缓冲流
public class BufferedWriter_ReaderDemo {
	public static void main(String[] args) throws Exception {
		//输出
		BufferedWriter out = new BufferedWriter( new FileWriter("file/stream.txt"));
		out.write("莫名我就喜欢你！");
		//*******newLine()  写入一个行分隔符。
		out.newLine();
		out.write("深深地爱上你。");
		out.close();
		//输入
		BufferedReader in = new BufferedReader(new FileReader("file/stream.txt"));
	/*	char[] buffer = new char[1024];
		int len = -1;
		while((len =in.read(buffer))!=-1){
			System.out.println(new String(buffer,0,len));
		}*/
		//*********readLine()  读取一个文本行。
		String line = null;
		while((line = in.readLine())!=null){
			System.out.println(line);
		}
       
       in.close();
	}
}
