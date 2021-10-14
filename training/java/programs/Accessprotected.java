package com.ust.test;

class animal1{
	protected void display() {
		System.out.println("animal");
	}
}

class Accessprotected extends animal1{
      public static void main(String[] args) {
    	  Accessprotected  d=new Accessprotected();
    	  d.display();
      }
}
