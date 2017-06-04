package com._520it_04_synchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Apple3 implements Runnable {
	private int num = 500;
	private final Lock lock = new ReentrantLock();// ����һ��������

	public void run() {
		for (int i = 0; i < 500; i++) {
			eat();

		}
	}

	// ��֤�˷����İ�ȫ����
	private void eat() {
		//���뷽������������
		lock.lock();//��ȡ��
		if (num > 0) 
	 try {
		// static Thread currentThread()
		// ���ضԵ�ǰ����ִ�е��̶߳�������á�
		System.out.println(Thread.currentThread().getName() + "���˱��Ϊ"
						+ num--+ "��ƻ����");
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		lock.unlock();//�ͷ���
	}
		
		
	}
}

// ͬ��������
public class SynchronizedLockDemo {
	public static void main(String[] args) {
		Apple3 s = new Apple3();
		new Thread(s, "����").start();
		new Thread(s, "����").start();
		new Thread(s, "ҶҶ").start();
	}
}
