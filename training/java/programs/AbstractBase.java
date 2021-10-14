package com.ust.test;

abstract class base{
	abstract void fun();
	}
class derived extends base{
	void fun() {
		System.out.println("derived");
	}
}
public class AbstractBase {
      public static void main(String[] args) {
    	  base b= new derived();
    	  b.fun();
      }
}
