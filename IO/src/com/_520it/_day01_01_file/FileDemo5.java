package com._520it._day01_01_file;

import java.io.File;

/**
 * Ŀ�ģ� �����޸��ļ����ư��� �¿�-ϣ��ѧԺ-2017-Java�༶-01.java 
 * 		�¿�-ϣ��ѧԺ-2017-Java�༶-02.java
 *		�¿�-ϣ��ѧԺ-2017-Java�༶-03.java 
 * 		�¿�-ϣ��ѧԺ-2017-Java�༶-04.java
 * 	��ȡ���е�  >  �¿�-ϣ��ѧԺ-2017-Java�༶-
 */
public class FileDemo5 {
	public static void main(String[] args) {
		File dir = new File("F:/abc");
		//��ȡ��ǰĿ¼�µ������ļ�
		File[] fs = dir.listFiles();
		//��Ҫ���滻ɾ��������
		String deletText = "�¿�-ϣ��ѧԺ-2017-Java�༶-";
		for (File file : fs) {
			
			if(file.getName().contains(deletText)){
				String newFileName =file.getName().replace(deletText, "");
				//��������
				file.renameTo(new File(dir,newFileName));
			}
		}
	}
}
