package com_520it_date;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		// 格式化操作
		DateFormat d = DateFormat.getInstance();//短风格
		String time  = d.format(date);
		System.out.println(time);
		//使用里面的长风格方法
		d = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		System.out.println(d.format(date));
	}
}
