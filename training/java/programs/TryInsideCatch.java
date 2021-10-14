package com.ust.test;

public class TryInsideCatch {
	public static void main(String[] args) {
		int b=9,h=0;
		char[] a=new char[9];
		try {
			int y=b/h;
			System.out.println(a[50]);
		}
		catch (ArithmeticException s) {
			try {
				System.out.println(s);
				System.out.println(a[12]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("===>"+e);
			}
		}
		catch(ArrayIndexOutOfBoundsException f) {
			System.out.println(f);
		}
		catch (Exception g) {
			System.out.println(g);
		}
	}

}
