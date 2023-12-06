import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        // Display developer information

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for employee information
        System.out.println("Program 4");
        System.out.print("Enter ID Number: ");
        int idNumber = scanner.nextInt();

        System.out.print("Enter Pay Rate: ");
        double payRate = scanner.nextDouble();

        System.out.print("Enter number of Hours: ");
        double employeesHours = scanner.nextDouble();

        scanner.close();

        double overTimeHours = employeesHours - 40.00;
        double parkingCharge = 35.00;
        double overTimePay = 0;
        double regularPay = payRate * employeesHours;
        double grossPay = regularPay + overTimePay;
        double tax = grossPay * 0.1275;
        double deductions = tax + parkingCharge;
        double regularHours;
        if (employeesHours <= 40) {
            regularHours = employeesHours;
        } else {
            regularHours = 40.00;
        }

        if (overTimeHours > 0) {
            overTimePay = overTimeHours * payRate * 1.5;
        } else {
            overTimePay = 0.00;
            overTimeHours = 0.00;
        }
        double netPay;
        if (grossPay > 750.00) {
            netPay = grossPay - deductions;
        } else {
            netPay = grossPay;
            deductions = 0.00;
            tax = 0.00;
        }

        System.out.println("ID Number: " + idNumber);
        System.out.printf("Pay Rate: %.2f%n", payRate);
        System.out.printf("Regular Hours: %.2f%n", regularHours);
        System.out.printf("Overtime Hours: %.2f%n", overTimeHours);
        System.out.printf("Total Hours: %.2f%n", employeesHours);
        System.out.printf("Regular Pay: %.2f%n", regularPay);
        System.out.printf("Overtime Pay: %.2f%n", overTimePay);
        System.out.printf("Gross Pay: %.2f%n", grossPay);
        System.out.printf("Tax: %.2f%n", tax);
        System.out.printf("Deductions: %.2f%n", deductions);
        System.out.printf("Net Pay: %.2f%n", netPay);
        developerInfo();

    }

    public static void developerInfo() {
        System.out.println("Name:    Nicholas Menard");
        System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
        System.out.println("Program: four \n");

    }
}


