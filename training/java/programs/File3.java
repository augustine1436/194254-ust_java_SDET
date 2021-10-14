package com.ust.test;
import java.io.FileWriter;
public class File3 {
  public static void main(String[] args) {
	  String data="this is the data";
	  try {
		  FileWriter output=new FileWriter("output.txt");
		  output.write(data);
		  System.out.println("data is written");
	      output.close();  
	  }
	  catch (Exception e) {
		  e.getStackTrace();
	  }
  }
}
