package com.ust.test;

class human{
	public void eat() {
		System.out.println("human is eating");
			}
	}

class Methodoverridden1 extends human { 
	public void eat() {
		System.out.println("boys is eating");
	}
	public static void main(String[] args) {
		Methodoverridden1 obj= new Methodoverridden1();
		obj.eat();
	}

}
