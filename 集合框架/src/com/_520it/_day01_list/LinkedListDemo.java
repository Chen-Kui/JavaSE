package com._520it._day01_list;

import java.util.LinkedList;
//LinkedList��ʵ�ֵ�����к�˫����еĽӿڣ��ó�ɾ���ͱ��������
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast("B");
		list.addLast("C");
		list.addLast("D");
		list.addFirst("A");
		System.out.println(list);
	}

}
