package com_520it_string;

public class Stringbuilderdemo {
	public static void main(String[] args) {
		String str = "ABCDER";
		String newstr = new StringBuilder(str).delete(0, 3).toString();
		System.out.println(newstr);
	}
}
