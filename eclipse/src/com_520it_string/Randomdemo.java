package com_520it_string;

import java.util.Random;
import java.util.UUID;

public class Randomdemo {
	public static void main(String[] args) {
		Random r = new Random(10);
		String uuid = UUID.randomUUID().toString();
		System.out.println(r.nextBoolean());
		System.out.println(r.nextDouble());
		System.out.println(r.nextInt());
		System.out.println(uuid);
	}
}
