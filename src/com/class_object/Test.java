package com.class_object;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();		
		
		s1.id=101;
		s1.name="pooja";
		s1.course="java";
		s1.cgpa=8.9f;
	
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.course);
		System.out.println(s1.cgpa);
		System.out.println("--------------");
		System.out.println();
		
		s2.id=111;
		s2.name="Arti";
		s2.course="Neet";
		s2.cgpa=9.9f;
		
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.course);
		System.out.println(s2.cgpa);
		System.out.println("-------------------");
		System.out.println();
		
		s3.id=112;
		s3.name="Komal";
		s3.course="python";
		s3.cgpa=9.0f;
		
		System.out.println(s3.id);
		System.out.println(s3.name);
		System.out.println(s3.course);
		System.out.println(s3.cgpa);
		
	}
}
