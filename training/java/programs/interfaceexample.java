package com.ust.test;

interface interfaceexample1{
	int display(int a, int b);		
}
interface interfaceexample2{
	int display1(int a,int b);
}
interface interfaceexample3 extends interfaceexample1,interfaceexample2{
	void sum(); 
}
class add1 implements interfaceexample3{
	int a,b;
	public int display(int a,int b) {
		this.a=a+b;
	return this.a;	
		
	}
	public int display1(int a,int b) {
		this.b=a+b;
		return this.b;
		}
	public void sum() {		
		System.out.println("sum is"+(a+b));
	}	
}
public class interfaceexample {
   public static void main(String[] args) {
	   add1 ob=new add1();
	   ob.display(2, 3);
	   ob.display1(4, 5);
	   ob.sum();
}
}