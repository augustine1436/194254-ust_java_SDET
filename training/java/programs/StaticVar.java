package com.ust.test;

class Student {
	int rollno;
	String name;
    static  String collegeName;
}
public class StaticVar{
	public static void main(String[] args) {
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		Student.collegeName="topper";
		s1.rollno=1;
		s1.name="stud1";
		s2.rollno=2;
		s2.name="stud2";
		s3.rollno=3;
		s3.name="stud3";
		System.out.println("s1 Roll no="+s1.rollno+"s1 name="+s1.name+"s1 College name="+s1.collegeName);
		System.out.println("s2 Roll no="+s2.rollno+"s2 name="+s2.name+"s2 College name="+s2.collegeName);
		System.out.println("s3 Roll no="+s3.rollno+"s3 name="+s3.name+"s2 College name="+s2.collegeName);
		s2.collegeName="my college";
		s2.name="abc";
		System.out.println("s1 Roll no="+s1.rollno+"s1 name="+s1.name+"s1 College name="+s1.collegeName);
		System.out.println("s2 Roll no="+s2.rollno+"s2 name="+s2.name+"s2 College name="+s2.collegeName);
		System.out.println("s3 Roll no="+s3.rollno+"s3 name="+s3.name+"s2 College name="+s2.collegeName);
		
		
	}
}
