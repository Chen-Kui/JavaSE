package com._520it._day01_list;

import java.util.ArrayList;
import java.util.List;

public class Iterator {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		//ConcurrentModificationException：当方法检测到对象的并发修改，但不允许这种修改时，抛出此异常。 
//		for (Object ele : list) {
//			System.out.println(ele);
//			//删除集合中为C的元素
//			if ("B".equals(ele)) {
//				list.remove(ele);
//
//			}
//		}
		
	}
}
