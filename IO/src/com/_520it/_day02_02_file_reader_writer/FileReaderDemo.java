package com._520it._day02_02_file_reader_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//文件的字符输入流
public class FileReaderDemo {
	public static void main(String[] args) throws Exception {
		File srcFile = new File("file/ck");
		FileReader in =new FileReader(srcFile);
		/**
		 * 	abstract  int read(char[] cbuf, int off, int len) 
        	 将字符读入数组的某一部分。 
 			int read(CharBuffer target) 
          	试图将字符读入指定的字符缓冲区。 
 			boolean ready() 
          	判断是否准备读取此流。 

		 */
		char[] buffer = new char[30];
		int len = -1;
		len =in.read(buffer);
		while(len!=-1){
			System.out.println(buffer);
			len = in.read(buffer);
		}
		
		in.close();
	}
}
