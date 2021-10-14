package com.ust.test;

abstract class Shape121 {
	String color;
	abstract double area();
	public abstract String toString();
	public Shape121(String color) {
		System.out.println("shape called");
		this.color=color;
	}
   public String getcolor() {
	   return color;
   }
}

class circle extends Shape121{
	double radius;
	public circle(String color,double radius) {
		super(color);
		System.out.println("circle");
		this.radius= radius;
	}
  @Override
  double area() {
	  return Math.PI*Math.pow(radius,2);
  }
  @Override
  public String toString() {
	  return "circle color is\n"+super.color+"and area is:"+area();
	    }
}
class rectangle extends Shape121{
	double length,width;
	public rectangle(String color,double length,double width) {
		super(color);
		System.out.println("rectangle");
		this.length=length;
		this.width=width;
		}
	@Override
	double area() {
		return length*width;
	}
	@Override
	public String toString() {
		return "rectangle"+super.color+"area"+area();
	}
}

public class Abstractionshape{
	public static void main(String[] args) {
		Shape121 s1=new circle("red",2.2);
		Shape121 s2= new rectangle("yelllow",2,4);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    	}
}