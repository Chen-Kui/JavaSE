package com_520it_date;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo2 {
public static void main(String[] args) {
	//需求：查询最近一周以后的信息
	//如何表示最近一周以后？
	Date current  = new Date();
	Calendar c =Calendar.getInstance();
	c.setTime(current);//把当前系统时间作为日历的时间
	c.add(Calendar.DAY_OF_MONTH,1);//把日增加一天
	//把时分秒设置为0
	c.set(Calendar.HOUR_OF_DAY, 0);
	c.set(Calendar.MINUTE, 0);
	c.set(Calendar.SECOND, 0);	
	Date beginTime = c.getTime();
	c.add(Calendar.DAY_OF_MONTH, 7);
	Date endTime = c.getTime();
	System.out.println("开始时间："+beginTime.toLocaleString());
	System.out.println("结束时间："+endTime.toLocaleString());
	
}
}
