package com._520it_02_03_Thread;
//�̵߳�����
public class SleepDemo {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 10; i > 0; i--) {
			System.out.println("����" + i + "�뱬ը��");
			Thread.sleep(1000);
		}
		System.out.println("��ը������");
	}
}
