package com._520it_03_Extends_VS_Implements;

//ÿ��ͬѧ�ñ���һ�����̶߳���
class Student extends Thread {
	private int num = 50;
	public Student(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			if (num> 0) {
				// String getName() 
		        //  ���ظ��̵߳����ơ� 
				System.out.println(super.getName() + "���˱��Ϊ" + num-- + "��ƻ����");
			}
		}
	}

}
//ע�⣬��ʹ��ʵ�ַ�ʽ��ʱ�����Ƿ��������˸��Գ���50��ƻ������Ϊ�����̸߳��Դ������Լ���Student���󣬶�һ��ƻ��������ֻ��Apple��ƻ����

public class ExtendsDemo {
	// ʹ�ü̳�Thread��ʽ��ʵ��3����ͬʱ��50��ƻ���ı���
	public static void main(String[] args) {
		new Student("����").start();
		new Student("����").start();
		new Student("ҶҶ").start();
	}
}
