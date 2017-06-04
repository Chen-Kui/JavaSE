package com._520it._day02_map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//需求：计算一个字符串每一个字符出现的次数
public class MapDemo {
	public static void main(String[] args) {
		String ch = "sfbsfsbfsdfsdbfbdsfbdsfbsfwberb";
		// 把字符串转化为char数组（字符串的本质就是char[]）
		char[] arr = ch.toCharArray();
		// key:存储字符名 、value:存储出现的次数
		Map<Character, Integer> map = new TreeMap<>();
		for (char c : arr) {
			// 判断当前字符是否在map中的key存在
			if (map.containsKey(c)) {
				// 当前的key包含该字符，此时取出key的value值递增,再存进去
				Integer old = map.get(c);
				map.put(c, old + 1);
				// 当前的key不包含该字符，把该字符存到map中，设置其value值
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}
