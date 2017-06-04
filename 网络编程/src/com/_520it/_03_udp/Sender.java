package com._520it._03_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

//发送端
public class Sender {
	public static void main(String[] args) throws Exception {
		String data = "热的一逼！";
		//创建发送端对象
		DatagramSocket sender = new DatagramSocket(10010);
		//发送数据     DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
       // 构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。
		DatagramPacket dp = new DatagramPacket(data.getBytes(),//发送数据包
				data.getBytes().length,//发送数据的长度
				InetAddress.getLocalHost(),//发送给哪一个IP
				10086);//发送给哪一个端口程序
		sender.send(dp);
		sender.close();

	}
}
