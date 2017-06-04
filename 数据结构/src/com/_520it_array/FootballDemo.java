package com._520it_array;

import java.util.Arrays;

//安排篮球运动员上场
public class FootballDemo {
	// 存储场上球员的球衣号码


	public static void main(String[] args) {
		PlayerListDemo.inint(5);// 1初始化容量为5的线性表
		// 2、 安排5个球员上场[11,22,33,44,55]
		PlayerListDemo.add(1);
		PlayerListDemo.add(2);
		PlayerListDemo.add(3);
		PlayerListDemo.add(4);
		PlayerListDemo.add(5);
		PlayerListDemo.add(6);
		PlayerListDemo.add(7);
		PlayerListDemo.add(8);
		PlayerListDemo.add(9);
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
