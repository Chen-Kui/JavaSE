package com._520it._02_tcp;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//�ͻ���
public class Client {
	public static void main(String[] args) throws Exception, IOException {
		// �����ͻ��˶��󣬲�ָ�����ӿͻ��˵������Ͷ˿�
		Socket client = new Socket("localhost",8888);
		//��ȡ�ͻ��˵�����������
		Scanner sc = new Scanner(client.getInputStream());
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
	}
}
