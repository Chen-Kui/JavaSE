package com._520it._day02_03_buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//�ַ�������
public class BufferedWriter_ReaderDemo {
	public static void main(String[] args) throws Exception {
		//���
		BufferedWriter out = new BufferedWriter( new FileWriter("file/stream.txt"));
		out.write("Ī���Ҿ�ϲ���㣡");
		//*******newLine()  д��һ���зָ�����
		out.newLine();
		out.write("����ذ����㡣");
		out.close();
		//����
		BufferedReader in = new BufferedReader(new FileReader("file/stream.txt"));
	/*	char[] buffer = new char[1024];
		int len = -1;
		while((len =in.read(buffer))!=-1){
			System.out.println(new String(buffer,0,len));
		}*/
		//*********readLine()  ��ȡһ���ı��С�
		String line = null;
		while((line = in.readLine())!=null){
			System.out.println(line);
		}
       
       in.close();
	}
}
