package com._520it_exception;
//ģ��һ��ע��ʱ�û����Ѿ���ע��Ȼ���׳�����İ���(�Զ���һ������ʱ�ڵ��쳣��LogicExceptionDemo)
public class RegistorDemo {
	// ģ�����ݿ����Ѿ����ڵ��û���
	private static String[] names = { "lucy", "tom", "will" };

	public static void main(String[] args) {
			System.out.println("ע��ɹ�");
	}
	//�жϵ�ǰ�˺��Ƿ����
	public static boolean checkName(String 	usename){
		for (String name : names) {
			if(name.equals(usename)){
				throw new LogicExceptionDemo("�ף�"+name+",�Ѿ���ע���ˣ�");
			}
		}
		return true;
	}
}
