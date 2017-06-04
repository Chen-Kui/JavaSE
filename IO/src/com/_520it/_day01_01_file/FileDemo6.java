package com._520it._day01_01_file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

//文件过滤器
//listFiles(FileFilter filter) 
//返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
public class FileDemo6 {
	public static void main(String[] args) {
		final File dir = new File("F:/abc");
		File[] ds = dir.listFiles(new FilenameFilter() {

			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});
		for (File file : ds) {
			System.out.println(file);
		}

	}
}
