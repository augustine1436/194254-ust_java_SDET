package com.ust.test;

public class Methodoverloading2 {
	double sum(int x,double y) {
		return x+y;
	}
	double sum(double x,int y) {
		return x+y;
	}
	public static void main(String[] args) {
		  Methodoverloading2 obj= new Methodoverloading2();
		   System.out.println(obj.sum(30,30.2));
		   System.out.println(obj.sum(50.2,20));

	}

}
