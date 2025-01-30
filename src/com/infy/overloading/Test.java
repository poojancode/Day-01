package com.infy.overloading;

public class Test {

	public static void main(String[] args) {
		X obj = new X();
		
		int res1 = obj.add(20, 49);
		System.out.println(res1);
		
		float res2 = obj.add(27.9f, 85.7f);
		System.out.println(res2);
		
		float res3 = obj.add(12.98f, 20);
		System.out.println(res3);
		
		float res4 = obj.add(34, 24.90f);
		System.out.println(res4);
		
		int res5 = obj.add(56, 82, 95);
		System.out.println(res5);
		
		
	}
}
