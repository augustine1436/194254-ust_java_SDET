package com.ust.test;

public class Exception5 extends Exception {
   private static int accno[]= {1001,1002,1003,1004};
   private static String name[]= {"nish","shubh","sush","abhi","akash"};
   private static double bal[]= {10000.00,12000.00,5600.00,999.00,1100.00};
   Exception5(){ }
   Exception5(String str){super(str);}
   
   public static void main(String[] args) {
	   try {
		   System.out.println("accno"+"\t"+"customer"+"\t"+"balance");
		   for (int i=0;i<5;i++)
		   {
			   System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);
			   if (bal[i]<1000) {
				   Exception5 me= new Exception5("balence is low");
				   throw me;
			   }
	      }
	   }
	   catch(Exception5 e) {
		   e.printStackTrace();
	   }
   }
}
