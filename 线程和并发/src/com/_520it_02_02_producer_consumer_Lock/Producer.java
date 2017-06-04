	package com._520it_02_02_producer_consumer_Lock;
	//生产者
	public class Producer implements Runnable {
		//共享的资源对象	
		private ShareResource s = null;
		
		public Producer(ShareResource s) {
			super();
			this.s = s;
		}
	
		public void run() {
			for (int i = 0; i < 50; i++) {
				if (i % 2 == 0) {
					s.push("奎哥哥", "男");
				} else {
					s.push("芳妹妹", "女");
				}
	
			}
		}
	
	
	}
