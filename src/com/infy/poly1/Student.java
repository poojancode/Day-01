/**
 * 
 */
package com.infy.poly1;
		//com-domain name, infy-company name, poly1-project name.
/*
@author:Pooja Nimbalkar
@date: Nov 11, 2024
@time:10:09:04 AM
@description:X
 */
public class Student {

	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return id+"  "+name;
	}	
}
