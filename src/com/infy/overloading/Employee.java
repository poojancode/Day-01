/**
 * 
 */
package com.infy.overloading;

/*
@author:Pooja Nimbalkar
@date: Oct 25, 2024
@time:10:29:31 AM
@description:Employee
 */
public class Employee {

	int eid;
	String ename;
	String jdate;
	String role;
	double salary;
	
	public Employee() {
		super();
	}

	public Employee(int eid, String ename, String jdate) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.jdate = jdate;
	}

	public Employee(int eid, String ename, String jdate, String role, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.jdate = jdate;
		this.role = role;
		this.salary = salary;
	}
	
}
