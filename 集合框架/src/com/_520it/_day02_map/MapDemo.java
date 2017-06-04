package com._520it._day02_map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//���󣺼���һ���ַ���ÿһ���ַ����ֵĴ���
public class MapDemo {
	public static void main(String[] args) {
		String ch = "sfbsfsbfsdfsdbfbdsfbdsfbsfwberb";
		// ���ַ���ת��Ϊchar���飨�ַ����ı��ʾ���char[]��
		char[] arr = ch.toCharArray();
		// key:�洢�ַ��� ��value:�洢���ֵĴ���
		Map<Character, Integer> map = new TreeMap<>();
		for (char c : arr) {
			// �жϵ�ǰ�ַ��Ƿ���map�е�key����
			if (map.containsKey(c)) {
				// ��ǰ��key�������ַ�����ʱȡ��key��valueֵ����,�ٴ��ȥ
				Integer old = map.get(c);
				map.put(c, old + 1);
				// ��ǰ��key���������ַ����Ѹ��ַ��浽map�У�������valueֵ
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}
