package com._520it._03_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

//���Ͷ�
public class Sender {
	public static void main(String[] args) throws Exception {
		String data = "�ȵ�һ�ƣ�";
		//�������Ͷ˶���
		DatagramSocket sender = new DatagramSocket(10010);
		//��������     DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
       // �������ݱ���������������Ϊ length �İ����͵�ָ�������ϵ�ָ���˿ںš�
		DatagramPacket dp = new DatagramPacket(data.getBytes(),//�������ݰ�
				data.getBytes().length,//�������ݵĳ���
				InetAddress.getLocalHost(),//���͸���һ��IP
				10086);//���͸���һ���˿ڳ���
		sender.send(dp);
		sender.close();

	}
}
