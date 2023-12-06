//***************************************************************
//
//  Class:        Program3
//
//  Description:  This class demonstrates the capabilities of the Employee class.
//
//***************************************************************
public class Program3 {
    public static void main(String[] args)
    {
        // Create two Employee objects using the class
        Employee employee1 = new Employee("John", "Doe", 2875.00);
        Employee employee2 = new Employee("Jane", "Doe", 3150.75);

        // Display each object's yearly salary
        //got only 1 decimal place when we ran it, so we set print formatting to use 2 decimal places
        System.out.printf("The Yearly Salary for %s %s is: $%.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.YearlySalary());
        System.out.printf("The Yearly Salary for %s %s is: $%.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.YearlySalary());

        // Give each Employee a 20% raise
        employee1.GiveRaise();
        employee2.GiveRaise();

        // Display each object's yearly salary after they receive a raise
        // got 8 decimal places when we ran it, so we set print formatting to only use 2 decimal places
        // Employee name wouldn't work with just decimal format, so we use %s to reference the first and second string arguments that we add at the end.
        System.out.printf("%s %s's yearly salary after a 20 percent raise: $%.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.YearlySalary());
        System.out.printf("%s %s's yearly salary after a 20 percent raise: $%.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.YearlySalary());

        // Print developer information
        developerInfo();
    }

    // Developer information method
    public static void developerInfo() {
        System.out.println("\nName:  Nicholas Menard");
        System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
        System.out.println("Program: 3 \n");
    }
}
