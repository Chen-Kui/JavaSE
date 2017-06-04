package com._520it_02_03_Thread;
//线程的休眠
public class SleepDemo {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 10; i > 0; i--) {
			System.out.println("还有" + i + "秒爆炸！");
			Thread.sleep(1000);
		}
		System.out.println("爆炸！！！");
	}
}
