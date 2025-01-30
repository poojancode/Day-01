/**
 * 
 */
package com.infy.inheritance;

/*
@author:Pooja Nimbalkar
@date: Nov 14, 2024
@time:9:10:31 AM
@description: Multilevel inheritance
 */
public class Client {//multilevel inheritance
	public static void main(String[] args) {
		B b1 = new B();
		b1.m1();
		b1.m2();
		System.out.println(b1.p);
		System.out.println(b1.q);
		System.out.println(b1.r);
		System.out.println(b1.s);
		System.out.println("--------------");
		C c1 = new C();
		c1.m1();
		c1.m2();
		c1.m3();
		System.out.println(c1.p);
		System.out.println(c1.q);
		System.out.println(c1.r);
		System.out.println(c1.s);
		System.out.println(c1.t);
		
	}
}
