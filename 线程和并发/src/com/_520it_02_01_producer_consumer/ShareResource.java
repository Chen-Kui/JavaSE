package com._520it_02_01_producer_consumer;

//共享资源对象(姓名-性别)
public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true;

	/**
	 * 生产者向共享数据中存储数据
	 * 
	 * @param name
	 *            存储的姓名
	 * @param gender
	 *            存储的性别
	 */
	synchronized public void push(String name, String gender) {
		try {
			if (!isEmpty) // 当共享资源对象为非空的时候，等着消费者来取
				// 使用同步锁对象来调用（this），表示当前线程释放同步锁，进入等待池，只能被其他对象所唤醒
				this.wait();
			// 生成开始
			this.name = name;
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
			this.gender = gender;
			// 生产结束
			isEmpty = false; // 设置共享资源对象不为空
			this.notifyAll(); // 唤醒一个消费者/唤醒多个线程
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	/**
	 * 消费者向共享数据中取出数据
	 */
	synchronized public void pupop() {
		try {
			if (isEmpty) // 当isEmpty为true的时候，等着生产者来生产
				// 生产开始
				this.wait();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(this.name + "-" + this.gender);
			// 生产结束
			isEmpty = true; // 设置共享资源对象不为空
			this.notifyAll(); // 唤醒一个生产者
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
