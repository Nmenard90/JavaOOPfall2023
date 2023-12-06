import java.util.Scanner;
//********************************************************************
//
//  Developer:     Nicholas Menard
//
//  Program #:     Ten
//
//  File Name:     Employee.java
//
//  Course:        ITSE 2321 Objected-Oriented Programming (Java)
//
//  Instructor:    Prof. Fred Kumi
//
//  Description:   Employee rates calculator
//
//********************************************************************

public class Program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String runAgain = "yes";

        while (!runAgain.equalsIgnoreCase("no")) {
            testHourlyEmployee(scanner);

            System.out.print("Do you want to run the program again? (yes/no): ");
            runAgain = scanner.next();
        }

        System.out.println("Program terminated.");
        scanner.close();
    }

    private static void testHourlyEmployee(Scanner scanner) {
        System.out.print("Enter employee's first name: ");
        String firstName = scanner.next();

        System.out.print("Enter employee's last name: ");
        String lastName = scanner.next();

        System.out.print("Enter hourly rate of pay: ");
        double payRate = scanner.nextDouble();

        HourlyEmployee hourlyEmployee = new HourlyEmployee(firstName, lastName, payRate);

        for (int i = 0; i < 4; i++) {
            System.out.printf("Enter hours worked for week %d: ", i + 1);
            double hoursWorked = scanner.nextDouble();
            hourlyEmployee.setTotalHoursWorked(hoursWorked);
        }

        System.out.println(hourlyEmployee);
        developerInfo();
    }

    public static void developerInfo() {
        System.out.println("Name:    Nicholas Menard");
        System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
        System.out.println("Program: ten \n");

    }
}