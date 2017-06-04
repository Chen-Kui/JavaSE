package com._520it._day01_01_file;

import java.io.File;

//列出指定目录中的所有文件，包括文件夹中的所有文件，（使用递归算法(recursion)）
public class FileDemo3 {
	public static void main(String[] args) {
		File dir = new File("F:");
			listAllFile(dir);
	}
//列出所有的文件
	private static void listAllFile(File f) {
		//第一级子文件
		File[] fs = f.listFiles();
		for (File a : fs) {
			//如果子文件是目录，则继续递归
			if (a.isDirectory()) {
				listAllFile(a);
			}else{			//如果子文件是文件，则打印
				
				System.out.println(a);
				
			}
				
		}
		
	}
	private static void listFiles(File a) {
		// TODO Auto-generated method stub
		
	}
}
