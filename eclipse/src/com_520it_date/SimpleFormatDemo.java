package com_520it_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleFormatDemo {
	public static void main(String[] args) throws ParseException {
		// �Զ���ʱ���ʽ
		String pattern = " E " + "yyyy-MM-dd HH:mm:ss" + "" + "";
		SimpleDateFormat s = new SimpleDateFormat();
		s.applyPattern(pattern);//����ʹ����һ�ָ�ʽ
		//��ʽ��
		String time = s.format(new Date());
		System.out.println(time);
		//����
		Date d = s.parse(time);
		System.out.println(d);
	}
}
