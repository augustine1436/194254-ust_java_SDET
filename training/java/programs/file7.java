package com.ust.test;
import java.io.*;
public class file7 {
 public static void main(String[] args) {
	 String data ="this is inside of file";
	 try {
		 FileOutputStream file=new FileOutputStream("output.txt");
		 OutputStreamWriter output= new OutputStreamWriter(file);
		 output.write(data);
		 output.close();
	 }
	 catch (Exception e) {
		 e.getStackTrace();
	 }
 }
}
