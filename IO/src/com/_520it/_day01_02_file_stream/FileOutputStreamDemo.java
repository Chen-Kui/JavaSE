package com._520it._day01_02_file_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//演示文件字节输出流
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//1、创建目标对象，(表示把数据保存到哪一个文件)
		File target = new File("file/stream.txt");
		//2、创建文件字节输出流对象（水管）
		OutputStream out = new FileOutputStream(target,true);//构造器的第二个参数默认为false，如果如果第二个参数为 true，则将字节写入文件末尾处
		//3、具体的输出操作（往外写操作）
		/**
			void write(byte[] b) 将 b.length 个字节从指定 byte 数组写入此文件输出流中。
 			void write(byte[] b, int off, int len) 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。
 			void write(int b) 将指定字节写入此文件输出流

		 */
		//out.write(65);//将指定字节写入此文件输出流。 
		//out.write("abcdef".getBytes());//将 b.length 个字节从指定 byte 数组写入此文件输出流中。
		out.write("I Miss You WoDeFang".getBytes(),7,6);//将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。
		//4、关闭资源对象
		out.close();
	}
}
