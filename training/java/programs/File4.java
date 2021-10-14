package com.ust.test;
import java.io.File;
public class File4 {
 public static void main(String[] args) {
	 File file=new File("file.txt");
	 boolean value=file.delete();
	 if(value) {
		 System.out.println("file deleted");
	 }
	 else {
		 System.out.println("file not deleted");
	 }
 }
}
