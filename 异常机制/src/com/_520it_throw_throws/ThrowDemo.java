package com._520it_throw_throws;

public class ThrowDemo {
//throw������ڷ����ڲ������׳�������쳣����
	public static void main(String[] args) {
		try {
			int ret = test(10, 0);
			System.out.println(ret);
		} catch (Exception e) {
			// �û�ֻ�ǿ���������Ϣ���У���e.getMessage()
			System.out.println(	e.getMessage());
		
		}
		

	}

	private static int test(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("��ʼ");
		if (num2 == 0) {
			throw new ArithmeticException("���������쳣�ˣ�");
		}
		try {
			int num = num1 / num2;
			System.out.println(num);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
