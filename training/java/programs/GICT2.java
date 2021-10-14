package com.ust.test;

public class GICT2 {
	  public static void main(String[] args) {
		    DemoClass demo = new DemoClass();
		    demo.<String>genericsMethod("Java Programming");
		    demo.<Integer>genericsMethod(25);
		  }
		}
class DemoClass {
		  public <T> void genericsMethod(T data) {
		    System.out.println("Generics Method:");
		    System.out.println("Data Passed: " + data);
		  }
		}
class Test321<T, U>
		{
		    T obj1; 
		    U obj2; 
		    Test321(T obj1, U obj2)
		    {
		        this.obj1 = obj1;
		        this.obj2 = obj2;
		    }
	    public void print()
		    {
		        System.out.println(obj1);
		        System.out.println(obj2);
		    }
		}
