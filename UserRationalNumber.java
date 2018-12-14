/**
 * @(#)RationalNumbers.java
 *
 *
 * @author 
 * @version 1.00 2018/12/14
 */

import java.util.Scanner;
public class UserRationalNumber
{
	public static void main (String[] args)
	{
		int a, b, c, d;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is you numerator for your first fraction?");
		a = scan.nextInt();
		System.out.println("What is you denominator for your first fraction?");
		b = scan.nextInt();
		System.out.println("What is you numerator for your second fraction?");
		c = scan.nextInt();
		System.out.println("What is you denominator for your second fraction?");
		d = scan.nextInt();


		
		Rational r1 = new Rational (a, b);
		Rational r2 = new Rational (c, d);
		Rational r3, r4, r5, r6, r7;
		
		System.out.println ("First rational number: " + r1);
		System.out.println ("Second rational number: " + r2);
		if (r1.equals(r2))
			System.out.println ("r1 and r2 are equal.");
		else
			System.out.println ("r1 and r2 are NOT equal.");
			
		r3 = r1.reciprocal();
		System.out.println ("The reciprocal of r1 is: " + r3);
		
		r4 = r1.add(r2);
		r5 = r1.subtract(r2);
		r6 = r1.multiply(r2);
		r7 = r1.divide(r2);
		
		System.out.println ("r1 + r2: " + r4);
		System.out.println ("r1 - r2: " + r5);
		System.out.println ("r1 * r2: " + r6);
		System.out.println ("r1 / r2: " + r7);
	}
}