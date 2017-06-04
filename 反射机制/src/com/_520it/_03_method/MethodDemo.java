package com._520it._03_method;

import java.lang.reflect.Method;

//通过反射获取类中的方法
public class MethodDemo {
	class User {
		public void doWork() {
		}

		public void doWork(String name) {
		}

		public String sayHello(String name, int age) {
			return name + "," + age;
		}
	}

	public static void main(String[] args) throws Exception {
		//getAll();
		getOne();
	}
	//获取User类中指定的一个方法
	private static void getOne() throws Exception {
		Class clz = User.class;
		//需求:获取doWork()方法
		Method m = clz.getMethod("doWork");
		System.out.println(m);
		//需求：获取public void doWork(String name)方法
			m = clz.getMethod("doWork", String.class);
			System.out.println(m); 
		//需求:获取public String sayHello(String name, int age)方法
			m = clz.getDeclaredMethod("sayHello", String.class,int.class);
			System.out.println(m);
	}
	//获取User类中的所有方法
	private static void getAll() {
		Class clz = User.class;
		/**
		 *  Method[] getMethods() 
          	返回一个包含某些 Method 对象的数组，这些对象反映此 Class 对象所
          	表示的类或接口（包括那些由该类或接口声明的以及从超类和超接口继承的那些的类或接口）的公共 member 方法。 
		 */
		Method[] m = clz.getMethods();
		System.out.println(m.length);
		for (Method method : m) {
			System.out.println(method);
		}
		System.out.println("====================================");
		/**
		 *  Method[] getDeclaredMethods() 
          	返回 Method 对象的一个数组，这些对象反映此 Class 对象表示的类或接口声明的所有方法，
          	包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。 
		 */
		m =clz.getDeclaredMethods();
		System.out.println(m.length);
		for (Method method : m) {
			System.out.println(method);
		}
	}
}
