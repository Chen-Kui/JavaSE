package com._520it_02_Thread;
/**
 * 
 *���߳������ͬʱ����Ϸ�Ͳ������ֵİ���
 *
 */
//�������ֵ��߳���
class MusicThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("�������֣�" + i);
		}
	}
}

// ��ʽ1���̳�THread��
public class ExtendsThreadDemo {
	public static void main(String[] args) {
		// ���̣߳�������Ϸ
		for (int i = 0; i < 50; i++) {
			System.out.println("����Ϸ��" + i);
			if(i==10){
				//�����̶߳��󣬲������߳�
				MusicThread m = new MusicThread();
				m.start();    //һ��ע�����ﲻ�ܵ���run()����
			}
		}
	}
}
