package com.ust.test;

import java.util.ArrayList;

public class Collection1 {
 public static void main(String[] args) {
	 ArrayList<String> cars=new ArrayList<String>();
	 cars.add("volvo");
	 cars.add("bmw");
	 cars.add("ford");
	 cars.add("benz");
	 cars.add("ferrari");
	 for(String i: cars) {
		 System.out.println(i);
	 }
 }
}
