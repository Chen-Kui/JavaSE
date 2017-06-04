package com._520it_02_Thread;
/**
 * 
 *用线程来解决同时打游戏和播放音乐的案列
 *
 */
//播放音乐的线程类
class MusicThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("播放音乐！" + i);
		}
	}
}

// 方式1：继承THread类
public class ExtendsThreadDemo {
	public static void main(String[] args) {
		// 主线程，运行游戏
		for (int i = 0; i < 50; i++) {
			System.out.println("打游戏！" + i);
			if(i==10){
				//创建线程对象，并启动线程
				MusicThread m = new MusicThread();
				m.start();    //一定注意这里不能调用run()方法
			}
		}
	}
}
