package com._520it_04_synchronized;

//用同步代码块方法解决多线程并发访问一个资源的安全性问题

class Apple1 implements Runnable {
	private int num = 50;

	public void run() {
		for (int i = 0; i < 50; i++) {
			// 同步代码块
			synchronized (this) { // 这里的this就表示apple1对象，该对象属于多线程共享的 资源
				if (num > 0) {
					// static Thread currentThread()
					// 返回对当前正在执行的线程对象的引用。
					System.out.println(Thread.currentThread().getName()
							+ "吃了编号为" + num-- + "的苹果！");
					// 模拟网络延迟
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

}

public class SynchronizedBlockDemo {
	public static void main(String[] args) {
		Apple1 s = new Apple1();
		new Thread(s, "明明").start();
		new Thread(s, "芳芳").start();
		new Thread(s, "叶叶").start();
	}
}
