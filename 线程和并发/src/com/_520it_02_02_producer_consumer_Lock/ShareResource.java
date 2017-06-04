package com._520it_02_02_producer_consumer_Lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//共享资源对象(姓名-性别)
public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true;
	private final Lock lock = new ReentrantLock();
	private final Condition condition = lock.newCondition();

	/**
	 * 生产者向共享数据中存储数据
	 * 
	 * @param name
	 *            存储的姓名
	 * @param gender
	 *            存储的性别
	 */
	public void push(String name, String gender) {
		lock.lock(); // 获取锁

		try {
			while (!isEmpty) {
				condition.await();
			}
			//生成开始
			this.name = name;
			Thread.sleep(10);
			this.gender = gender;
			//生成结束
			isEmpty = false;
			condition.signal();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();// 释放锁
		
		}

		// 生产结束

	}

	/**
	 * 消费者向共享数据中取出数据
	 */
	public void pupop() {
		lock.lock();
		try {
			while(isEmpty){
				condition.await();
			}
			//生产开始
			Thread.sleep(10);
			System.out.println(this.name + "-" + this.gender);
			//生产结束
			isEmpty =true;
			condition.signal();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		
		}

	}
}
