package com.ust.test;

public class Boolean2 {
	int a;
	boolean b;
	private Boolean2() {
		a=0;
		b=false;
	}
	public static void main(String[] args) {
		Boolean2 obj= new Boolean2();
		System.out.println("Default Value");
		System.out.println("a=" +obj.a);
		System.out.println("b=" +obj.b);
		
		
	}

}
