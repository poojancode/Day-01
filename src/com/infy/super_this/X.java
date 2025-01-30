/**
 * 
 */
package com.infy.super_this;

/*
@author:Pooja Nimbalkar
@date: Nov 7, 2024
@time:9:56:44 AM
@description:X
 */
public class X {

	X(){
		super();
		System.out.println("hello ");
	}
	
	X(int a){
		this();
		System.out.println("hi " +a);
	}
	
	X(int a, int b){
		this(a);
		System.out.println("Bye " + (a+b));
	}
}
