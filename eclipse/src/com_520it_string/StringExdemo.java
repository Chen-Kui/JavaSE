package com_520it_string;

public class StringExdemo {
	public static void main(String[] args) {
		test1();

	}

	//获取以hello开头的文件名的后缀名
	private static void test1() {
		// TODO Auto-generated method stub
		String fielName = "abc.java;hello.java;hello.class;hello.txt";
		//以分号为分割线分割字符串，获取每一个文件的文件名和扩展名。
		String[] names = fielName.split(";");
		for (String name : names) {
			//System.out.println(name);
			//判斷每個字符串是否以hello開頭
			if(name.startsWith("hello"))
			{
				//
				System.out.println(name);
				int i =name.lastIndexOf(".");
				//System.out.println(i);
				//获取字符串
				String newName =name.substring(i);
				System.out.println(newName);
			}
		}
	}
}
