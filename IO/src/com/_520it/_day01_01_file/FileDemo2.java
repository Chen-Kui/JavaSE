package com._520it._day01_01_file;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		//创建File对象(三种方法)
		File f = new File("F:/abc/ck/123.txt");
		File f2 = new File("F:/abc/ck","123.txt");
		File dir = new File("F:/abc/ck");
		File f3 = new File(dir,"123.txt");
		
		System.out.println(f);
		System.out.println(f2);
		System.out.println(f3);
	}
}
