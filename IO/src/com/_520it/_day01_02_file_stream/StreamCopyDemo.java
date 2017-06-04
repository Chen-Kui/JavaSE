package com._520it._day01_02_file_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//使用字节流完成文件的拷贝操作
public class StreamCopyDemo {
	public static void main(String[] args) throws Exception {
		//创建源和目标
		File srcFile = new File("file/stream.txt");
		File destFile = new File("file/stream_copy.txt");
		//创建输入和输出流对象
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		//创建容量为10的缓冲区（存取已经读取的字节数据）
		byte[] buffer = new byte[10];
		int len = -1;//表示已经读取多少个字节的数，如果是-1则表示读取到最后
		while ((len = in.read(buffer))!=-1) {
			//System.out.println(new String(buffer,0,len));
			out.write(buffer, 0, len);
		}
		in.close();
		out.close();
	}
}
