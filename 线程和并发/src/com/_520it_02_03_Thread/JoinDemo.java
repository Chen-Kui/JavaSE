package com._520it_02_03_Thread;

//联合线程
class Join extends Thread {
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("jion  " + i);
		}
	}
}

// 联合线程
public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("begin...");
		Join join = new Join(); // 创建join线程对象
		for (int i = 0; i < 50; i++) {
			System.out.println("main  " + i);
			if (i == 10) {
				join.start();
			}
			if (i == 20) // 强制运行该线程（即联合线程）
				join.join();
		}
	}
}
