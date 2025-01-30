package com.infy.abstract1;

public class Test {

	public static void main(String[] args) {
		A obj = new B();
		obj.m2();
		A a1 = new B();
		A a2 = new C();
		B b1 = new B();
		B b2 = new C();
		C c1 = new C();
		C c2 = new C();
		
		
		b2.m2();
	}
}
