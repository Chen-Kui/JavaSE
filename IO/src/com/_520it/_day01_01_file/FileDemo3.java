package com._520it._day01_01_file;

import java.io.File;

//�г�ָ��Ŀ¼�е������ļ��������ļ����е������ļ�����ʹ�õݹ��㷨(recursion)��
public class FileDemo3 {
	public static void main(String[] args) {
		File dir = new File("F:");
			listAllFile(dir);
	}
//�г����е��ļ�
	private static void listAllFile(File f) {
		//��һ�����ļ�
		File[] fs = f.listFiles();
		for (File a : fs) {
			//������ļ���Ŀ¼��������ݹ�
			if (a.isDirectory()) {
				listAllFile(a);
			}else{			//������ļ����ļ������ӡ
				
				System.out.println(a);
				
			}
				
		}
		
	}
	private static void listFiles(File a) {
		// TODO Auto-generated method stub
		
	}
}
