package com._520it_04_synchronized;

class Apple2 implements Runnable {
	private int num = 50;

	public void run() {
		for (int i = 0; i < 50; i++) {
			eat();

		}
	}
//保证了方法内必须同步完成
	synchronized private void eat() {
		if (num > 0) {
			// static Thread currentThread()
			// 返回对当前正在执行的线程对象的引用。
			System.out.println(Thread.currentThread().getName() + "吃了编号为"
					+ num-- + "的苹果！");
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

// 同步方法
public class SynchronizedMetodDemo {
	public static void main(String[] args) {
		Apple2 s = new Apple2();
		new Thread(s, "明明").start();
		new Thread(s, "芳芳").start();
		new Thread(s, "叶叶").start();
	}
}
