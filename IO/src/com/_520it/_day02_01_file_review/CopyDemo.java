package com._520it._day02_01_file_review;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;

//文件拷贝案列--拷贝指定目录的指定类型文件到指定目录
public class CopyDemo {
	public static void main(String[] args) throws Exception {
		//找到目录中的所有java文件
		File srcDir = new File("java");
		File destDir = new File("text");
		/**
		 	listFiles(FileFilter filter) 
          	返回抽象路径名数组，这些路径名表示
          	此抽象路径名表示的目录中满足指定过滤器的文件和目录。
		 */
		File[] fs =srcDir.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return new File(dir,name).isFile() && name.endsWith(".java");
			}
		});
		//迭代出每一个对象，并拷贝
		for (File file : fs) {
			//创建流对象
			FileInputStream in =new FileInputStream(file);
			FileOutputStream out = new FileOutputStream(new File(destDir,file.getName()));
			//读写操作
			byte[] buffer = new byte[10];
			int len = -1;
			len = in.read(buffer);
			while(len!=-1){
				out.write(buffer,0,len);
				len = in.read(buffer);
			}
		
		}
	}
}
