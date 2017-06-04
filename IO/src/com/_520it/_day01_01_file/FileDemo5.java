package com._520it._day01_01_file;

import java.io.File;

/**
 * 目的： 批量修改文件名称案列 陈奎-希望学院-2017-Java班级-01.java 
 * 		陈奎-希望学院-2017-Java班级-02.java
 *		陈奎-希望学院-2017-Java班级-03.java 
 * 		陈奎-希望学院-2017-Java班级-04.java
 * 	截取所有的  >  陈奎-希望学院-2017-Java班级-
 */
public class FileDemo5 {
	public static void main(String[] args) {
		File dir = new File("F:/abc");
		//获取当前目录下的所有文件
		File[] fs = dir.listFiles();
		//需要被替换删除的文字
		String deletText = "陈奎-希望学院-2017-Java班级-";
		for (File file : fs) {
			
			if(file.getName().contains(deletText)){
				String newFileName =file.getName().replace(deletText, "");
				//从新命名
				file.renameTo(new File(dir,newFileName));
			}
		}
	}
}
