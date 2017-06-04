package com._520it._day03_05_PipedInputStream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

//A�̷߳������ݵ�B�߳�
class AThread extends Thread {
	private PipedOutputStream out = new PipedOutputStream();

	public PipedOutputStream getOut() {
		return out;
	}

	public void run() {

		try {
			for (int i = 65; i < 65 + 26; i++) {
				out.write(i);
			}
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

// B�߳̽�������
class BThread extends Thread {
	/**
	 * PipedInputStream(PipedOutputStream src) ���� PipedInputStream��ʹ�����ӵ��ܵ������
	 * src��
	 */
	 PipedInputStream in = null;

	public BThread(AThread athread) throws Exception {
		in = new PipedInputStream(athread.getOut());
	}

	public void run() {
		int len = -1;
		try {
			while ((len = in.read()) != -1) {
				System.out.println((char) len);
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class PipedInputStreamDemo {
	// �ܵ���PipedInputStream
	public static void main(String[] args) throws Exception {
		AThread athread = new AThread();
		BThread bthread = new BThread(athread);
		athread.start();
		bthread.start();
	}
}