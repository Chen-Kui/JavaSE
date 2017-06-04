package com._520it._day02_03_buffer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;

//ºÏ²¢Á÷
public class StringWriterReaderDemo {
	public static void main(String[] args) throws Exception {
		SequenceInputStream in = new SequenceInputStream(new FileInputStream("file/stream.txt"),new FileInputStream("file/Stream2.txt"));
		byte[] buffer = new byte[1024];
		int len = -1;
		while((len = in.read(buffer))!=-1){
			System.out.println(new String(buffer,0,len));
		}
	}
}
