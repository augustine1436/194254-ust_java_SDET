package com.ust.test;
import java.io.InputStreamReader;
import java.io.FileInputStream;
public class File6 {
    public static void main(String[] args) {
    	char[] array=new char[100];
    	try {
    		FileInputStream file=new FileInputStream("input.txt");
    		InputStreamReader input=new InputStreamReader(file);
    		input.read(array);
    		System.out.println("data in stream");
    		System.out.println(array);
    		input.close();
    	}
    	catch (Exception e) {
    		e.getStackTrace();
    	}
    }
}
