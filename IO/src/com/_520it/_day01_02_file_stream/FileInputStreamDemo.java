package com._520it._day01_02_file_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

//��ʾ�ļ�������
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//1������Դ���ھ���
		File f = new File("file/stream.txt");
		//2�������ļ��ֽ����������󣬲�����Դ��
		FileInputStream in = new FileInputStream(f);
		//3������Ķ�ȡ����
		/**
		 * 			int read() 
          		�Ӵ��������ж�ȡһ�������ֽڡ� 
 					int read(byte[] b) 
          		�Ӵ��������н���� b.length ���ֽڵ����ݶ���һ�� byte �����С� 
 					int read(byte[] b, int off, int len) 
          		�Ӵ��������н���� len ���ֽڵ����ݶ���һ�� byte �����С� 

		 */
		//int data = in.read();
		//System.out.println(data);
		byte[] buffer = new byte[15];
		//in.read(buffer);
		in.read(buffer,3,8);
		System.out.println(Arrays.toString(buffer));
		
		//4���ر���Դ
		in.close();
	}
}
