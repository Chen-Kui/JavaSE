package com._520it._day01_01_file;

import java.io.File;

//系统平台的分隔符
public class FileDemo {
	public static void main(String[] args) {
		//获取属性分割符
		String pathSeparator = File.pathSeparator;
		char pathSeparatorChar = File.pathSeparatorChar;
		System.out.println(pathSeparator);
		System.out.println(pathSeparatorChar);
		//获取路径分割符
		String separator = File.separator;
		System.out.println(separator);
		//表示文件的路径
		String path1 = "c:\\ck\\123.java";
		String path2 = "c:"+File.separator+"12.txt";
		System.out.println(path1);
		System.out.println(path2);
		
	}
}
