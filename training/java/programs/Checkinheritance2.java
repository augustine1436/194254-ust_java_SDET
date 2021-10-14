package com.ust.test;

class teacher1{
	void teach() {
		System.out.println("teaching");
	}
}
	class students1 extends teacher1{
		void listen() {
			System.out.println("listening");
		}
		
	}
class hometution extends students{
	void explains() {
		System.out.println("Does homework");
	}
}

public class Checkinheritance2 {
    public static void main(String args[]) {
    	hometution h= new hometution();
    	h.explains();
    	h.teach();
    	h.listen();
    }
}
