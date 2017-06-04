package com._520it._day01_01_file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

//�ļ�������
//listFiles(FileFilter filter) 
//���س���·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼��
public class FileDemo6 {
	public static void main(String[] args) {
		final File dir = new File("F:/abc");
		File[] ds = dir.listFiles(new FilenameFilter() {

			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});
		for (File file : ds) {
			System.out.println(file);
		}

	}
}
