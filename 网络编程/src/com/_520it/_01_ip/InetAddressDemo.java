package com._520it._01_ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

//��ʾIP����
public class InetAddressDemo {
	public static void main(String[] args) throws Exception {
		//static InetAddress getByName(String host) 
        //�ڸ����������������ȷ�������� IP ��ַ�� 
		InetAddress ip = InetAddress.getByName("USER-20170319ND");
		System.out.println(ip);

		//��ȡ��������,getHostName() ��ȡ�� IP ��ַ����������
		System.out.println(ip.getHostName());
		//��ȡIP��ַ getHostAddress() ���� IP ��ַ�ַ��������ı�������ʽ���� 
		System.out.println(ip.getHostAddress());
	}
}
