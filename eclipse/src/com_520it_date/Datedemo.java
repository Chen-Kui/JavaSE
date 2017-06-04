package com_520it_date;

import java.util.Date;

public class Datedemo {
public static void main(String[] args) {
	Date date = new Date();
	System.out.println(date);
	System.out.println("中国人的风格："+date.toLocaleString());
}
}
