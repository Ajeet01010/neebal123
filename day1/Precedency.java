package com.gurkul.day1;

public class Precedency {
	public static void main(String args[]) {
		int x=7, c=3;
		float y =3;
		double z= x*y/3+y-2/4*3%x;
		System.out.println("Modulo:  " + z);
		
		double a = 2.0/4;
		System.out.println("Modulo1:  " + a);
		
		double b = 2.0/0.5;
		System.out.println("Modulo2:  " + b);
		
		System.out.println(x + c + "has a sum  " + x + c);
		System.out.println(x + c + "has a sum  " + (x + c) );
		System.out.println( (x + c + "has a sum  " )+ x + c);
		System.out.println(x + c + "has a sum  " + (x % c) );
		System.out.println(x + c + "has a sum  " + (y%c) );
		
		
		int p = 3000;
		int k = p/2000;
		int k1 = p%2000;
		System.out.println("2k:  " + k);
		System.out.println("2k1:  " + k1);
	}

}
