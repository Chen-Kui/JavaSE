package com._520it._day03_01_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//使用对象流来来实现序列化和反序列化
public class ObjectStreamDemo {
	public static void main(String[] args) throws Exception, Exception {
		File f = new File("file/Object.txt");
		//writeObject(f);
		readObject(f);
	}

	//序列化操作
	private static void writeObject(File f) throws Exception, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
		out.writeObject(new User("陈奎","游泳",21));
		out.close();
		
	}
	//反序列化操作
	private static void readObject(File f) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		User user = (User) in.readObject();
		System.out.println(user);
		in.close();
	}
}
