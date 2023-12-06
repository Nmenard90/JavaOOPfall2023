

//********************************************************************
//
//  Author:        Nicholas Menard
//
//  Program #:     2
//
//  File Name:     Program2.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      9/12/23
//
//  Instructor:    Prof. Fred Kumi
//
//  Chapter:       Chapter #2
//
//  Description:   A program that calculates the property tax based on the actual value and tax rate that is
//                 given by the user.
//
//********************************************************************

//program uses scanner
import java.util.Scanner;
public class program2
{
    //***************************************************************
    //
    //  Method:       main
    //
    //  Description:  The main method of the program
    //
    //  Parameters:   String array
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public static void main(String[] args)
    {
        //Write a program, in a file named Program2.java, that asks the user for the actual value
        //of a piece of property and the current tax rate for each $100.00 of assessed value. The
        //program should then calculate and display how much annual property tax the homeowner
        //will be charged for his or her property. The program should also display the Property
        //Value, the Assessed Value, and the Tax Rate. Display all monetary values to two
        //decimal places.

        //first need to make a scanner for input

        Scanner input = new Scanner(System.in);

        //ask for the actual value of the Property from the user
        // store the actual value in actualvalue variable. It is a dollar amount so use double instead of int
        System.out.print("What is the actual value of the property?(use numbers only): ");
        double actualvalue = input.nextDouble();

        // get the assessed value by multiplying actual value by 60% or .6
        double assessedvalue = actualvalue * .6;

        // get the tax amount per 100$ from the user
        System.out.print("What is the current tax rate in dollars for each 100$ of assessed value?(use numbers only): ");

        //Store the tax rate from the user input
        double taxrate = input.nextDouble();

        //Arithmetic to convert to tax rate to a percentage and then multiply it times the assessed value
        double propertytax = (taxrate/100) * assessedvalue;


        developerInfo();




        // I will use %f for floating point number or decimal number format
        // with .2 in between to limit the output to 2 decimal places
        // Then Use %n for a new line after each output
        // each string should end with $%.2f%n
        // for tax rate we will output a percentage instead of a number using %%.
        // $ is a literal for dollars

        System.out.printf("Property Value: $%.2f%n", actualvalue);
        System.out.printf("Assessed Value: $%.2f%n", assessedvalue);
        System.out.printf("Tax Rate: %.2f%%%n", taxrate);
        System.out.printf("Annual Property Tax: $%.2f%n", propertytax);

    } // End of the main method

    //***************************************************************
    //
    //  Method:       developerInfo
    //
    //  Description:  The developer information method of the program
    //
    //  Parameters:   None
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public static void developerInfo()
    {
        System.out.println("Name:    Nicholas Menard");
        System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
        System.out.println("Program: Two \n");

    } // End of the developerInfo method
}