package com._520it_04_synchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Apple3 implements Runnable {
	private int num = 500;
	private final Lock lock = new ReentrantLock();// 创建一个锁对象

	public void run() {
		for (int i = 0; i < 500; i++) {
			eat();

		}
	}

	// 保证了方法的安全问题
	private void eat() {
		//进入方法，立即加锁
		lock.lock();//获取锁
		if (num > 0) 
	 try {
		// static Thread currentThread()
		// 返回对当前正在执行的线程对象的引用。
		System.out.println(Thread.currentThread().getName() + "吃了编号为"
						+ num--+ "的苹果！");
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		lock.unlock();//释放锁
	}
		
		
	}
}

// 同步锁方法
public class SynchronizedLockDemo {
	public static void main(String[] args) {
		Apple3 s = new Apple3();
		new Thread(s, "明明").start();
		new Thread(s, "芳芳").start();
		new Thread(s, "叶叶").start();
	}
}
