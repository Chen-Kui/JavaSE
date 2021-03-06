package com_520it_date;

public class RegexDemo {
	public static void main(String[] args) {
		// 用正则表达式判断电话号码
		String str = "18237502159";//11位正常号码
		String str2 = "182379502159";//12位的号码
		String reg = "^1[3|4|5|7|8]\\d{9}$";
		System.out.println(str.matches(reg));
		System.out.println(str2.matches(reg));
		//用正则表达式验证邮箱"^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$"
		String ck = "314936048@qq.com";//11位正常号码
		String ck2 = "1823adfhdasf";//12位的号码
		//注意Java中需要两条反斜线,和百度上的区分
		String regs= "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
		System.out.println(ck.matches(regs));
		System.out.println(ck2.matches(regs));

	}
}
