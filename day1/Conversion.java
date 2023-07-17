package com.gurkul.day1;

import java.util.Scanner;

public class Conversion {
	public static void main(String args[]) {
		// convert km into m, cm, feet, inches.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the kilometres:  ");
		int km = sc.nextInt();
		double metres, cm, inches, feet;
		metres = km * 1000;
		cm = metres*100;
		//feet = 3280*km;
		//inches = 12*feet;
		inches = cm/2.54;
		feet = inches/12;
		
		System.out.print("Metres in " + km + " km are:  " + metres);		
		System.out.print("\nCentimetres in " + km + "km are: " + cm);
		System.out.print("\nFeet in " + km + "km are: " + feet);
		System.out.print("\nInches in " + km + "km are: " + inches);
		
	}
}