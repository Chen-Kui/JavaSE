package com._520it._01_class_instance;

//获取字节码对象：Class对象
public class ClassInstanceDemo {
	public static void main(String[] args) throws Exception {
		//:需求：获取java.util.Date类的字节码对象
		//方式1：使用class属性
		Class<java.util.Date> clz1 = java.util.Date.class;
		//方式2：通过对象的getClass方法来获取，getClass方法是Object中的方法
		java.util.Date date = new java.util.Date();
		Class<?> clz2 = date.getClass();
		//方式3：通过Class的静态方法
		/**
		 * static Class<?> forName(String className) 
      	   返回与带有给定字符串名的类或接口相关联的 Class 对象。 
		 */
		Class<?> clz3 = Class.forName("java.util.Date");
		System.out.println(clz1);
		System.out.println(clz2);
		System.out.println(clz3);
	}
}
