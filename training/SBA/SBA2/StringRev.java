package com.ust.test;
import java.util.Scanner;

public class StringRev {
	    public static void main (String[] args) {	       
	        String str= "augustine", a="";
	        char ch;	       
	      System.out.println("word: "+str);	      	       
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i);
	        a= ch+a;
	      }
	      System.out.println("Reversed word: "+ a);
	    }
	
}
