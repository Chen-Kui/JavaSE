package com._520it_02_Thread;

//使用匿名内部类来创建线程。。只适用于某一个类只使用一次的情况
public class AnonymousInnerclassDemo {
	public static void main(String[] args) {
		// 主线程，运行游戏
		for (int i = 0; i < 50; i++) {
			System.out.println("打游戏！" + i);
			if (i == 10) {
				// 使用接口形式的匿名内部类来创建线程对象，并启动线程
				new Thread(new Runnable() {
					public void run() {
						for (int i = 0; i < 19; i++) {
							System.out.println("播放音乐！" + i);
						}
					}
				}).start();
			}
		}
	}
}
