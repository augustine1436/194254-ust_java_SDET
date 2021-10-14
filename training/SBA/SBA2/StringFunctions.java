package com.ust.test;

public class StringFunctions {
	 public static void main(String[] args) {
		    String first = "Hello! Welcome ";
		    String second = "To Programming";
		    System.out.println("\nString: " + first);
		    System.out.println("\nString: " + second);
		    //LENGTGH
		    int length = first.length();
		    System.out.println("\nLength: " + length);
		    
		    //conca
		    String joinedString = first.concat(second);
		    System.out.println("\nJoined String: " + joinedString);
		    //Equal
		    boolean result1 = first.equals(second);
		    System.out.println("\nIs Strings first and second are equal: " + result1);
		    //replace
		    System.out.println("\nreplaced");
		    System.out.println(first.replace('!', '.'));
		  }
	}
