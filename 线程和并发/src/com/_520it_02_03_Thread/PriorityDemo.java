package com._520it_02_03_Thread;

//�̵߳����ȼ�
public class PriorityDemo {
	public static void main(String[] args) {
		//ϵͳ���߳�Ĭ��Ϊ5
		System.out.println(Thread.currentThread().getPriority());
		//�������̵߳����ȼ�
		Thread.currentThread().setPriority(8);
		//��ȡ���̵߳����ȼ�
		System.out.println(Thread.currentThread().getPriority());
	}
}
