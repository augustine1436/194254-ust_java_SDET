package com.ust.test;

public class Wrapper1 {
 public static void main(String[] args) {
	 int a=5;
	 double b=5.56;
	 Integer aobj=Integer.valueOf(a);
	 Double bobj=Double.valueOf(b);
	 if(aobj instanceof Integer) {
		 System.out.println("Integer object created");
	 }
	 if(bobj instanceof Double) {
		 System.out.println("double object crated");
	 }
 }
}
