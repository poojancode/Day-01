/**
 * 
 */
package com.infy.inheritance;

/*
@author:Pooja Nimbalkar
@date: Oct 27, 2024
@time:7:45:08 PM
@description:Test
 */
public class Test {

	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int k=1; k<=10; k++) {
			for(int j=1; j<k; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int k=1; k<=10; k++) {
			for(int j=2; j>k; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
