package com._520it_stack;

import com._520it_array.MyArryListDemo;



//��������ʵ�ֵ�ջ
public class MystackDemo extends MyArryListDemo {
	// ��ջ
	public void push(Object ele) {
		super.add(ele);
	}

	// ɾ��ջ��Ԫ��
	public void pop() {
		int index = super.size()-1;
		super.delet(index);
	}

	// ��ѯջ��Ԫ��
	public Object peek() {
		int index = super.size()-1;
		return get(index);
	}

	public static void main(String[] args) {
		MystackDemo stack =  new MystackDemo();
		stack.add("D");
		stack.add("C");
		stack.add("B");
		stack.add("A");
		System.out.println(stack);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack);
		
	}
}
