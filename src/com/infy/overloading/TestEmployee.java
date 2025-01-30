/**
 * 
 */
package com.infy.overloading;

/*
@author:Pooja Nimbalkar
@date: Oct 25, 2024
@time:10:29:45 AM
@description:TestEmployee
 */
public class TestEmployee {

	public static void main(String[] r) {
		Employee e1 =new Employee();
		
		Employee e2 =new Employee(10,"pooja","27-oct-2024");
		
		Employee e3 =new Employee(11,"Arti","26-oct-2024","Devloper",800000);

		System.out.println(e1.eid+"  "+e1.ename+"  "+e1.jdate+"  "+e1.role+"  "+e1.salary);
		
		System.out.println(e1.eid+" "+e2.ename+"  "+e2.jdate+"  "+e2.role+"  "+e2.salary);
		
		System.out.println(e3.eid+"  "+e3.ename+"  "+e3.jdate+"  "+e3.role+"  "+e3.salary);
		
		
	}
}
