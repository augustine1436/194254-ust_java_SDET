package com.ust.test;

class Test12 {
	int val1;
	int val2;
	Test12(){
		val1=10;
		val2=20;
	}
   void printVal(Test12 obj) {
	   System.out.println("val1 = "+obj.val1+" val2= "+obj.val2);
   }
   void get() {
	   printVal(this);
   }
}
class MaintestMethod{
	public static void main(String[] args) {
		Test12 object = new Test12();
		object.get();
	}
}
