package com.ust.test;

public class Exception1 {
	public static void main(String[] args) {
		try {
			int dividebyzero=5/0;
		}
		catch(ArithmeticException e) {
			System.out.println("arithmetic exception  "+e.getMessage());
		}
		finally {
			System.out.println("final block");
		}
	}

}
