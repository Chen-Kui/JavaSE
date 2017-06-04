package com._520it._02_constuactor;

import java.lang.reflect.Constructor;

class Person {
	public Person() {
		System.out.println("�޲���������");
	}

	public Person(String name) {
		System.out.println("������"+name);
	}

	private Person(String name, int age) {
		System.out.println("������"+name+","+age);
	}
}
//ʹ�÷�����ù�����-->��������
public class CreatObjectDemo {
	public static void main(String[] args) throws Exception {
		//��ȡ��������������ֽ������
		Class<Person> clz = Person.class;
		//��ȡclz�����е�ָ��������
		Constructor<Person> con = clz.getConstructor();
		/**
		 * newInstance(Object... initargs) 
          	ʹ�ô� Constructor �����ʾ�Ĺ��췽���������ù��췽�������������ʵ��������ָ���ĳ�ʼ��������ʼ����ʵ����
		 */
		//���ù�������newInstance()��������������
		con.newInstance();
		System.out.println("============================");
		Constructor<Person> con1 = clz.getConstructor(String.class);
		//���ù�������newInstance()�������������󣬲�����ʵ��
		con1.newInstance("�����");	
		System.out.println("============================");
		Constructor<Person> con2 = clz.getDeclaredConstructor(String.class,int.class);
		//���õ�ǰ���������Է���
		con2.setAccessible(true);
		con2.newInstance("�����",21);
	}
}
