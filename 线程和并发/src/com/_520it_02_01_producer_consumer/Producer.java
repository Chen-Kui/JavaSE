	package com._520it_02_01_producer_consumer;
	//������
	public class Producer implements Runnable {
		//�������Դ����	
		private ShareResource s = null;
		
		public Producer(ShareResource s) {
			super();
			this.s = s;
		}
	
		public void run() {
			for (int i = 0; i < 50; i++) {
				if (i % 2 == 0) {
					s.push("�����", "��");
				} else {
					s.push("������", "Ů");
				}
	
			}
		}
	
	
	}
