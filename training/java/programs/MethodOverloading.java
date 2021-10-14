package com.ust.test;

class adding{
	
	int adding(int a,int b){
		int sum=a+b;
		return sum;
	}

	void adding(float d, float e) {
		System.out.println("sum="+(d+e));
		
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		adding obj1= new adding();
		adding obj2=new adding();
		System.out.println("sum= "+obj1.adding(3, 5));
		obj2.adding(1.5f, 1.5f);
		
	}

}
