package com.ust.test;
 
interface polygon{
	void getArea(int length, int breadth);
}
class rectangle12112 implements polygon{
	public void getArea(int length,int breadth) {
		System.out.println("area"+(length*breadth));
	}
}

public class polygon1 {
  public static void main(String[] args) {
	rectangle12112 r1=new rectangle12112();
	r1.getArea(5, 6);
  }
}
