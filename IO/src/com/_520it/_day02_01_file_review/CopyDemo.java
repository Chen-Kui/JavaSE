package com._520it._day02_01_file_review;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;

//�ļ���������--����ָ��Ŀ¼��ָ�������ļ���ָ��Ŀ¼
public class CopyDemo {
	public static void main(String[] args) throws Exception {
		//�ҵ�Ŀ¼�е�����java�ļ�
		File srcDir = new File("java");
		File destDir = new File("text");
		/**
		 	listFiles(FileFilter filter) 
          	���س���·�������飬��Щ·������ʾ
          	�˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼��
		 */
		File[] fs =srcDir.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return new File(dir,name).isFile() && name.endsWith(".java");
			}
		});
		//������ÿһ�����󣬲�����
		for (File file : fs) {
			//����������
			FileInputStream in =new FileInputStream(file);
			FileOutputStream out = new FileOutputStream(new File(destDir,file.getName()));
			//��д����
			byte[] buffer = new byte[10];
			int len = -1;
			len = in.read(buffer);
			while(len!=-1){
				out.write(buffer,0,len);
				len = in.read(buffer);
			}
		
		}
	}
}
