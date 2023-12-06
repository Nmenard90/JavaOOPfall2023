//********************************************************************
//
//  Author:        Nicholas Maned
//
//  Program #:     one
//
//  File Name:     Program1.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      9/16/23
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapter #1
//
//  Description:   A program to calculate the total price of a meal including tax and tip
//
//********************************************************************

public class Program1
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
       // given numerical values for mealcost, tax, and tippercentage. Can easily be made into a dynamic function
       // but the question doesnt ask for that
       
	   double amount = 44.50;
       double taxpercentage = 0.0825; // the tax percentage is 8.25%
       double tipercentage = 0.15; // the tip percentage is 15%

	   
       developerInfo();
       
       //math to  calculate the dollar amount For the TAX ONLY
       double taxAmount = amount * taxpercentage;

       // the subtotal can be with or without tax with the context of the function it seems like after tax 
       //because the meal cost and the subtotal would be the same  without tax and therefore redundant.
       
       // calculate the subtotal by adding the original meal cost plus the calculated tax amount 
       double subTotal = amount + taxAmount;

     //calculate the ONLY the dollar amount of the TIP by multiplying the subtotal by the TIP percentage
     double tipAmount = subTotal * tipercentage;
     
     //calculate the total bill amount with tip and tax included
     double totalAmount = subTotal + tipAmount;

       //format and print the results
       System.out.printf("Meal Cost:          %6.2f%n", amount);
       System.out.printf("Tax Amount(8.25%%):  %6.2f%n", taxAmount);
       System.out.printf("Sub Total:          %6.2f%n", subTotal);
       System.out.printf("Tip Amount(15%%):    %6.2f%n", tipAmount);
       System.out.printf("Total Amount:       %6.2f%n", totalAmount);

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
       System.out.println("Program: One \n");

    } // End of the developerInfo method
}