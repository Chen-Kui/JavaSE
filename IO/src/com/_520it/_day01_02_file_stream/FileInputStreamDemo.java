package com._520it._day01_02_file_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

//演示文件输入流
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//1、创建源（挖井）
		File f = new File("file/stream.txt");
		//2、创建文件字节输入流对象，并接在源上
		FileInputStream in = new FileInputStream(f);
		//3、具体的读取操作
		/**
		 * 			int read() 
          		从此输入流中读取一个数据字节。 
 					int read(byte[] b) 
          		从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。 
 					int read(byte[] b, int off, int len) 
          		从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。 

		 */
		//int data = in.read();
		//System.out.println(data);
		byte[] buffer = new byte[15];
		//in.read(buffer);
		in.read(buffer,3,8);
		System.out.println(Arrays.toString(buffer));
		
		//4、关闭资源
		in.close();
	}
}
