package com._520it._day03_03_properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

//����properties�ļ�
public class LoadResourceDemo {
	public static void main(String[] args) throws Exception {
		//����properties����
		Properties p = new Properties();
		InputStream istream = new FileInputStream("C:/Users/Administrator/Desktop/Eclipse����/IO/src/db.properties");
		//�������е����ݣ�����֮�����ݶ���p������
		p.load(istream);
		System.out.println(p);
		System.out.println("�˺ţ�"+p.getProperty("username"));
		System.out.println("���룺 "+p.getProperty("password"));
	}
}
