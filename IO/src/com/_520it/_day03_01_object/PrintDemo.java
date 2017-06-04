	package com._520it._day03_01_object;
	
	//Java中的格式化输出
	public class PrintDemo {
		public static void main(String[] args) {
			//需求：打印一句话->	姓名：陈奎，年龄：21
			String name = "陈奎";
			int age = 21;
			//传统方法
			System.out.println("姓名："+name+","+"年龄："+age);
			//格式化方法
			System.out.printf("姓名： %s,年龄: %d","陈奎",21);
		}
	}
