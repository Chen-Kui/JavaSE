package com._520it._02_tcp;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

//�����
public class Server {
	public static void main(String[] args) throws Exception {
		String data = "��֪�����ڵ���ô��";
		// ��������ˣ�ָ���˿�Ϊ8888
		ServerSocket server = new ServerSocket(8888);
		System.out.println("������Ѿ�׼��������");
		// �������Ӹ÷���˵Ŀͻ��˶���,accept() ���������ܵ����׽��ֵ����ӡ�

		Socket client = server.accept();
		System.out.println("���ӹ����Ŀͻ���" + client.getInetAddress());
		PrintStream out = new PrintStream(client.getOutputStream());
		out.print(data);
		out.close();
		server.close();
	}
}
