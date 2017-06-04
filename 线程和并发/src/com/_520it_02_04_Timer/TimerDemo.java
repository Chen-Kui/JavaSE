package com._520it_02_04_Timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//定时器
public class TimerDemo {
	//需求：在3秒后打印：此刻的时间，可以作为闹钟!
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
