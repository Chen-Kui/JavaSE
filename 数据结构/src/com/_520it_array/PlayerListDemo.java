package com._520it_array;

import java.util.Arrays;

public class PlayerListDemo {
	// �洢������Ա�����º���
	private static int[] player = null;
	// ������Ա�ĸ���
	private static int size = 0;

	// 1����ʼ������Ϊ5�������б�׼�������洢���ϵ�5����Ա����
	public static void inint(int init) {
		// �Ż��ж�
		if (init < 0) {
			// �׳����쳣�����򷽷�������һ�����Ϸ�����ȷ�Ĳ�����
			throw new IllegalArgumentException("���ϵ��˶�Ա���벻��Ϊ������");
		}
		player = new int[init];
	}

	// 2������5����Ա�ϳ�[11,22,33,44,55]
	public static void add(int playerNum) {
		// �жϺ�����
		if (size == player.length) {
			// static int[] copyOf(int[] original, int newLength)
			// ����ָ�������飬��ȡ���� 0 ��䣨���б�Ҫ������ʹ��������ָ���ĳ��ȡ�
			player = Arrays.copyOf(player, player.length * 2);
		}
		player[size] = playerNum;
		size++;
	}

	// 3����ѯָ��λ�õ���Ա�����º����Ƕ��٣���ѯ����λ��Ϊ2�����º����ǣ�33
	public static int get(int i) {
		for (int j = 0; j < size; j++) {
			if (player[j] == player[i])
				return player[j];
		}
		return -1;
	}

	// 4���������º����ѯ����Ա�ڳ��ϵ�����λ�ã�44���ºŵ���Ա�ڳ��ϵ�����λ��Ϊ��3
	public static int GetIndexByPlayerNum(int i) {
		for (int j = 0; j < size; j++) {
			if (player[j] == i) {
				return j;
			}
		}
		return 0;
	}

	// 5���滻��������λ��Ϊ2����Ա���滻֮���λ�õ���Ա���Ϊ��333����333��33�滻��
	public static void set(int i, int j) {
		player[i] = j;

	}

	// 6���滻���º���Ϊ22����Ա���滻֮��Ϊ222

	public static void update(int i, int j) {
		int index = GetIndexByPlayerNum(22);
		set(index, 222);

	}

	// 7���ѳ�������λ��Ϊ22����Ա���³���(ע�⣺���£�û�������)

	public static void delet(int i) {
		if (i < 0) {
			// �׳����쳣�����򷽷�������һ�����Ϸ�����ȷ�Ĳ�����
			throw new IllegalArgumentException("���ϵ��˶�Ա���벻��Ϊ������");
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

	// 8��������Ա�ڳ��ϵ�λ�ã���ӡ����Ա���룬��ӡ���[33,44,55,66,77]
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
			// �ж��Ƿ������һ��Ԫ��
			if (i != size - 1) {
				sb.append(",");
			} else {
				sb.append("]");
			}

		}
		System.out.println(sb.toString());
	}

}
