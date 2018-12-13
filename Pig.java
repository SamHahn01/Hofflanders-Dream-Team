/**
 * @(#)PairOfDice.java
 *
 *
 * @author 
 * Demonstrates the use of a class with overloaded constructors.
 */
import java.util.Scanner;

public class Pig 
{
	
	//Creates two dies objects, then rolls both dice a set number of times, counting the number of box cars that occur.
	
    public static void main (String[]args) 
    	{
    	
    	int player = 0, comp = 0, queue = 1, round = 1, skip = 0;
    	final int MAX_POINTS = 100;
    	int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
    	
    	Die die1 = new Die(); //creates a six-sided die for you
    	Die die2 = new Die(); //another creates a six-sided die for you
    	Die die3 = new Die(); //creates a six-sided die for computer
    	Die die4 = new Die(); //another creates a six-sided die for computer
    	
    	Scanner scan = new Scanner(System.in);
    	
    	
    	
    	while (player < MAX_POINTS && comp < MAX_POINTS)
    	{
    		System.out.println("\n\nRound " + round);
    		round++;
    		
    		int point = 0;
    		
    		System.out.println("Do you want to roll the die or pass it?\n(Roll = 1, Pass = 0)");
    	queue = scan.nextInt();
    		
    		while (queue == 1 && player < MAX_POINTS)
    		{
    		num1 = die1.roll();// creates a six-sided
    		num2 = die2.roll();
    		
    		System.out.println("You rolled a "+ num1 + " and " + num2);
    		point = (num1 + num2 + point);
    		if (num1 == 1 || num2 == 1)
    		{
    			System.out.println("You lost all your points for this round because you rolled a 1.");
    			point = 0;
    			queue = 0;
    			
    			if (num1 == 1 && num2 == 1)
    			{
    				System.out.println("You lost all your points for the game because you rolled a pair of 1 and will start with 0 points.");
    				player = 0;
    				queue = 0;
    			}
    		}
    		System.out.println("You got " + point + " points.");
    		if (num1 != 1 && num2 !=1)
    		{
    		System.out.println("Do you want to roll the die or pass it?\n(Roll = 1, Pass = 0)");
    		queue = scan.nextInt();
    		}
    		}
    		player = (player + point);
    		System.out.println("You got " + player + " points this round.");
    		
    		//_______________________________________________________________________
    		point = 0;
    		skip = 0;
    		
    		System.out.println();
    		if (player < 100)
    		{
    		while (point < 20 && skip == 0)
			{
    		num3 = die3.roll();
			num4 = die4.roll();
			
			System.out.println("The computer rolled a "+ num3 + " and " + num4);
			point = (num3 + num4 + point);
			
				if (num3 == 1 || num4 == 1)
    		{
    			System.out.println("The computer lost all their points for this round because they rolled a 1.");
    			point = 0;
    			skip = 1;
    			
    			if (num3 == 1 && num4 == 1)
    			{
    				System.out.println("The computer lost all your points for the game because they rolled a pair of 1 and will start with 0 points.");
    				comp = 0;
    				skip = 1;
    			}
    		}
			}
    		comp = (comp + point);
    		System.out.println("The computer got " + comp + " points.");
    		queue = 1;
    	}
    	
    	if (comp >= 100)
    		System.out.println("\nThe computer reached over 100 points and Won.");
		if (player >= 100)
    		System.out.println("\nYou reached over 100 points and Won.");
	}
}
}