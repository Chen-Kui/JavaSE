package com._520it._day03_02_sdandard;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//��׼��IO����
public class SystemIODemo {
	public static void main(String[] args) throws Exception {
		//��׼�������
		/*System.out.println("...begin...");
		int data = System.in.read();//���ܼ���¼���һ���ֽ�
		System.out.println(data);
		System.out.println("...ending...");*/
		//********************************************
		
/*		static void setIn(InputStream in) 
      	 ���·��䡰��׼���������� 
		static void setOut(PrintStream out) 
                 ���·��䡰��׼���������*/ 

		//�ض����׼������
		System.setIn(new FileInputStream("file/stream.txt"));
		//�ض����׼�����
		System.setOut(new PrintStream(new FileOutputStream("file/xx.txt")));
		System.out.println("...begin...");
		int data = System.in.read();//���ܼ���¼���һ���ֽ�
		System.out.println(data);
		System.out.println("...ending...");
		
	
	}
}
