package com._520it_array;

public class MyArrayListexitDemo {
	public static void main(String[] args) {
		MyArryListDemo list = new MyArryListDemo(5);
		list.add("A");
		list.add("b");	
		list.add(1);	
		list.add(false);	
		list.add(null);	
		list.add("A");	
		list.add("A");	
		System.out.println(list);
		list.delet(0);
		System.out.println(list);
	}
}
