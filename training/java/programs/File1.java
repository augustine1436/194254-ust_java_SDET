package com.ust.test;
import java.io.File;

public class File1 {
   public static void main(String[] args) {
	   File file=new File("newfile.txt");
	   try {
		   boolean value=file.createNewFile();
		   if(value) {
			   System.out.println("file created");
		   }
		   else {
			   System.out.println("file already exists");
		   }
	   }
	   catch (Exception e) {
		   e.getStackTrace();
	   }
   }
}
