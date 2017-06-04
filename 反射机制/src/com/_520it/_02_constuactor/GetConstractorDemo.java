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

// ��ȡ������
public class GetConstractorDemo {
	public static void main(String[] args) throws Exception {
		//getAll();
		getOne();
	}
private static void getOne() throws Exception{
			//��ȡ��������������ֽ������
			Class<User> clz = User.class;
			/**
			 * Constructor<T> getConstructor(Class<?>... parameterTypes) 
         	����һ�� Constructor ��������ӳ�� Class ��������ʾ�����ָ���������췽���� 
			 */
			//��ȡclz�����е�ָ��������
			Constructor<User> cs = clz.getConstructor();
			System.out.println(cs);
			
	}
	//��ȡ���еĹ�����
	private static void getAll() {
		//��ȡ��������������ֽ������
		Class<User> clz = User.class;
		//��ȡclz���������еĹ�����
		/**
		 *  Constructor<?>[] getConstructors() 
       	  	����һ������ĳЩ Constructor ��������飬��Щ����ӳ�� Class ��������ʾ��������й������췽���� 
		 */
		 Constructor<?>[] cs = clz.getConstructors();
		 System.out.println(cs.length);
		 for (Constructor<?> constructor : cs) {
			System.out.println(constructor);
		}
		 System.out.println("=======================");
		 /**
		  *  Constructor<?>[] getDeclaredConstructors() 
          	���� Constructor �����һ�����飬��Щ����ӳ�� Class �����ʾ�������������й��췽���� 
		  */
		 cs = clz.getDeclaredConstructors();
		 System.out.println(cs.length);
		 for (Constructor<?> constructor : cs) {
			System.out.println(constructor);
		}
		 System.out.println("=======================");
	}
}
