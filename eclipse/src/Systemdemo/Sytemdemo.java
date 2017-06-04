package Systemdemo;

import java.util.Arrays;
//关于System类的一个小的案列
public class Sytemdemo {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		int[] src = new int[10];
		System.out.println(Arrays.toString(src));
		System.arraycopy(arr, 5, src, 6, 3);
		System.out.println(Arrays.toString(src));
		int a = Math.abs(-9);
		System.out.println(a);
	}

}
