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
            
            int gamesPlayed = 1;
            int gamesLost = 0;
            int gamesWon = 0;
            int amountOdd = 0;
            int amountEven= 0;
            //int winRate;
            
            boolean play = true;
            String again;
            
            while (play) 
                {
                    int winRate = (gamesWon*100)/gamesPlayed;
                    
                    int[] total;
            
                    total = new int[6];
            
                    total[0] = gamesPlayed; //games played
                    total[1] = gamesLost; //games lost
                    total[2] = gamesWon; //games won
                    total[3] = amountOdd; //number of odds
                    total[4] = amountEven; //number of even
                    total[5] = winRate; //win rate
            
                   
            
                    Scanner input = new Scanner(System.in);
                    String choice;
                
                    System.out.printf("Round: %d", gamesPlayed);
                
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
                                    amountEven++;
                                }                   
                        } else if(evod == 1) 
                            {
                                stringNumber = "odd";
                                if (stringNumber == "odd") 
                                    {
                                        amountOdd++;
                                    }
                            }
                    System.out.printf("Computer chose %d", rndnumber);
                    if(stringNumber.equals(choice))
                        {
                            System.out.print("\nYou Win!");
                            gamesWon++;
                        } else 
                            {
                                System.out.print("\nYou Lose!");
                                gamesLost++;
                            }
                    // why do you think you need this if statement?
                    if (play == true)
                        {                  
                            System.out.print("\nPlay again? ");
                            again = input.next();
                            if (again.equalsIgnoreCase("yes"))
                                {
                                    play = true;
                                    gamesPlayed++;
                                } else //if (again.equalsIgnoreCase("no"))
                                    { 
                                        play = false;
                                        System.out.println("Total games played:  " + total[0]);                 
                                        System.out.println("Total games lost:  " + total[1]);
                                        System.out.println("Total games won:  " + total[2]);
                                        System.out.println("Total games computer chose odd:  " + total[3]);
                                        System.out.println("Total games computer chose even:  " + total[4]);
                            
                                        //winRate = (gamesWon * 100)/gamesPlayed;
                                                                                
                                        System.out.printf("Your win rate is: " + total[5]);
                                        System.out.printf(" percent");
                                        System.out.print("\nThanks for playing");
				    // What would be an alternative to System.exit ?   Can you use the Play variable?
                                        System.exit(0);
                                    }
 
                        }
                }      
        }
}
