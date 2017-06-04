package com_520it_date;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		// 创建日历（Calendar）对象
		Calendar ca = Calendar.getInstance();
		System.out.print(+ca.get(Calendar.YEAR) + "年");
		System.out.print(+ca.get(Calendar.MONTH) + 1 + "月");
		System.out.print(+ca.get(Calendar.DAY_OF_MONTH) + "日");
		System.out.print(+ca.get(Calendar.HOUR_OF_DAY) + "时");
		System.out.print(+ca.get(Calendar.MINUTE) + "分");
		System.out.println(+ca.get(Calendar.SECOND) + "秒");
		/**
		 * void setTime(Date date) 使用给定的 Date 设置此 Calendar 的时间。
		 */
		ca.add(Calendar.DAY_OF_MONTH, 1000); //一千天后的时间
		System.out.println(ca.getTime().toLocaleString());
		ca.add(Calendar.DAY_OF_MONTH, -100);//一百天前的时间
		System.out.println(ca.getTime().toLocaleString());
	}
}
