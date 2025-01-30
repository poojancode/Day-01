package com.infy1;

public class Test {

	public static void main(String[] args) {
		
		A a1= new A();
		System.out.println(a1);
		A a2= new A();
		System.out.println(a2);
		A a3 = new A();
		System.out.println(a3);
		System.out.println();
		System.out.println("--------calling static method-------------");
		System.out.println(A.z);
		A.m2();
		
	System.out.println("-------");
		A a = new A();
		a.m1();
		B b1 = new B();
		b1.m1();
	}
}
