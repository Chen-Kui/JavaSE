package com._520it._03_method;

import java.lang.reflect.Method;

class Person {
	public void doWork() {
		System.out.println("Person.doWork()");
	}

	public void doWork(String name) {
		System.out.println("Person.doWork()" + "," + name);
	}

	private String sayHello(String name, int age) {
		System.out.println("Person.sayHello()" + "," + name + "," + age);
		return name + "," + age;
	}
}

public class MethodInvokeDemo {
	public static void main(String[] args) throws Exception, SecurityException {
		Class clz = Person.class;
		// 需求:调用public void doWork()方法
		Method m = clz.getMethod("doWork");
		/**
		 * Object invoke(Object obj, Object... args) 对带有指定参数的指定对象调用由此 Method
		 * 对象表示的底层方法。
		 */
		m.invoke(clz.newInstance());
		// 需求：调用public void doWork(String name)方法
		m = clz.getMethod("doWork", String.class);
		m.invoke(clz.newInstance(), "奎哥哥");
		// 需求：调用 private String sayHello(String name, int age)方法
		m = clz.getDeclaredMethod("sayHello",String.class,int.class);
		//设置可以访问的私有成员
		m.setAccessible(true);
		m.invoke(clz.newInstance(), "奎哥哥",21);

	}
}
