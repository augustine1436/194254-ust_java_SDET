package com.ust.test;

class animal{
	
	animal(){
	System.out.println("i am an animal");
}
}
class dog extends animal{
	dog(){
		super();
	}
}
public class mainAnimal {
  public static void main(String[] args) {
	  dog dog1= new dog();
	  
  }
}
