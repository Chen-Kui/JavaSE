package com._520it_02_Thread;
//�������ֵ��߳���
class  MusicRunnable implements Runnable{
	//ע�����Ǽ̳У��ӿ�����ʵ
	public void run() {
		for (int i = 0; i < 19; i++) {
			System.out.println("�������֣�" + i);
		}
	}
}
public class ImplementRunnableDemo {
	public static void main(String[] args) {
		// ���̣߳�������Ϸ
		for (int i = 0; i < 50; i++) {
			System.out.println("����Ϸ��" + i);
			if(i==10){
				//�����̶߳��󣬲������߳�
				MusicRunnable m = new MusicRunnable();
				Thread t = new Thread(m);
				t.start();    //һ��ע�����ﲻ�ܵ���run()����
			}
		}
	}	
}
