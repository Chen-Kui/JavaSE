package com_520it_date;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		// ��ʽ������
		DateFormat d = DateFormat.getInstance();//�̷��
		String time  = d.format(date);
		System.out.println(time);
		//ʹ������ĳ���񷽷�
		d = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		System.out.println(d.format(date));
	}
}
