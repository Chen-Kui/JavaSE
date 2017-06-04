package com._520it._day01_list;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector(10);
		v.add("A");
		v.add(new java.util.Date());
		v.add(123);
		System.out.println(v);
	}
}
