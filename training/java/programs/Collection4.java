package com.ust.test;
import java.util.HashSet;
public class Collection4 {
   public static void main(String[] args) {
	   HashSet<Integer>numbers=new HashSet<Integer>();
	   numbers.add(4);
	   numbers.add(5);
	   numbers.add(6);
	   for(int i=1;i<=10;i++) {
		   if(numbers.contains(i))
		   {
			System.out.println(i+"found");
			}
		   else {
			 System.out.println(i+"not found");  
		   }
		   }
   }
}
