package com._520it._day02_02_file_reader_writer;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

//±àÂëºÍ½âÂë
public class EncodingDemo {
	public static void main(String[] args) throws Exception {
		//±àÂë²Ù×÷- String ->byte[]
		String data = "ÕÔÏşåû";
		byte[] ms = data.getBytes("GBK");
		System.out.println(Arrays.toString(ms));
		//½âÂë²Ù×÷
		String ds = new String(ms,"GBK");
		System.out.println(ds);
		
	}
}
