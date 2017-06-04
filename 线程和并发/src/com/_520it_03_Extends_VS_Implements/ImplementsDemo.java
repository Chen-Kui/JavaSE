package com._520it_03_Extends_VS_Implements;
class Apple implements Runnable {
	private int num = 50;
	public void run() {
		for (int i = 0; i < 50; i++) {
			if (num > 0) {
				//static Thread currentThread() 
		        // 返回对当前正在执行的线程对象的引用。 
				System.out.println(Thread.currentThread().getName()+"吃了编号为" + num-- + "的苹果！");
				//模拟网络延迟
				/**
				 * 此处只能使用try-catch方法来处理异常，而不能使用throws方法，原因是其实现的Runnable接口中都
				 * 无try-catch方法，根据覆盖父类方法原则，所以这里不能使用throws.
				 */
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
//注意，在使用实现方式的时候，我们发现三个人一共吃了50个苹果，因为三个线程共享一个Apple对象，而一个苹果对象中只有Apple个苹果。
public class ImplementsDemo {
	// 使用Runnable方式来实现3个人同时吃50个苹果的比赛
	public static void main(String[] args) {
		Apple s = new Apple();
		new Thread(s,"明明").start();
		new Thread(s,"芳芳").start();
		new Thread(s,"叶叶").start();
	}
}
