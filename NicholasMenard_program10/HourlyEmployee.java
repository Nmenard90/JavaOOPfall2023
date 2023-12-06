import java.util.Scanner;

public class HourlyEmployee extends Employee {
    private double totalHoursWorked;
    private double totalRegularHours;
    private double totalOvertimeHours;

    public HourlyEmployee(String firstName, String lastName, double payRate) {
        super(firstName, lastName, payRate);
        this.totalHoursWorked = 0.0;
        this.totalRegularHours = 0.0;
        this.totalOvertimeHours = 0.0;
    }

    public void setTotalHoursWorked(double hoursWorked) {
        if (hoursWorked <= 40) {
            totalRegularHours += hoursWorked;
        } else {
            totalRegularHours += 40;
            totalOvertimeHours += hoursWorked - 40;
        }
        totalHoursWorked += hoursWorked;
    }

    public double getTotalRegularHours() {
        return totalRegularHours;
    }

    public double getTotalOvertimeHours() {
        return totalOvertimeHours;
    }

    public double getMonthlyRegularPay() {
        return totalRegularHours * getPayRate();
    }

    public double getMonthlyOvertimePay() {
        return totalOvertimeHours * (getPayRate() * 1.5);
    }

    @Override
    public String toString()
    {
        double grossPay = getMonthlyRegularPay() + getMonthlyOvertimePay();
        double taxes = calculateTaxes(grossPay);
        double netPay = grossPay - taxes;

        return super.toString() +
                String.format("%nTotal regular hours worked: %.2f%n" +
                                "Total overtime hours worked: %.2f%n" +
                                "Total hours worked: %.2f%n" +
                                "Monthly Regular Pay: %.2f%n" +
                                "Monthly Overtime Pay: %.2f%n" +
                                "Monthly Gross Pay: %.2f%n" +
                                "Monthly Taxes: %.2f%n" +
                                "Monthly Net Pay: %.2f%n",
                        totalRegularHours,
                        totalOvertimeHours,
                        totalHoursWorked,
                        getMonthlyRegularPay(),
                        getMonthlyOvertimePay(),
                        grossPay,
                        taxes,
                        netPay);
    }

    private double calculateTaxes(double grossPay) {
        if (grossPay <= 1200) {
            return 0.0;
        } else if (grossPay <= 2500) {
            return grossPay * 0.10;
        } else if (grossPay <= 4500) {
            return grossPay * 0.15;
        } else if (grossPay <= 8000) {
            return grossPay * 0.22;
        } else if (grossPay <= 10000) {
            return grossPay * 0.28;
        } else if (grossPay <= 15000) {
            return grossPay * 0.31;
        } else {
            return grossPay * 0.36;
        }
    }
}