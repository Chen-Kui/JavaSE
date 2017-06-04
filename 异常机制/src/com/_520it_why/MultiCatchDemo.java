package com._520it_why;

//使用try-catch捕获多个异常
public class MultiCatchDemo {
	public static void main(String[] args) {
		
		System.out.println("begin...");
		String num1 = "10";
		String num2 = "2b";
		try{
			/**
			 * 把String类型转换为int类型 注意区分int转化为String类型 Integer.valueof(int );
			 */
			int a = Integer.parseInt(num1);
			int b = Integer.parseInt(num2);
			int ret =a/b;	
			System.out.println(ret);
		}
		//除数不能转换为int型异常
		catch(NumberFormatException e){
			e.printStackTrace();
		//除数为0异常
		}catch(ArithmeticException e){
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("其他异常");//多态的思想，	来解决其他的异常情况。
			
		}
		System.out.println("end...");
	}
}
