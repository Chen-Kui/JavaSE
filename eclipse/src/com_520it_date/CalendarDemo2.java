package com_520it_date;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo2 {
public static void main(String[] args) {
	//���󣺲�ѯ���һ���Ժ����Ϣ
	//��α�ʾ���һ���Ժ�
	Date current  = new Date();
	Calendar c =Calendar.getInstance();
	c.setTime(current);//�ѵ�ǰϵͳʱ����Ϊ������ʱ��
	c.add(Calendar.DAY_OF_MONTH,1);//��������һ��
	//��ʱ��������Ϊ0
	c.set(Calendar.HOUR_OF_DAY, 0);
	c.set(Calendar.MINUTE, 0);
	c.set(Calendar.SECOND, 0);	
	Date beginTime = c.getTime();
	c.add(Calendar.DAY_OF_MONTH, 7);
	Date endTime = c.getTime();
	System.out.println("��ʼʱ�䣺"+beginTime.toLocaleString());
	System.out.println("����ʱ�䣺"+endTime.toLocaleString());
	
}
}
