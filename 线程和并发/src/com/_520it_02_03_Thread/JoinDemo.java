package com._520it_02_03_Thread;

//�����߳�
class Join extends Thread {
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("jion  " + i);
		}
	}
}

// �����߳�
public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("begin...");
		Join join = new Join(); // ����join�̶߳���
		for (int i = 0; i < 50; i++) {
			System.out.println("main  " + i);
			if (i == 10) {
				join.start();
			}
			if (i == 20) // ǿ�����и��̣߳��������̣߳�
				join.join();
		}
	}
}
