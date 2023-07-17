package com.gurkul.day1;

import java.util.Scanner;

public class Currency {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount:  ");
		int amount = sc.nextInt();
		
		
		int twoth = amount/2000;
		amount = amount%2000;
		int fiveh = amount/500;
		amount = amount%500;
		int twoh = amount/200;
		amount = amount%200;
		int h = amount/100;
		amount = amount%100;
		int ff = amount/50;
		amount = amount%50;
		int ty = amount/20;
		ty = amount%20;
		int ten = amount/10;
		ten = amount%10;
		int five = amount/5;
		
		int notes = twoth + fiveh + twoh + h + ff + ty + ten + five;
		
		System.out.println("No of notes are:  " + notes);
		System.out.println(twoth + "* 2000 = " + (2000*twoth));
		System.out.println(fiveh + "* 500 = " + (500*fiveh));
		System.out.println(twoh + "* 200 = " + (200*twoh));
		System.out.println(h + "* 100 = " + (100*h));
		System.out.println(ff + "* 50 = " + (50*ff));
		System.out.println(ty + "* 20 = " + (20*ty));
		System.out.println(ten + "* 10 = " + (10*ten));
		System.out.println(five + "* 5 = " + (5*five));
		
		
	}

}
