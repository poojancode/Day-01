/**
 * 
 */
package com.infy.poly4;

/*
@author:Pooja Nimbalkar
@date: Nov 14, 2024
@time:10:25:20 AM
@description:Student
 */
public class Student {

	int id;
	String name;
	
	Student(){
		
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id +" "+ name;
	}
	
	
}
