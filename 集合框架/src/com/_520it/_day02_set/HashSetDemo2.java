package com._520it._day02_set;

import java.util.HashSet;
import java.util.Set;

class A {

	public boolean equals(Object obj) {
		return true;
	}
}

class B {
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}

class C {

	public int hashCode() {
		return 2;
	}

	public boolean equals(Object obj) {
		return true;
	}

}

public class HashSetDemo2 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(new A());
		set.add(new A());
		set.add(new B());
		set.add(new B());
		set.add(new C());
		set.add(new C());
		System.out.println(set.size());
		System.out.println(set.toString());
	}

}
