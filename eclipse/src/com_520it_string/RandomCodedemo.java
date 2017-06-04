package com_520it_string;

import java.util.Random;
import java.util.UUID;

public class RandomCodedemo {
public static void main(String[] args) {	
	//生成一个五位数的随机数
	String code  =UUID.randomUUID().toString().substring(0,5);
	System.out.println(code);
	String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	str+=str.toLowerCase();
	str+="0123456789";
	System.out.println(str);	
	StringBuilder sb = new StringBuilder(5);
	for (int i = 0; i <5; i++) {
		char ch  = str.charAt(new Random().nextInt(str.length()));
		sb.append(ch);
	}
	System.out.println(sb.toString());
}	
}
