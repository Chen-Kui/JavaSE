package com._520it_02_04_Timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//��ʱ��
public class TimerDemo {
	//������3����ӡ���˿̵�ʱ�䣬������Ϊ����!
	public static void main(String[] args) {
		System.out.println("begin...");
		Timer timer =new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				System.out.println(new Date().toLocaleString());
			}
		}, 3000,1000);
	}
}
