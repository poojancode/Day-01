/**
 * 
 */
package com.infy.tka;

/*
@author:Pooja Nimbalkar
@date: Nov 7, 2024
@time:8:29:23 AM
@description:Student
 */
public class Student {
	
private int id;
private String name;

public Student() {
	super();
}

public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	if(id < 0)
		System.out.println("Id cannot be negative");
	else
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}


}
