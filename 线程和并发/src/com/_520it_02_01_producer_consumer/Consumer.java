package com._520it_02_01_producer_consumer;
//������
public class Consumer implements Runnable {
	//�������Դ����	

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
