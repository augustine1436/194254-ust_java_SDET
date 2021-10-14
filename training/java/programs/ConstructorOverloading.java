package com.ust.test;

public class ConstructorOverloading {
	String language;

	ConstructorOverloading(){
		this.language="java";
	}
	ConstructorOverloading(String language){
	   this.language=language;
   }
   public void getName() {
		System.out.println("programming language:"+ this.language);
	   }
   public static void main(String[] args) {
	   ConstructorOverloading obj2=new ConstructorOverloading("Python");
	   obj2.getName();
	   obj2.getName();
   }
}   
