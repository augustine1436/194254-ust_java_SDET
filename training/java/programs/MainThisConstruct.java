package com.ust.test;

class this_construct{
	int val1;
	int val2;
	this_construct(){
		this(10,20);
		System.out.println("default constructor");
	}
	this_construct(int val1,int val2){
		this.val1=val1;
		this.val2=val2;
		System.out.println("parameterized constructor");
	}
}

public class MainThisConstruct {
       public static void main(String[] args) {
    	   this_construct obj=new this_construct();
       }
}
