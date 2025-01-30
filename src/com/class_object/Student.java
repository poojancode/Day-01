package com.class_object;
public class Student {
	int id;
	String name;
	String course;
	float cgpa;
	
public Student() {
		super();
	}
public Student(int id, String name, String course, float cgpa) {
	this.id=id;
	this.name=name;
	this.course=course;
	this.cgpa=cgpa;
	}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", course=" + course + ", cgpa=" + cgpa + "]";
}
}
