package com._520it_01_Process;

import java.io.IOException;

//�����Java�п���һ�����̣����м��±�����
public class ProcessDemo {
	public static void main(String[] args) throws IOException {
		// ��ʽ1��ʹ��exec����
		Runtime run = Runtime.getRuntime();
		run.exec("notepad");
		// ��ʽ2��ʹ��ProcessBuilder��start����
		ProcessBuilder pd = new ProcessBuilder("notepad");
		pd.start();
	}
}
