package com.ust.test;
import java.util.Scanner;


public class SBA2inputconsole{
    public static void main(String args[]) {
        int number,sum=0;
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your limit   ");
         number=input.nextInt();
         for(int i=number;i>=0;i--) {
        		  sum=sum+i; 
        	  }
                
           System.out.println("Sum of positive numbers  "+sum);
}
}
