package com._520it_02_01_producer_consumer;
//消费者
public class Consumer implements Runnable {
	//共享的资源对象	

	private ShareResource s = null;
	
	public Consumer(ShareResource s) {
		super();
		this.s = s;
	}
	
	public void run() {
		for (int i = 0; i < 50; i++) {
			s.pupop();
		}
	}


	
}
