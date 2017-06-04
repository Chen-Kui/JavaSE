package com._520it_throw_throws;

public class ThrowDemo {
//throw语句用于方法内部用于抛出具体的异常对象
	public static void main(String[] args) {
		try {
			int ret = test(10, 0);
			System.out.println(ret);
		} catch (Exception e) {
			// 用户只是看到错误信息就行，即e.getMessage()
			System.out.println(	e.getMessage());
		
		}
		

	}

	private static int test(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("开始");
		if (num2 == 0) {
			throw new ArithmeticException("出现算数异常了！");
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
