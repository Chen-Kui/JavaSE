package com._520it._day02_set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


class Person implements Comparable<Person> {
	String name;
	 int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	// 编写比较规则(自然排序)
	public int compareTo(Person o) {
		if (this.age > o.age) {
			return 1;
		} else if (this.age < o.age) {
			return -1;
		} else
			return 0;
	}
}

public class TreeSetDemo2 {
	public static void main(String[] args) {
		// 按照person对象的年龄做自然排序
		Set<Person> set = new TreeSet<>();
		set.add(new Person("芳", 21));
		set.add(new Person("西门吹雪", 9));
		set.add(new Person("李叶", 25));
		set.add(new Person("赵大傻", 88));
		System.out.println(set);
		// 名字长度比较
		Set<Person> set2 = new TreeSet<>(new NameLengthComlparator());
		set2.add(new Person("芳", 21));
		set2.add(new Person("西门吹雪", 9));
		set2.add(new Person("李叶", 25));
		set2.add(new Person("赵大傻", 88));
		System.out.println(set2);
	}
}

//编写比较规则(定制排序)
class NameLengthComlparator implements Comparator<Person> {
	public int compare(Person o1, Person o2) {
		if(o1.name.length() > o2.name.length()){
			return 1;
		}else if(o1.name.length()< o2.name.length()){
			return -1;
		}
		return 0;
		
	}
}
