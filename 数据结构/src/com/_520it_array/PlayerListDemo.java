package com._520it_array;

import java.util.Arrays;

public class PlayerListDemo {
	// 存储场上球员的球衣号码
	private static int[] player = null;
	// 场上球员的个数
	private static int size = 0;

	// 1、初始化容量为5的线性列表，准备用来存储场上的5个球员号码
	public static void inint(int init) {
		// 优化判断
		if (init < 0) {
			// 抛出的异常表明向方法传递了一个不合法或不正确的参数。
			throw new IllegalArgumentException("场上的运动员号码不能为负数。");
		}
		player = new int[init];
	}

	// 2、安排5个球员上场[11,22,33,44,55]
	public static void add(int playerNum) {
		// 判断和扩容
		if (size == player.length) {
			// static int[] copyOf(int[] original, int newLength)
			// 复制指定的数组，截取或用 0 填充（如有必要），以使副本具有指定的长度。
			player = Arrays.copyOf(player, player.length * 2);
		}
		player[size] = playerNum;
		size++;
	}

	// 3、查询指定位置的球员的球衣号码是多少？查询索引位置为2的球衣号码是：33
	public static int get(int i) {
		for (int j = 0; j < size; j++) {
			if (player[j] == player[i])
				return player[j];
		}
		return -1;
	}

	// 4、根据球衣号码查询该球员在场上的索引位置，44球衣号的球员在场上的索引位置为：3
	public static int GetIndexByPlayerNum(int i) {
		for (int j = 0; j < size; j++) {
			if (player[j] == i) {
				return j;
			}
		}
		return 0;
	}

	// 5、替换场上索引位置为2的球员，替换之后该位置的球员编号为：333，即333把33替换了
	public static void set(int i, int j) {
		player[i] = j;

	}

	// 6、替换球衣号码为22的球员，替换之后为222

	public static void update(int i, int j) {
		int index = GetIndexByPlayerNum(22);
		set(index, 222);

	}

	// 7、把场上索引位置为22的球员罚下场，(注意：罚下，没有替代的)

	public static void delet(int i) {
		if (i < 0) {
			// 抛出的异常表明向方法传递了一个不合法或不正确的参数。
			throw new IllegalArgumentException("场上的运动员号码不能为负数。");
		}
		int index = GetIndexByPlayerNum(22);
		for (int j = index; j < size - 1; j++) {
			if (j < size - 1) {
				player[j] = player[j + 1];
			}

		}

		player[size - 1] = -1;
		size--;
	}

	// 8、按照球员在场上的位置，打印出球员号码，打印风格[33,44,55,66,77]
	public static void print() {
		if (player == null) {
			System.out.println("null");
			return;
		}
		if (size == 0) {
			System.out.println("[]");
			return;
		}
		StringBuilder sb = new StringBuilder(size * 3 + 1);
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(player[i]);
			// 判断是否是最后一个元素
			if (i != size - 1) {
				sb.append(",");
			} else {
				sb.append("]");
			}

		}
		System.out.println(sb.toString());
	}

}
