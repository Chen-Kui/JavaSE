package com._520it._day03_01_object;
//需要序列化的对象
public class User implements java.io.Serializable {
	/**
	 * 版本号
	 */
	private static final long serialVersionUID = 6780138831314939729L;
	private String name;
	private  String hobby;
	private int age;
	public User(String name, String hobby, int age) {
		super();
		this.name = name;
		this.hobby = hobby;
		this.age = age;
	}
	public String toString() {
		return "User [name=" + name + ", hobby=" + hobby + ", age=" + age + "]";
	}
	
}
