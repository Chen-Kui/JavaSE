package com._520it_array;

import java.util.Arrays;

//安排篮球运动员上场
public class BasketbllPlayerDemo {
	
	public static void main(String[] args) {
		PlayerListDemo.inint(5);// 1初始化容量为5的线性表
		// 2、 安排5个球员上场[11,22,33,44,55]
		PlayerListDemo.add(11);
		PlayerListDemo.add(22);
		PlayerListDemo.add(33);
		PlayerListDemo.add(44);
		PlayerListDemo.add(55);
		// 判断和扩容
		// add(66);
		// add(77);
		// 8
		PlayerListDemo.print();
		// 3
		// int num =get(2);
		// System.out.println(num);
		// 4
		// int num = GetIndexByPlayerNum(44);
		// System.out.println(num);
		// 5
		// set(2,333);
		// print();
		// 6
		// update(22,222);
		// print();
		// 7
		// delet(22);
		// print();
	}

}
