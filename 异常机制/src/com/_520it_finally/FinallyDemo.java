package com._520it_finally;

public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("��ʼ");
		try {
			//������ײ㴴��һ�������쳣�Ķ��� new ArithmeticException("by zero")
			//ȥ���ܹ������Լ��쳣���͵�catch
			int num = 10 / 0;
			System.out.println(num);
		} catch (ArithmeticException e) {
			System.out.println("�����쳣�ˣ�");
			e.printStackTrace();
		}finally{
			System.out.println("����ִ�У�");
		}	
	}
}
