package com.infy.static1;

public class Z {

	{
	
		System.out.println("Instance block");
	}
	
	static {
		
		System.out.println("static block");
	}
	
	Z(){
		System.out.println("const of Z");
	}
}
  