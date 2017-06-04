package com._520it_02_03_Thread;

//线程的优先级
public class PriorityDemo {
	public static void main(String[] args) {
		//系统主线程默认为5
		System.out.println(Thread.currentThread().getPriority());
		//设置主线程的优先级
		Thread.currentThread().setPriority(8);
		//获取主线程的优先级
		System.out.println(Thread.currentThread().getPriority());
	}
}
