		package com._520it_02_01_producer_consumer;
		
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
