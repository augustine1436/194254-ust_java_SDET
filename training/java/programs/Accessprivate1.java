package com.ust.test;
 
class data1{
	private String name;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
public class Accessprivate1 {
    public static void main(String[] args) {
    	data1 d= new data1();
    	d.setName("abc");
    	System.out.println(d.getName());		
    	
    }
}
