/* Chimaobi Onwuka
 * ceo2134
 * Easter.java
/**
 * This program accepts a series of positive intergers
 * and reports their average
 * 
 * @author: <Chimaobi Onwuka>
 * @date: <2/4/22>
 */

import java.util.Scanner;
import java.lang.Math;

public class Average
{
    
    public static void main(String[] args)
    {
        //Variable Initiation
        double count = 0;
        boolean listBreakout = false;
        double dividend = 0;
        double dividendHold = 0;

        //User Interface
        Scanner input = new Scanner(System.in);
        System.out.println("Hello. Welcome to the average calculator.");
        System.out.println("Give me the value of first integer."); //Gets the first value
        dividend = dividend + input.nextDouble(); //Add the value to the sum of all the integer vales
        if ( dividend == -1 | (Math.floor(dividend) != dividend))
        {
            listBreakout = true;
            count = 0;
            System.out.println("Bye! You've ended the loop prematurely and/or your input was not a integer.");
        }
        else
        {
            count = count + 1;
            System.out.println("The current value of dividend is " + dividend + " and divisor is " + count + " .");
            
            while (listBreakout == false)
                {
                System.out.println(" Give me the value of the next integer."); //Gets the next value
                dividendHold = input.nextDouble();
                if (dividendHold == -1)
                { 
                    listBreakout = true;
                }
                else if ((Math.floor(dividendHold) == dividendHold))
                {
                    dividend = dividend + dividendHold;
                    count = count + 1;
                }
                else
                {
                    System.out.println("Your input was not a integer. Try again!");
                }
                System.out.print("The current value of dividend is " + dividend + " and divisor is " + count + " .");
                }
                
        //Average Calculations
        double averageValue = (dividend/count);
        System.out.println(" The average of the given integers is " +  averageValue + ".");
        }
    }
}
 