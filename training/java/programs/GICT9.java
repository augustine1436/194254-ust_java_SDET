package com.ust.test;

abstract class AnonymousInner {
	   public abstract void mymethod();
	}

	public class GICT9 {

	   public static void main(String args[]) {
	      AnonymousInner inner = new AnonymousInner() {
	         public void mymethod() {
	            System.out.println("This is an example of anonymous inner class");
	         }
	      };
	      inner.mymethod();	
	   }
	}

