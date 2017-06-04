package com._520it_array;

import java.util.Arrays;

/**
 * 基于数组的列表（集合）
 * 
 * @author ArrayList底层原理
 * 
 */
public class MyArryListDemo {
	// 存储任意类型的元素
	private  Object[] elements = null;
	// 数组中已经存了多少个元素
	private  int size = 0;

	// 初始化容量为5的线性列表，准备用来存储场上的5个球员号码
	public MyArryListDemo(){
		this(10);
	}
	
	public  MyArryListDemo(int init) {
		// 优化判断
		if (init < 0) {
			// 抛出的异常表明向方法传递了一个不合法或不正确的参数。
			throw new IllegalArgumentException("场上的运动员号码不能为负数。");
		}
		elements = new Object[init];
	}

	//保存新的元素
	public  void add(Object playerNum) {
		// 判断和扩容
		if (size == elements.length) {
			// static int[] copyOf(int[] original, int newLength)
			// 复制指定的数组，截取或用 0 填充（如有必要），以使副本具有指定的长度。
			elements = Arrays.copyOf(elements, elements.length * 2);
		}
		elements[size] = playerNum;
		size++;
	}

	// 查询指定索引位置的元素
	public  Object get(int i) {
		for (int j = 0; j < size; j++) {
			if (elements[j] == elements[i])
				return elements[j];
		}
		return -1;
	}

	// 替换指定索引位置的元素值
	public  void set(int i, int j) {
		elements[i] = j;

	}


	// 删除指定位置索引的元素

	public  void delet(int i) {
		if (i < 0) {
			// 抛出的异常表明向方法传递了一个不合法或不正确的参数。
			throw new IllegalArgumentException("场上的运动员号码不能为负数。");
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
			// 判断是否是最后一个元素
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
