package com._520it_04_synchronized;

class Apple2 implements Runnable {
	private int num = 50;

	public void run() {
		for (int i = 0; i < 50; i++) {
			eat();

		}
	}
//��֤�˷����ڱ���ͬ�����
	synchronized private void eat() {
		if (num > 0) {
			// static Thread currentThread()
			// ���ضԵ�ǰ����ִ�е��̶߳�������á�
			System.out.println(Thread.currentThread().getName() + "���˱��Ϊ"
					+ num-- + "��ƻ����");
			// ģ�������ӳ�
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

// ͬ������
public class SynchronizedMetodDemo {
	public static void main(String[] args) {
		Apple2 s = new Apple2();
		new Thread(s, "����").start();
		new Thread(s, "����").start();
		new Thread(s, "ҶҶ").start();
	}
}
