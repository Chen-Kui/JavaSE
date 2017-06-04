package com._520it._day03_04randomaccessfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

//读写文件的任意位置
public class RandomAccessFileDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("file/raf.txt");
		//write(f);
		read(f);
	}

	private static void read(File f) throws Exception {
		RandomAccessFile raf = new RandomAccessFile(f, "r");
		System.out.println("文件指针位置："+raf.getFilePointer());
		System.out.println(raf.readByte());
		String r =raf.readUTF();
		System.out.println("文件指针位置："+raf.getFilePointer());
		System.out.println(r);
		raf.close();

	}

	private static void write(File f) throws Exception {
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		raf.writeByte(65);
		raf.writeUTF("奎哥哥");

		raf.close();

	}
}
