package com._520it_finally;

public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("开始");
		try {
			//会在其底层创建一个算数异常的对象 new ArithmeticException("by zero")
			//去找能够接受自己异常类型的catch
			int num = 10 / 0;
			System.out.println(num);
		} catch (ArithmeticException e) {
			System.out.println("出现异常了！");
			e.printStackTrace();
		}finally{
			System.out.println("必须执行！");
		}	
	}
}
