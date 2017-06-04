package com._520it_03_Extends_VS_Implements;

//每个同学好比是一个多线程对象
class Student extends Thread {
	private int num = 50;
	public Student(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			if (num> 0) {
				// String getName() 
		        //  返回该线程的名称。 
				System.out.println(super.getName() + "吃了编号为" + num-- + "的苹果！");
			}
		}
	}

}
//注意，在使用实现方式的时候，我们发现三个人各自吃了50个苹果，因为三个线程各自创建了自己的Student对象，而一个苹果对象中只有Apple个苹果。

public class ExtendsDemo {
	// 使用继承Thread方式来实现3个人同时吃50个苹果的比赛
	public static void main(String[] args) {
		new Student("明明").start();
		new Student("芳芳").start();
		new Student("叶叶").start();
	}
}
