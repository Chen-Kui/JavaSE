package com._520it_why;

//ʹ��try-catch�������쳣
public class MultiCatchDemo {
	public static void main(String[] args) {
		
		System.out.println("begin...");
		String num1 = "10";
		String num2 = "2b";
		try{
			/**
			 * ��String����ת��Ϊint���� ע������intת��ΪString���� Integer.valueof(int );
			 */
			int a = Integer.parseInt(num1);
			int b = Integer.parseInt(num2);
			int ret =a/b;	
			System.out.println(ret);
		}
		//��������ת��Ϊint���쳣
		catch(NumberFormatException e){
			e.printStackTrace();
		//����Ϊ0�쳣
		}catch(ArithmeticException e){
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("�����쳣");//��̬��˼�룬	������������쳣�����
			
		}
		System.out.println("end...");
	}
}
