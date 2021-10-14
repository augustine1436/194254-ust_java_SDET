package com.ust.test;
import java.io.File;
public class File5 {
   public static void main(String[] args){
	   File file=new File("javaexample.txt");
	   boolean value = file.mkdir();
	   if(value) {
		   System.out.println("created");
	   }
	   else {
		   System.out.println("already exist");
	   }
   }
}
