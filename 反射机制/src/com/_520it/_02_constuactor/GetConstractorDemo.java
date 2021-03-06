package com._520it._02_constuactor;

import java.lang.reflect.Constructor;

class User {
	public User() {

	}

	public User(String name) {

	}

	private User(String name, int age) {
		
	}
}

// 获取构造器
public class GetConstractorDemo {
	public static void main(String[] args) throws Exception {
		//getAll();
		getOne();
	}
private static void getOne() throws Exception{
			//获取构造器所在类的字节码对象
			Class<User> clz = User.class;
			/**
			 * Constructor<T> getConstructor(Class<?>... parameterTypes) 
         	返回一个 Constructor 对象，它反映此 Class 对象所表示的类的指定公共构造方法。 
			 */
			//获取clz对象中的指定构造器
			Constructor<User> cs = clz.getConstructor();
			System.out.println(cs);
			
	}
	//获取所有的构造器
	private static void getAll() {
		//获取构造器所在类的字节码对象
		Class<User> clz = User.class;
		//获取clz对象中所有的构造器
		/**
		 *  Constructor<?>[] getConstructors() 
       	  	返回一个包含某些 Constructor 对象的数组，这些对象反映此 Class 对象所表示的类的所有公共构造方法。 
		 */
		 Constructor<?>[] cs = clz.getConstructors();
		 System.out.println(cs.length);
		 for (Constructor<?> constructor : cs) {
			System.out.println(constructor);
		}
		 System.out.println("=======================");
		 /**
		  *  Constructor<?>[] getDeclaredConstructors() 
          	返回 Constructor 对象的一个数组，这些对象反映此 Class 对象表示的类声明的所有构造方法。 
		  */
		 cs = clz.getDeclaredConstructors();
		 System.out.println(cs.length);
		 for (Constructor<?> constructor : cs) {
			System.out.println(constructor);
		}
		 System.out.println("=======================");
	}
}
