package com.ust.test;

class test_this11{
	int val_a;
	int val_b;
	test_this11(){
		val_a=10;
		val_b=20;
		
	}
	test_this11 get() {
		return this;
	}
	void display() {
		System.out.println("val_a="+val_a+"val_b="+val_b);
	}
}

public class MainTestThis2 {
	public static void main(String[] args) {
		test_this11 obj= new test_this11();
		obj.get().display();
			}

}
