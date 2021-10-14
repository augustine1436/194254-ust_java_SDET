package com.ust.test;
import java.util.*;
public class Collection3 {
  public static void main(String[] args) {
	  HashMap<String,Integer> people =new HashMap<String,Integer>();
	  people.put("john", 32);
	  people.put("steve", 39);
	  people.put("jobbs", 41);
	  people.put("max", 36);
	  for(String i:people.keySet()) {
		System.out.println("key :" +i+"value "+people.get(i));  
	  }
  }
}
