/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rollEm;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author edsonlopez
 */
public class Dice {
    
    public static void main(String args[])
	{
            boolean replay = true;
            int count1 = 1;
            int count2 = 1;
            int count3 = 1;
            double winRate = 0;
            boolean play = true;
            String again;
            
	    // It is better to use 6 int variables for these purposes
	    // The array is much better suited for saving the history of the game (all users input, all system numbers...)
            int[] total;
            
            total = new int[6];
            
            total[0] = 1; //games played
            total[1] = 0; //games lost
            total[2] = 0; //games won
            total[3] = 0; //number of odds
            total[4] = 0; //number of even
            total[5] = 0; //win rate
            
            while (play) 
                {
            
                    Scanner input = new Scanner(System.in);
                    String choice;
                
                    System.out.print("Round: " + total[0]);
                
                    System.out.print("\nOdd or Even? ");
                    choice = input.next();
            
                    int rndnumber = 1 + (int)(Math.random() * 6);
                    String stringNumber = " ";
               
                    int evod = 0;
                    evod = rndnumber % 2;
                    
                    if(evod == 0)
                        {
                            stringNumber = "even";
                            if (stringNumber == "even") 
                                {
                                    total[4]++;
                                }                   
                        } else if(evod == 1) 
                            {
                                stringNumber = "odd";
                                if (stringNumber == "odd") 
                                    {
                                        total[3]++;
                                    }
                            }
                    System.out.printf("Computer chose %d", rndnumber);
                    if(stringNumber.equals(choice))
                        {
                            System.out.print("\nYou Win!");
                            total[2]++;
                        } else 
                            {
                                System.out.print("\nYou Lose!");
                                total[1]++;
                            }
                
                    if (play == true) 
                        {                  
                            System.out.print("\nPlay again? ");
                            again = input.next();
                            if (again.equalsIgnoreCase("yes"))
                                {
                                    play = true;
                                    total[0]++;
                                } else //if (again.equalsIgnoreCase("no"))
                                    { 
                                        play = false;
                                        System.out.println("Total games played:  " + total[0]);                 
                                        System.out.println("Total games lost:  " + total[1]);
                                        System.out.println("Total games won:  " + total[2]);
                                        System.out.println("Total games computer chose odd:  " + total[3]);
                                        System.out.println("Total games computer chose even:  " + total[4]);
                            
                                        total[5] = (total[2]*100)/total[0];
                                                                                
                                        System.out.printf("Your win rate is: " + total[5]);
                                        System.out.printf(" percent");
                                        System.out.print("\nThanks for playing");
                                        System.exit(0);
                                    }
 
                        }
                }      
        }
}
