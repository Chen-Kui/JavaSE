package com._520it._day02_02_file_reader_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//�ļ����ַ�������
public class FileReaderDemo {
	public static void main(String[] args) throws Exception {
		File srcFile = new File("file/ck");
		FileReader in =new FileReader(srcFile);
		/**
		 * 	abstract  int read(char[] cbuf, int off, int len) 
        	 ���ַ����������ĳһ���֡� 
 			int read(CharBuffer target) 
          	��ͼ���ַ�����ָ�����ַ��������� 
 			boolean ready() 
          	�ж��Ƿ�׼����ȡ������ 

		 */
		char[] buffer = new char[30];
		int len = -1;
		len =in.read(buffer);
		while(len!=-1){
			System.out.println(buffer);
			len = in.read(buffer);
		}
		
		in.close();
	}
}
