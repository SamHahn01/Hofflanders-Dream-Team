/**
 * @(#)PairOfDice.java
 *
 *
 * @author 
 * Demonstrates the use of a class with overloaded constructors.
 */
import java.util.Scanner;

public class Pig2 
{
	
	//Creates two dies objects, then rolls both dice a set number of times, counting the number of box cars that occur.
	
    public static void main (String[]args) {
    	
    	int playerScore = 0, compScore = 0, queue = 1, round = 1, skip = 0, point, point1 = 0;
    	final int MAX_POINTS = 100;
    	int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
    	
    	Die die1 = new Die(); //creates a six-sided die for you
    	Die die2 = new Die(); //another creates a six-sided die for you
    	Die die3 = new Die(); //creates a six-sided die for computer
    	Die die4 = new Die(); //another creates a six-sided die for computer
    	
    	Scanner scan = new Scanner(System.in);
    	
    	while (playerScore < MAX_POINTS && compScore < MAX_POINTS)
    	{
    		skip = 0;
    		System.out.println("1\n\n\nRound " + round);
    		round++;
    	
    		System.out.println("Do you want to roll?\n(Roll=1, Pass = 0)");
    		queue = scan.nextInt();
			point1 = 0;
    		while (queue == 1)
    		{
    			num1 = die1.roll();// creates a six-sided
    			num2 = die2.roll();
    			
    			System.out.println("You rolled " + num1 + " and " + num2);
    			
    			if (num1 != 1 && num2 != 1) 
				{
    			playerScore = (num1 + num2 + playerScore);
				}
				
    			point = (num1 + num2);
				point1 = (point + point1);	
					
    			if (num1 == 1 && num2 != 1 || num1 != 1 && num2 == 1)
    			{
    			System.out.println("You lost all your points for this round because you rolled a 1.");
    			point1 = point1 - point;
    			
    				if (playerScore != 0)
    			{
    				playerScore = playerScore - point1;
    			}
				
    			queue = 0;
    			}
    			
    			if (num1 == 1 && num2 == 1)
    			{
    				System.out.println("You lost all your points for the game because you rolled a pair of 1 and will start with 0 points.");
    				playerScore = 0;
    				queue = 0;
    			}
    			
   			 	if (num1 != 1 && num2 !=1)
    			{
    				System.out.println("Do you want to roll the die or pass it?\n(Roll = 1, Pass = 0)");
    				queue = scan.nextInt();
    			}
   			 }
   			 
   			 System.out.println("You got " + playerScore + " points.\n");
   			 point = 0;
   			  point1 = 0;
   			  
   			 //------------------------------------------------------------
   			 //Computer Turn
   			 //------------------------------------------------------------
   			
   			 while (point1 < 20 && playerScore <100 && skip == 0)
   			 {
   			 	num3 = die3.roll();
				num4 = die4.roll();
				
				System.out.println("The computer rolled " + num3 + " and " + num4);
				
					if (num3 != 1 && num4 != 1) 
					{
    					compScore = (num3 + num4 + compScore);
					}
					
    			point = (num3 + num4);
				point1 = (point + point1);
					
    			if (num3 == 1 && num4 != 1 || num3 != 1 && num4 == 1)
    			{
    			System.out.println("The computer lost all their points for this round because they rolled a 1.");
    			point1 = point1 - point;
    			
    			if (compScore != 0)
    			{
    			compScore = compScore - point1;
    			}
    			
    			System.out.println(playerScore + " " + point1);
    			
    			skip = 1;
    			}
    			if (num3 == 1 && num4 == 1)
    			{
    				System.out.println("The computer lost all your points for the game because they rolled a pair of 1 and will start with 0 points.");
    				compScore = 0;
    				skip = 1;
    			}
   			 }
    	}
   		if (compScore >= 100)
   		 	System.out.println("\nThe computer reached over 100 points and Won.");
		if (playerScore >= 100)
    		System.out.println("\nYou reached over 100 points and Won.");
    }
}