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
		//ConcurrentModificationException����������⵽����Ĳ����޸ģ��������������޸�ʱ���׳����쳣�� 
//		for (Object ele : list) {
//			System.out.println(ele);
//			//ɾ��������ΪC��Ԫ��
//			if ("B".equals(ele)) {
//				list.remove(ele);
//
//			}
//		}
		
	}
}
