package com._520it_02_02_producer_consumer_Lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//������Դ����(����-�Ա�)
public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true;
	private final Lock lock = new ReentrantLock();
	private final Condition condition = lock.newCondition();

	/**
	 * ���������������д洢����
	 * 
	 * @param name
	 *            �洢������
	 * @param gender
	 *            �洢���Ա�
	 */
	public void push(String name, String gender) {
		lock.lock(); // ��ȡ��

		try {
			while (!isEmpty) {
				condition.await();
			}
			//���ɿ�ʼ
			this.name = name;
			Thread.sleep(10);
			this.gender = gender;
			//���ɽ���
			isEmpty = false;
			condition.signal();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();// �ͷ���
		
		}

		// ��������

	}

	/**
	 * ����������������ȡ������
	 */
	public void pupop() {
		lock.lock();
		try {
			while(isEmpty){
				condition.await();
			}
			//������ʼ
			Thread.sleep(10);
			System.out.println(this.name + "-" + this.gender);
			//��������
			isEmpty =true;
			condition.signal();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		
		}

	}
}
