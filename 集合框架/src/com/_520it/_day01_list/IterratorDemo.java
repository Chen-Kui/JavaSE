package com._520it._day01_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//����Ԫ�صĵ���\��������
public class IterratorDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("D");
		list.add("C");
		list.add("B");
		list.add("A");
		//foreach����
		for (Object ele : list) {
			System.out.println(ele);
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		//ʹ��whileѭ����������Iterrator
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		//ʹ��forѭ����������Iterrator()
		for (Iterator it2 = list.iterator();it2.hasNext(); ) {
			System.out.println(it2.next());
		}
	}
}
