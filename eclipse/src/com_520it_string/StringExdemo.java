package com_520it_string;

public class StringExdemo {
	public static void main(String[] args) {
		test1();

	}

	//��ȡ��hello��ͷ���ļ����ĺ�׺��
	private static void test1() {
		// TODO Auto-generated method stub
		String fielName = "abc.java;hello.java;hello.class;hello.txt";
		//�Էֺ�Ϊ�ָ��߷ָ��ַ�������ȡÿһ���ļ����ļ�������չ����
		String[] names = fielName.split(";");
		for (String name : names) {
			//System.out.println(name);
			//�Д�ÿ���ַ����Ƿ���hello�_�^
			if(name.startsWith("hello"))
			{
				//
				System.out.println(name);
				int i =name.lastIndexOf(".");
				//System.out.println(i);
				//��ȡ�ַ���
				String newName =name.substring(i);
				System.out.println(newName);
			}
		}
	}
}
