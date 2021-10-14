package com.ust.test;

class ABC{
	public void disp() {
		System.out.println("disp()method of parent class" );
	}
}
class Methodoverridden2 extends ABC {
	public void disp() {
		System.out.println("disp() method of child class");
	}
	public void newMethod() {
		System.out.println("new mwthod of child class");
	}
	public static void main(String[] args) {
		ABC obj= new ABC();
		obj.disp();
		ABC obj2=new Methodoverridden2();
		obj2.disp();
	}

}
