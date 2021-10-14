package com.ust.test;
import java.util.Scanner;

public class SBA4evennumber {
	public static void main(String args[])
	{
	int number,i,count=0;
	Scanner input=new Scanner(System.in);

	System.out.println("Enter your Number");
	number=input.nextInt();

	for(i=1;i<number;i++)
	{
	if(i%2!=0)
	continue;
	count=count+i;
	}

	System.out.println("Sum of Even Numbers upto  " +number+ "  =  "+count);
	}
}

