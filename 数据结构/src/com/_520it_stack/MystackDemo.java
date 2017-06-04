package com._520it_stack;

import com._520it_array.MyArryListDemo;



//基于数组实现的栈
public class MystackDemo extends MyArryListDemo {
	// 入栈
	public void push(Object ele) {
		super.add(ele);
	}

	// 删除栈顶元素
	public void pop() {
		int index = super.size()-1;
		super.delet(index);
	}

	// 查询栈顶元素
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
