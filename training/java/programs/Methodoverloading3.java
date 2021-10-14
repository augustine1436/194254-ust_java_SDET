package com.ust.test;

public class Methodoverloading3 {
	long sum(int x,int y) {
		return x+y;
	}
   int sum(int x,int y, int z) {
	   return(x+y+z);
   }
   public static void main(String[] args) {
	   Methodoverloading3 obj= new Methodoverloading3();
	   System.out.println(obj.sum(30, 10));
	   System.out.println(obj.sum(50, 20, 30));
   }
}
