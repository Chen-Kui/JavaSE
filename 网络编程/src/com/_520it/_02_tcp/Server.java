package com._520it._02_tcp;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class Server {
	public static void main(String[] args) throws Exception {
		String data = "你知道我在等你么？";
		// 创建服务端，指定端口为8888
		ServerSocket server = new ServerSocket(8888);
		System.out.println("服务端已经准备就绪！");
		// 接受连接该服务端的客户端对象,accept() 侦听并接受到此套接字的连接。

		Socket client = server.accept();
		System.out.println("连接过来的客户端" + client.getInetAddress());
		PrintStream out = new PrintStream(client.getOutputStream());
		out.print(data);
		out.close();
		server.close();
	}
}
