package com.ust.test;

class teacher{
	void teach() {
		System.out.println("Teaching subjects");
		}
}
class students extends teacher{
	void listen() {
		System.out.println("Listening to teacher");
		}
}
class Checkinheritance1 {
	public static void main(String args[]) {
		students s1= new students();
		s1.teach();
		s1.listen();
	}
}
