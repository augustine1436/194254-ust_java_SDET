package com.ust.test;


 abstract class Abstraction2 {
   private String name;
   private int paymentperhour;
   
   public Abstraction2(String name, int paymentperhour) {
	   this.name=name;
	   this.paymentperhour=paymentperhour;
   }
   public abstract int calculatesalary();
   public String getname() {
	   return name;
   }
   public void setname(String name) {
	   this.name=name;
   }
   public int getpayementperhour() {
	   return paymentperhour;
   }
   public void setpaymentperhour(int paymentperhour) {
	   this.paymentperhour=paymentperhour;
   }
}
 public class Abstraction1{
	// Abstraction2 obj= new Abstraction2();
	 //obj.getName();
 }
