//********************************************************************
//
//  Author:        <Your name>
//
//  Program #:     Six
//
//  File Name:     Program6.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      <Due Date>
//
//  Instructor:    Prof. Fred Kumi
//
//  Chapter:       <Chapter #>
//
//  Description:   This program calculates and displays the average
//                 of six test scores, all integers, after the lowest
//                 score has been dropped.
//
//                 Do not modify the main method or the header of any
//                 method.  You will not receive credit for Program 6
//                 if you do.
//
//********************************************************************
import java.util.Scanner;

public class Program6
{
    Scanner input = new Scanner(System.in);

    //***************************************************************
    //
    //  Method:       main
    //
    //  Description:  The main method of the program.
    //                Do NOT modify this method. If you modify it, you
    //                will not receive credit for this program.
    //
    //  Parameters:   A String Array
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public static void main(String[] args)
    {
        Program6 object = new Program6();

        int test1 = 0;
        int test2 = 0;
        int test3 = 0;
        int test4 = 0;
        int test5 = 0;
        int test6 = 0;
        int lowest = 0;
        double average = 0.0;

        developerInfo();
        displayMessage();

        // Call getScore once for each of the six test scores
        test1 = object.getScore("Please enter the 1st test scores: ");
        test2 = object.getScore("Please enter the 2nd test scores: ");
        test3 = object.getScore("Please enter the 3rd test scores: ");
        test4 = object.getScore("Please enter the 4th test scores: ");
        test5 = object.getScore("Please enter the 5th test scores: ");
        test6 = object.getScore("Please enter the 6th test scores: ");

        // Call findLowest to find and return the lowest
        lowest = object.findLowest(test1, test2, test3, test4, test5, test6);

        // Call calcAverage to calculate and return the average
        average = object.calcAverage(test1, test2, test3, test4, test5, test6, lowest);

        // Print the average to two decimal places
        object.printAverage(lowest, average);

    } // End of the main method

    //***************************************************************
    //
    //  Method:       displayMessage
    //
    //  Description:  This method displays a message to screen
    //
    //  Parameters:   None
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public static void displayMessage()
    {
        System.out.print("This program calculates and displays ");
        System.out.println("the average of six test");
        System.out.print("scores, all integers, after the lowest ");
        System.out.println("score has been dropped. \n");
    }

    //***************************************************************
    //
    //  Function:     getScore
    //
    //  Description:
    //
    //  Parameters:
    //
    //  Returns:
    //
    //**************************************************************
    public int getScore(String prompt)
    {


    }// end of the getScore method

    //***************************************************************
    //
    //  method:       calcAverage
    //
    //  Description:
    //
    //  Parameters:
    //
    //  Returns:
    //
    //**************************************************************
    public double calcAverage(int s1, int s2, int s3, int s4, int s5, int s6, int lowest)
    {



    }// end of calcAverage method

    //***************************************************************
    //
    //  method:       findLowest
    //
    //  Description:
    //
    //  Parameters:
    //
    //  Returns:
    //
    //**************************************************************
    public int findLowest(int s1, int s2, int s3, int s4, int s5, int s6)
    {


    } // end of the findLowest method

    //***************************************************************
    //
    //  Method:       printAverage
    //
    //  Description:  This method prints the average of the test scores
    //
    //  Parameters:   average
    //                lowest
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public void printAverage(int lowest, double average)
    {

    } // end of printAverage method


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
        System.out.println("Name:    <Put your full name here>");
        System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
        System.out.println("Program: Six \n");

    } // End of the developerInfo method

} // End of Program6

