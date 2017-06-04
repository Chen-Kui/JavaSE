package com._520it._day01_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//集合元素的迭代\便利操作
public class IterratorDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("D");
		list.add("C");
		list.add("B");
		list.add("A");
		//foreach方法
		for (Object ele : list) {
			System.out.println(ele);
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		//使用while循环来迭代器Iterrator
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		//使用for循环来迭代器Iterrator()
		for (Iterator it2 = list.iterator();it2.hasNext(); ) {
			System.out.println(it2.next());
		}
	}
}
