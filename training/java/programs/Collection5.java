package com.ust.test;
import java.util.*;
public class Collection5 {
 public static void main(String[] args) {
	 ArrayList<Integer>numbers=new ArrayList<Integer>();
	 numbers.add(12);
	 numbers.add(8);
	 numbers.add(25);
	 numbers.add(4);
	   Iterator<Integer> it=numbers.iterator();
	   while(it.hasNext()) {
		   Integer i=it.next();
		   if(i<10) {
			   it.remove();
		   }
	   }
	   System.out.println(numbers);
 }
}
