package com._520it._day01_list;

import java.util.LinkedList;
//LinkedList类实现单向队列和双向队列的接口，擅长删除和保存操作。
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
