		package com._520it_02_02_producer_consumer_Lock;
		
		public class TestApp {
			public static void main(String[] args) {
				// ���������ߺ������߹�ͬ����Դ����
				ShareResource s = new ShareResource();
				// �����������߳�
				new Thread(new Producer(s)).start();
		
				// �����������߳�
				new Thread(new Consumer(s)).start();
			
			}
		}
