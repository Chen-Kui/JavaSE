package com._520it._01_class_instance;

//��ȡ�ֽ������Class����
public class ClassInstanceDemo {
	public static void main(String[] args) throws Exception {
		//:���󣺻�ȡjava.util.Date����ֽ������
		//��ʽ1��ʹ��class����
		Class<java.util.Date> clz1 = java.util.Date.class;
		//��ʽ2��ͨ�������getClass��������ȡ��getClass������Object�еķ���
		java.util.Date date = new java.util.Date();
		Class<?> clz2 = date.getClass();
		//��ʽ3��ͨ��Class�ľ�̬����
		/**
		 * static Class<?> forName(String className) 
      	   ��������и����ַ����������ӿ�������� Class ���� 
		 */
		Class<?> clz3 = Class.forName("java.util.Date");
		System.out.println(clz1);
		System.out.println(clz2);
		System.out.println(clz3);
	}
}
