package com._520it_array;

import java.util.Arrays;

/**
 * ����������б����ϣ�
 * 
 * @author ArrayList�ײ�ԭ��
 * 
 */
public class MyArryListDemo {
	// �洢�������͵�Ԫ��
	private  Object[] elements = null;
	// �������Ѿ����˶��ٸ�Ԫ��
	private  int size = 0;

	// ��ʼ������Ϊ5�������б�׼�������洢���ϵ�5����Ա����
	public MyArryListDemo(){
		this(10);
	}
	
	public  MyArryListDemo(int init) {
		// �Ż��ж�
		if (init < 0) {
			// �׳����쳣�����򷽷�������һ�����Ϸ�����ȷ�Ĳ�����
			throw new IllegalArgumentException("���ϵ��˶�Ա���벻��Ϊ������");
		}
		elements = new Object[init];
	}

	//�����µ�Ԫ��
	public  void add(Object playerNum) {
		// �жϺ�����
		if (size == elements.length) {
			// static int[] copyOf(int[] original, int newLength)
			// ����ָ�������飬��ȡ���� 0 ��䣨���б�Ҫ������ʹ��������ָ���ĳ��ȡ�
			elements = Arrays.copyOf(elements, elements.length * 2);
		}
		elements[size] = playerNum;
		size++;
	}

	// ��ѯָ������λ�õ�Ԫ��
	public  Object get(int i) {
		for (int j = 0; j < size; j++) {
			if (elements[j] == elements[i])
				return elements[j];
		}
		return -1;
	}

	// �滻ָ������λ�õ�Ԫ��ֵ
	public  void set(int i, int j) {
		elements[i] = j;

	}


	// ɾ��ָ��λ��������Ԫ��

	public  void delet(int i) {
		if (i < 0) {
			// �׳����쳣�����򷽷�������һ�����Ϸ�����ȷ�Ĳ�����
			throw new IllegalArgumentException("���ϵ��˶�Ա���벻��Ϊ������");
		}
		for (int j = i; j < size - 1; j++) {
			if (j < size - 1) {
				elements[j] = elements[j + 1];
			}

		}

		elements[size - 1] = -1;
		size--;
	}

	public  String toString() {
		if (elements == null) {
			System.out.println("null");
			return null;
		}
		if (size == 0) {
				
			return "[]";
		}
		StringBuilder sb = new StringBuilder(size * 3 + 1);
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(elements[i]);
			// �ж��Ƿ������һ��Ԫ��
			if (i != size - 1) {
				sb.append(",");
			} else {
				sb.append("]");
			}

		}
		return sb.toString();
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
}
