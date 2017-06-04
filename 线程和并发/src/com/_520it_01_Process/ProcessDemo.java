package com._520it_01_Process;

import java.io.IOException;

//如何在Java中开启一个进程：运行记事本程序。
public class ProcessDemo {
	public static void main(String[] args) throws IOException {
		// 方式1：使用exec方法
		Runtime run = Runtime.getRuntime();
		run.exec("notepad");
		// 方式2：使用ProcessBuilder的start方法
		ProcessBuilder pd = new ProcessBuilder("notepad");
		pd.start();
	}
}
