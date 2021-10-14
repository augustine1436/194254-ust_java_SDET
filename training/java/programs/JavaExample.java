package com.ust.test;

public class JavaExample {
	static int age;
	static String name;
	static void display() {
		System.out.println("age is"+age);
		System.out.println("name is "+name);
			}
	public static void main(String[] args) {
		age=30;
		name="steve";
		display();
	}

}
