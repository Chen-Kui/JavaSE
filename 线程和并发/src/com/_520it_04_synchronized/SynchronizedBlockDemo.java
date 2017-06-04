package com._520it_04_synchronized;

//��ͬ������鷽��������̲߳�������һ����Դ�İ�ȫ������

class Apple1 implements Runnable {
	private int num = 50;

	public void run() {
		for (int i = 0; i < 50; i++) {
			// ͬ�������
			synchronized (this) { // �����this�ͱ�ʾapple1���󣬸ö������ڶ��̹߳���� ��Դ
				if (num > 0) {
					// static Thread currentThread()
					// ���ضԵ�ǰ����ִ�е��̶߳�������á�
					System.out.println(Thread.currentThread().getName()
							+ "���˱��Ϊ" + num-- + "��ƻ����");
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
	}

}

public class SynchronizedBlockDemo {
	public static void main(String[] args) {
		Apple1 s = new Apple1();
		new Thread(s, "����").start();
		new Thread(s, "����").start();
		new Thread(s, "ҶҶ").start();
	}
}
