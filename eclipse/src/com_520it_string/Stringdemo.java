package com_520it_string;

public class Stringdemo {
	public static void main(String[] args) {
		//getStringIf();
		getSringif();
	}

	private static void getSringif() {
		// TODO Auto-generated method stub
		String sr1 = new String("ABCDE");
		String sr2 = new String("AbCDE");
		System.out.println(sr1.equalsIgnoreCase(sr2));
	}

	private static void getStringIf() {
		// TODO Auto-generated method stub
		System.out.println("I love You!".charAt(5));
	}
}
