/**
 * 
 */
package com.infy.method;

/*
@author:Pooja Nimbalkar
@date: Nov 7, 2024
@time:9:50:20 AM
@description:N
 */
public class N extends M{

	void m1() {
		System.out.println("child m1");
	}
	
	void m2() {
		this.m1();
		super.m1();
	}
}
