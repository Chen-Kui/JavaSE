package com._520it._day02_02_file_reader_writer;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

//����ͽ���
public class EncodingDemo {
	public static void main(String[] args) throws Exception {
		//�������- String ->byte[]
		String data = "������";
		byte[] ms = data.getBytes("GBK");
		System.out.println(Arrays.toString(ms));
		//�������
		String ds = new String(ms,"GBK");
		System.out.println(ds);
		
	}
}
