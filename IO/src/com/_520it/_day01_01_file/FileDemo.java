package com._520it._day01_01_file;

import java.io.File;

//ϵͳƽ̨�ķָ���
public class FileDemo {
	public static void main(String[] args) {
		//��ȡ���Էָ��
		String pathSeparator = File.pathSeparator;
		char pathSeparatorChar = File.pathSeparatorChar;
		System.out.println(pathSeparator);
		System.out.println(pathSeparatorChar);
		//��ȡ·���ָ��
		String separator = File.separator;
		System.out.println(separator);
		//��ʾ�ļ���·��
		String path1 = "c:\\ck\\123.java";
		String path2 = "c:"+File.separator+"12.txt";
		System.out.println(path1);
		System.out.println(path2);
		
	}
}
