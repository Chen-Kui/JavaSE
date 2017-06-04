package com._520it_02_01_producer_consumer;

//������Դ����(����-�Ա�)
public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true;

	/**
	 * ���������������д洢����
	 * 
	 * @param name
	 *            �洢������
	 * @param gender
	 *            �洢���Ա�
	 */
	synchronized public void push(String name, String gender) {
		try {
			if (!isEmpty) // ��������Դ����Ϊ�ǿյ�ʱ�򣬵�����������ȡ
				// ʹ��ͬ�������������ã�this������ʾ��ǰ�߳��ͷ�ͬ����������ȴ��أ�ֻ�ܱ���������������
				this.wait();
			// ���ɿ�ʼ
			this.name = name;
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
			this.gender = gender;
			// ��������
			isEmpty = false; // ���ù�����Դ����Ϊ��
			this.notifyAll(); // ����һ��������/���Ѷ���߳�
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	/**
	 * ����������������ȡ������
	 */
	synchronized public void pupop() {
		try {
			if (isEmpty) // ��isEmptyΪtrue��ʱ�򣬵���������������
				// ������ʼ
				this.wait();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(this.name + "-" + this.gender);
			// ��������
			isEmpty = true; // ���ù�����Դ����Ϊ��
			this.notifyAll(); // ����һ��������
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
