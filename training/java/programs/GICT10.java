package com.ust.test;

public class GICT10 {
	   static class Nested_Demo {
	      public void my_method() {
	         System.out.println("This is my nested class");
	      }
	   }
	   
	   public static void main(String args[]) {
	      GICT10.Nested_Demo nested = new GICT10.Nested_Demo();	 
	      nested.my_method();
	   }
	}
