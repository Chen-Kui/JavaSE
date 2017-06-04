package com._520it._day01_02_file_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//ʹ���ֽ�������ļ��Ŀ�������
public class StreamCopyDemo {
	public static void main(String[] args) throws Exception {
		//����Դ��Ŀ��
		File srcFile = new File("file/stream.txt");
		File destFile = new File("file/stream_copy.txt");
		//������������������
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		//��������Ϊ10�Ļ���������ȡ�Ѿ���ȡ���ֽ����ݣ�
		byte[] buffer = new byte[10];
		int len = -1;//��ʾ�Ѿ���ȡ���ٸ��ֽڵ����������-1���ʾ��ȡ�����
		while ((len = in.read(buffer))!=-1) {
			//System.out.println(new String(buffer,0,len));
			out.write(buffer, 0, len);
		}
		in.close();
		out.close();
	}
}
