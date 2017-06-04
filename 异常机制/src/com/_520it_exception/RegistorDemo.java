package com._520it_exception;
//模拟一个注册时用户名已经被注册然后抛出错误的案列(自定义一个运行时期的异常类LogicExceptionDemo)
public class RegistorDemo {
	// 模拟数据库中已经存在的用户名
	private static String[] names = { "lucy", "tom", "will" };

	public static void main(String[] args) {
			System.out.println("注册成功");
	}
	//判断当前账号是否存在
	public static boolean checkName(String 	usename){
		for (String name : names) {
			if(name.equals(usename)){
				throw new LogicExceptionDemo("亲，"+name+",已经被注册了！");
			}
		}
		return true;
	}
}
