package com.ust.test;

public class GICT6 extends Thread { 
	     public void run()  
	     {    
	        int a= 10;  
	        int b=12;  
	        int result = a+b;  
	        System.out.println("Thread started running..");  
	        System.out.println("Sum of two numbers is: "+ result);  
	     }  
	     public static void main( String args[] )  
	     {  
	        GICT6 t1 = new  GICT6();
	        t1.start();  
	     }  
	}  
