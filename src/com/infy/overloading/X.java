package com.infy.overloading;

public class X {
	/*
	 *
	 */
	public int add(int a, int b) {
		return a+b;
	}
	public float add(float a, float b) {
		return a+b;
	}
	public float add(float a, int b) {
		return a+b;
	}
	public float add(int a, float b) {
		return a+b;
	}
	public int add(int a, int b,int c) {
		return a+b;
	}
}

