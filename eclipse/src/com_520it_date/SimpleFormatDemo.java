package com_520it_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleFormatDemo {
	public static void main(String[] args) throws ParseException {
		// 自定义时间格式
		String pattern = " E " + "yyyy-MM-dd HH:mm:ss" + "" + "";
		SimpleDateFormat s = new SimpleDateFormat();
		s.applyPattern(pattern);//申请使用哪一种格式
		//格式化
		String time = s.format(new Date());
		System.out.println(time);
		//解析
		Date d = s.parse(time);
		System.out.println(d);
	}
}
