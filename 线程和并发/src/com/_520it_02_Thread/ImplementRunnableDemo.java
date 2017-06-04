package com._520it_02_Thread;
//播放音乐的线程类
class  MusicRunnable implements Runnable{
	//注意类是继承，接口是现实
	public void run() {
		for (int i = 0; i < 19; i++) {
			System.out.println("播放音乐！" + i);
		}
	}
}
public class ImplementRunnableDemo {
	public static void main(String[] args) {
		// 主线程，运行游戏
		for (int i = 0; i < 50; i++) {
			System.out.println("打游戏！" + i);
			if(i==10){
				//创建线程对象，并启动线程
				MusicRunnable m = new MusicRunnable();
				Thread t = new Thread(m);
				t.start();    //一定注意这里不能调用run()方法
			}
		}
	}	
}
