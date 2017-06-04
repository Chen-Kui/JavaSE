package com._520it._02_tcp;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//客户端
public class Client {
	public static void main(String[] args) throws Exception, IOException {
		// 创建客户端对象，并指明连接客户端的主机和端口
		Socket client = new Socket("localhost",8888);
		//获取客户端的输入流对象
		Scanner sc = new Scanner(client.getInputStream());
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
	}
}
