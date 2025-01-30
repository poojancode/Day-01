package com.infy.interface1;

public class X implements I1,I2,I3 {

	@Override
	public void m2() {
		System.out.println("m2");
	}

	@Override
	public void m1() {
		
		System.out.println("m1");
	}

	@Override
	public void m3() {
		System.out.println("m3");
		
	}

}
