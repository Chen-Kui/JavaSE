package com._520it._day02_03_buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//�ֽڻ�����
public class BufferStreamDemo {
	public static void main(String[] args) throws Exception {
		//�ֽڻ���������
		BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream("kk.txt"));
		bf.write("hello java".getBytes());
		bf.close();
		//�ֽڻ���������
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("kk.txt"));
		byte[] buffer = new byte[1024];
		int len = -1;
		while((len = in.read(buffer))!=-1){
			System.out.println(new String(buffer,0,len));
		}
	}
}
