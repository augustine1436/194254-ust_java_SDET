package com.ust.test;

public class ExceptionMultiCatch {
	public static void main(String[] args) {
		try {
		int a[]=new int[5];
		a[5]= 30/0;
		}
		catch (ArithmeticException e) {
			System.out.println("arithmetic Exception");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("out of bound");
		}
		catch(Exception e) {
			System.out.println("for others");
		}
	}
}
