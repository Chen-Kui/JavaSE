package com._520it._02_constuactor;

import java.lang.reflect.Constructor;

class Person {
	public Person() {
		System.out.println("无参数构造器");
	}

	public Person(String name) {
		System.out.println("构造器"+name);
	}

	private Person(String name, int age) {
		System.out.println("构造器"+name+","+age);
	}
}
//使用反射调用构造器-->创建对象
public class CreatObjectDemo {
	public static void main(String[] args) throws Exception {
		//获取构造器所在类的字节码对象
		Class<Person> clz = Person.class;
		//获取clz对象中的指定构造器
		Constructor<Person> con = clz.getConstructor();
		/**
		 * newInstance(Object... initargs) 
          	使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。
		 */
		//调用构造器的newInstance()方法来创建对象
		con.newInstance();
		System.out.println("============================");
		Constructor<Person> con1 = clz.getConstructor(String.class);
		//调用构造器的newInstance()方法来创建对象，并传入实参
		con1.newInstance("奎哥哥");	
		System.out.println("============================");
		Constructor<Person> con2 = clz.getDeclaredConstructor(String.class,int.class);
		//设置当前构造器可以访问
		con2.setAccessible(true);
		con2.newInstance("奎哥哥",21);
	}
}
