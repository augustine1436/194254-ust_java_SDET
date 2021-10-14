package com.ust.test;

public class VariableDemo {
	static int count=0;
	static void increment() {
		count++;
	}
	public static void main(String[] args) {
		VariableDemo obj1= new VariableDemo();
		VariableDemo obj2= new VariableDemo();
		obj1.increment();
		obj2.increment();
		System.out.println("obj1.count is="+obj1.count);
		System.out.println("obj2.count is="+obj2.count);
		}

}
