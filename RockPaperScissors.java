/*
Write a program that reads 2 characters from either the keyboard or a file. The characters are either PP, PR, PS, RP,
RR, RS, SP, SR, or SS. They correspond to the selections made by 2 players playing the game of rock-paper-scissors.
Make the program accept inputs until one player’s score is more than 3 points ahead of the other.
Hint: remember that you can use .substring() to get the elements of a String.

 */


package day2;

import java.util.Scanner;

public class RockPaperScissors {


	public static void main(String[] args) {
          
		  Scanner sc = new Scanner(System.in);
          String input;
          
		  int AScore = 0;
          int BScore = 0;
          String AChoice, BChoice;
          
          do {
        	  
        	  System.out.println("Enter: ");
        	  input = sc.next();
        	  
        	  AChoice = input.substring(0, 1);
        	  BChoice = input.substring(1, 2);
        	  
        	  if (AChoice.contentEquals("P") && BChoice.equals("R")){
        		  AScore++;
        	  } else if (AChoice.contentEquals("R") && BChoice.equals("S")) {
        		  AScore++;
        	  } else if (AChoice.contentEquals("S") && BChoice.equals("P")){
        		  AScore++;
        	  } else if (AChoice.equals(BChoice)){
        		  
        	  } else {
        		  BScore++;
        	  }
        	  
          } while ((AScore < BScore +3) && BScore < AScore +3);
     
          if (AScore>BScore){
        	  System.out.println("Player A won!");
          } else {
        	  System.out.println("Player B won!");
          }
	}

}
