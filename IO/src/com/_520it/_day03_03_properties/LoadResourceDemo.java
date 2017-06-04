package com._520it._day03_03_properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

//加载properties文件
public class LoadResourceDemo {
	public static void main(String[] args) throws Exception {
		//创建properties对象
		Properties p = new Properties();
		InputStream istream = new FileInputStream("C:/Users/Administrator/Desktop/Eclipse代码/IO/src/db.properties");
		//加载流中的数据，加载之后，数据都在p对象中
		p.load(istream);
		System.out.println(p);
		System.out.println("账号："+p.getProperty("username"));
		System.out.println("密码： "+p.getProperty("password"));
	}
}
