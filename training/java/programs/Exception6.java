package com.ust.test;

public class Exception6 {
	static void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException("access denied");
		}
		else {
			System.out.println("access granted");
		}
	}
	public static void main(String[] args){
		checkAge(15);
	}

}
