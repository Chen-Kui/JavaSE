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

	// ��д�ȽϹ���(��Ȼ����)
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
		// ����person�������������Ȼ����
		Set<Person> set = new TreeSet<>();
		set.add(new Person("��", 21));
		set.add(new Person("���Ŵ�ѩ", 9));
		set.add(new Person("��Ҷ", 25));
		set.add(new Person("�Դ�ɵ", 88));
		System.out.println(set);
		// ���ֳ��ȱȽ�
		Set<Person> set2 = new TreeSet<>(new NameLengthComlparator());
		set2.add(new Person("��", 21));
		set2.add(new Person("���Ŵ�ѩ", 9));
		set2.add(new Person("��Ҷ", 25));
		set2.add(new Person("�Դ�ɵ", 88));
		System.out.println(set2);
	}
}

//��д�ȽϹ���(��������)
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
