package com_520it_date;

public class RegexDemo {
	public static void main(String[] args) {
		// ��������ʽ�жϵ绰����
		String str = "18237502159";//11λ��������
		String str2 = "182379502159";//12λ�ĺ���
		String reg = "^1[3|4|5|7|8]\\d{9}$";
		System.out.println(str.matches(reg));
		System.out.println(str2.matches(reg));
		//��������ʽ��֤����"^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$"
		String ck = "314936048@qq.com";//11λ��������
		String ck2 = "1823adfhdasf";//12λ�ĺ���
		//ע��Java����Ҫ������б��,�Ͱٶ��ϵ�����
		String regs= "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
		System.out.println(ck.matches(regs));
		System.out.println(ck2.matches(regs));

	}
}
