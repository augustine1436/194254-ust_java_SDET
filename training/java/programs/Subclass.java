package com.ust.test;

class parentclass{
	void display() {
		System.out.println("parent class method");
		}
}
class Subclass extends parentclass{
	void display() {
		System.out.println("child class method");
	}
	void printmsg() {
		display();
		super.display();
	}
	public static void main(String[] args)
        {
		Subclass obj= new Subclass();
		obj.printmsg();
		}
}


