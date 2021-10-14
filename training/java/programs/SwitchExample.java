package com.ust.test;

public class SwitchExample {
	
	public static void main(String[] args) {
		int x=5;
		char c='b';
		String q="augustine";
		switch(x*2) {
		case 5:
			System.out.println("in case 5");
			break;
		case 10: 
			System.out.println("in case 10");
			break;
		//default:
			//System.out.println("in default");
		}
		switch(c) {
		case 'e':
			System.out.println("e");
			break;
		default:
			System.out.println("default");
		case 'a':	
			System.out.println("a");
			//break;
			
		}
		switch(q) {
		default:
			System.out.println("default");
		case "dijal":
			System.out.println("dijal");
			break;
		case "hiran":
			System.out.println("hiran");
			break;
		case "augustine":
			System.out.println("augustine");
			break;
		}
		
	}

}
