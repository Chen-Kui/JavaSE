package com._520it_03_Extends_VS_Implements;
class Apple implements Runnable {
	private int num = 50;
	public void run() {
		for (int i = 0; i < 50; i++) {
			if (num > 0) {
				//static Thread currentThread() 
		        // ���ضԵ�ǰ����ִ�е��̶߳�������á� 
				System.out.println(Thread.currentThread().getName()+"���˱��Ϊ" + num-- + "��ƻ����");
				//ģ�������ӳ�
				/**
				 * �˴�ֻ��ʹ��try-catch�����������쳣��������ʹ��throws������ԭ������ʵ�ֵ�Runnable�ӿ��ж�
				 * ��try-catch���������ݸ��Ǹ��෽��ԭ���������ﲻ��ʹ��throws.
				 */
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
//ע�⣬��ʹ��ʵ�ַ�ʽ��ʱ�����Ƿ���������һ������50��ƻ������Ϊ�����̹߳���һ��Apple���󣬶�һ��ƻ��������ֻ��Apple��ƻ����
public class ImplementsDemo {
	// ʹ��Runnable��ʽ��ʵ��3����ͬʱ��50��ƻ���ı���
	public static void main(String[] args) {
		Apple s = new Apple();
		new Thread(s,"����").start();
		new Thread(s,"����").start();
		new Thread(s,"ҶҶ").start();
	}
}
