package com._520it_02_Thread;

//ʹ�������ڲ����������̡߳���ֻ������ĳһ����ֻʹ��һ�ε����
public class AnonymousInnerclassDemo {
	public static void main(String[] args) {
		// ���̣߳�������Ϸ
		for (int i = 0; i < 50; i++) {
			System.out.println("����Ϸ��" + i);
			if (i == 10) {
				// ʹ�ýӿ���ʽ�������ڲ����������̶߳��󣬲������߳�
				new Thread(new Runnable() {
					public void run() {
						for (int i = 0; i < 19; i++) {
							System.out.println("�������֣�" + i);
						}
					}
				}).start();
			}
		}
	}
}
