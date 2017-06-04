package com._520it._day01_02_file_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//��ʾ�ļ��ֽ������
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//1������Ŀ�����(��ʾ�����ݱ��浽��һ���ļ�)
		File target = new File("file/stream.txt");
		//2�������ļ��ֽ����������ˮ�ܣ�
		OutputStream out = new FileOutputStream(target,true);//�������ĵڶ�������Ĭ��Ϊfalse���������ڶ�������Ϊ true�����ֽ�д���ļ�ĩβ��
		//3��������������������д������
		/**
			void write(byte[] b) �� b.length ���ֽڴ�ָ�� byte ����д����ļ�������С�
 			void write(byte[] b, int off, int len) ��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д����ļ��������
 			void write(int b) ��ָ���ֽ�д����ļ������

		 */
		//out.write(65);//��ָ���ֽ�д����ļ�������� 
		//out.write("abcdef".getBytes());//�� b.length ���ֽڴ�ָ�� byte ����д����ļ�������С�
		out.write("I Miss You WoDeFang".getBytes(),7,6);//��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д����ļ��������
		//4���ر���Դ����
		out.close();
	}
}
