package com._520it._day01_01_file;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//需求：列出文件的分层结构
public class FileDmeo4 {
	public static void main(String[] args) {
		//期望效果：7e067cbf4eea31ed98e9d3160114b7>vodcache>14973a546414e8233b1020830a730a9a>...
		String file = "F:/7e067cbf4eea31ed98e9d3160114b7/vodcache/14973a546414e8233b1020830a730a9a/14973a546414e8233b1020830a730a9a.029.tdl";
		File f = new File(file);
		List<String>parentName = new ArrayList<>();
		ListAllPatent(parentName,f);
		System.out.println(parentName);
		Collections.reverse(parentName);//颠倒List的顺序
		StringBuilder sb = new StringBuilder();
		for (String name : parentName) {
			sb.append(name).append(">");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
	}

	private static void ListAllPatent(List<String> parentName, File f) {
		if(!"".equals(f.getParentFile().getName())){
			parentName.add(f.getParentFile().getName());
		}
		if(f.getParentFile().getParentFile()!=null){
			ListAllPatent( parentName,  f.getParentFile());
		}
		
	}
}
