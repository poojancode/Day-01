package com.infy.abstract3;
public abstract class A {
	int x=10;
	int y;
		public abstract void m1();
	A(){	
	}
	public A(int x, int y) {
		super();
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString() {
		return x+ " "+y;
	}
	
}
