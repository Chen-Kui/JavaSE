package com_520it_date;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		// ����������Calendar������
		Calendar ca = Calendar.getInstance();
		System.out.print(+ca.get(Calendar.YEAR) + "��");
		System.out.print(+ca.get(Calendar.MONTH) + 1 + "��");
		System.out.print(+ca.get(Calendar.DAY_OF_MONTH) + "��");
		System.out.print(+ca.get(Calendar.HOUR_OF_DAY) + "ʱ");
		System.out.print(+ca.get(Calendar.MINUTE) + "��");
		System.out.println(+ca.get(Calendar.SECOND) + "��");
		/**
		 * void setTime(Date date) ʹ�ø����� Date ���ô� Calendar ��ʱ�䡣
		 */
		ca.add(Calendar.DAY_OF_MONTH, 1000); //һǧ����ʱ��
		System.out.println(ca.getTime().toLocaleString());
		ca.add(Calendar.DAY_OF_MONTH, -100);//һ����ǰ��ʱ��
		System.out.println(ca.getTime().toLocaleString());
	}
}
