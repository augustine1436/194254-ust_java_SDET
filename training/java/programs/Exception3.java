package com.ust.test;

public class Exception3 {
	public static void main(String[] args) {
		try {
			String a="this is clipping";
			char c= a.charAt(24);
			System.out.println(c);
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("String out of bound");
		}
	}

}
