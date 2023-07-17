package com.gurkul.day1;

import java.util.Scanner;

public class Area {
	// Find area of equilateral traingle using sqrt function.
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of side:  ");
		int side = sc.nextInt();
		
		double area = (Math.sqrt(3)*Math.pow(side, 2))/4;
		double areat = (Math.sqrt(3))/4 * Math.pow(side, 2);
		
		System.out.println("Area of equilateral traingle is:  " + area);
		System.out.println("Area of equilateral traingle is:  " + areat);
	}

}
