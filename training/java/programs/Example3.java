package com.ust.test;

import java.util.Scanner;

class Example3{
	public static void main(String[] args) {
			int sum=0;
			int number=0;
			Scanner input= new Scanner(System.in);
			do {
				sum+=number;
		         System.out.println("enter the number");
		         number=input.nextInt();
			}while(number>=0);
			System.out.println("sum=" +sum);
			input.close();
			}
			
		}


