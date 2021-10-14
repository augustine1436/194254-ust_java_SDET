package com.ust.test;
import java.io.*;
public class File9 {
   public static void main(String[] args) {
	   String data="data in output file";
	   try {
		   FileWriter file =new FileWriter("output.txt");
		   BufferedWriter output=new BufferedWriter(file);
		   output.write(data);
		   output.close();
	   }
	   catch (Exception e) {
		   e.getStackTrace();
	   }
   }
}
