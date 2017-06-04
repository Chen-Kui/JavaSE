		package com._520it_02_01_producer_consumer;
		
		public class TestApp {
			public static void main(String[] args) {
				// 创建生产者和消费者共同的资源对象
				ShareResource s = new ShareResource();
				// 启动生产者线程
				new Thread(new Producer(s)).start();
		
				// 启动消费者线程
				new Thread(new Consumer(s)).start();
			
			}
		}
