package com._520it._day02_set;

import java.util.LinkedHashSet;
import java.util.Set;
//LinkedHashSet
//使用哈希表和链表结算法，保证了元素的先后顺序且元素不能重复。
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
