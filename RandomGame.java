   // Name: Medet Karl
// Class: CS 141
// Date: 05/15/2023
// Sources https://stackoverflow.com/questions/39627777/java-ask-user-if-they-want-to-play-again#:~:text=A%20possible%20solution%20is%20to,whether%20to%20continue%20or%20not.
// Guessing Game
// This program makes a game where user should guess the random number from 1 to to any that user choose.

import java.util.Random;
import java.util.Scanner;

public class RandomGame
   {
   public static void main (String[] args)
      {
      instruction();
      
       Scanner input = new Scanner(System.in);
         String Input = ""; 
           int game = 0;
           int total = 0;
           int best = 100;

           do {
               int numTries = Game();
          System.out.println("You got it right in " + numTries + " guesses");
          game++;
          total += numTries;
          if (best > numTries){
            best = numTries;}
               System.out.print("Do you want to play again (0 = yes, other = no)? ");
               Input = input.nextLine();
           } while (Input.equals("0") || Input.equals("")); // end of do-while loop

           double tg = total/(double)game;
           System.out.println("total games = " + game);
           System.out.println("total guesses = " + total);
           System.out.println("guesses/game = " + tg);
           System.out.println("best game = " + best);
     
        }      
      
        

     public static int Game(){
    
   Scanner nput = new Scanner(System.in);
      Random rand = new Random();
      System.out.print("What range of numbers do you want to guess? (from 1 to ?)(write only one number)");
      int num = nput.nextInt();
      nput.nextLine();
      int random = rand.nextInt(num) + 1;  
      
      System.out.print("I'm thinking of a number between 1 and " + num + "...");
      System.out.println(); 
      System.out.print("Your guess?");
      int guess = nput.nextInt();
      int count = 0;
      while (random != guess) {
         if (guess > random) {
           System.out.println ("It's lower.") ;
           System.out.println();
           count++;
         } else { 
           System.out.println ("It's higher."); 
           System.out.println();
           count++;
            }
        System.out.print("Your guess?");
        guess = nput.nextInt(); 
           } // end of while loop
        if (guess == random) {
               System.out.println();
              System.out.println("Congratulations! Your number is " + random);
                       }
 
  return count + 1;
     
   } // end of method  

   public static void instruction() { 
   System.out.print("This program allows you to play a guessing game.");

   System.out.println("I will think of a number between 1 and");

   System.out.println("100 and will allow you to guess until");

   System.out.println("you get it. For each guess, I will tell you");

   System.out.println("whether the right answer is higher or lower");

   System.out.println("than your guess.");
   }
} // end of class    