package com._520it._day02_set;

import java.util.LinkedHashSet;
import java.util.Set;
//LinkedHashSet
//ʹ�ù�ϣ���������㷨����֤��Ԫ�ص��Ⱥ�˳����Ԫ�ز����ظ���
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<String>set = new LinkedHashSet();
		set.add("A");
		set.add("5");
		set.add("5");
		set.add("AS");
		set.add("A4");
		System.out.println(set);
	}
}
