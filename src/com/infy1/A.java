package com.infy1;

public class A {

	int x;
	int y;
	static int z=2;
	
	A(){
		++x;
		++y;
		++z;
	}
	void m1() {
		System.out.println(z);
		System.out.println(x+y+z);
		System.out.println();	
	}
	public static void m2() {
		System.out.println(z);
		System.out.println("m2");
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + "]"+ "z ="+z;
	}
	
}
