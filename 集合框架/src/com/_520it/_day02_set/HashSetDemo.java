package com._520it._day02_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//ÑÝÊ¾HashSet
public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("8");
		set.add("B");
		set.add("0");
		set.add("q");
		set.add("W");
		System.out.println(set);
		for (String ele : set) {
			System.out.println(ele);
			
		}
		Iterator<String> it =set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}
}
