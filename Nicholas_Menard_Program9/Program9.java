import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
import java.util.Locale;
import java.security.PublicKey;
import java.util.Objects;

// Test class for the HouseHold class
public class Program9 {
    // Main method to execute the program
    public static void main(String[] args) {
        ArrayList<HouseHold> households = readDataFromFile();
        printAllHouseholds(households);
        calculateAndPrintAverageIncome(households);
        printAboveAverageHouseholds(households);
        printBelowPovertyLevelHouseholds(households);
        printPercentageBelowFPL(households);
        printMedicaidEligibilityPercentage(households);
        writeOutputToFile(households, "Program9-output.txt");
        developerInfo();
    }

    // Reads household data from a file and returns an ArrayList of HouseHold objects
    private static ArrayList<HouseHold> readDataFromFile() {
        ArrayList<HouseHold> households = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("Program9.txt"))) {

            while (scanner.hasNext()) {
                int id = scanner.nextInt();
                double income = scanner.nextDouble();
                int members = scanner.nextInt();
                String state = scanner.nextLine();
                households.add(new HouseHold(id, income, members, state));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return households;
    }

    // Prints all households in a formatted table
    private static void printAllHouseholds(ArrayList<HouseHold> households) {
        System.out.printf("%-10s%-15s%-20s%s%n", "ID", "Income", "Members", "State");
        System.out.println("-------------------------------------------------------");
        for (HouseHold household : households) {
            System.out.printf("%-10d%-15.2f%-20d%s%n",
                    household.getId(), household.getIncome(), household.getMembers(), household.getState());
        }
        System.out.println();
    }

    // Calculates and prints the average household income
    private static void calculateAndPrintAverageIncome(ArrayList<HouseHold> households) {
        double totalIncome = 0;
        for (HouseHold household : households) {
            totalIncome += household.getIncome();
        }

        double averageIncome = totalIncome / households.size();
        System.out.printf("Average Household Income: %.2f%n%n", averageIncome);
    }

    // Prints households with income above the average in a formatted table
    private static void printAboveAverageHouseholds(ArrayList<HouseHold> households) {
        double totalIncome = 0;
        for (HouseHold household : households) {
            totalIncome += household.getIncome();
        }

        double averageIncome = totalIncome / households.size();

        System.out.printf("Households Above Average Income:%n");
        System.out.printf("%-10s%-15s%-20s%s%n", "ID", "Income", "Members", "State");
        System.out.println("-------------------------------------------------------");
        for (HouseHold household : households) {
            if (household.getIncome() > averageIncome) {
                System.out.printf("%-10d%-15.2f%-20d%s%n",
                        household.getId(), household.getIncome(), household.getMembers(), household.getState());
            }
        }
        System.out.println();
    }

    // Prints households with income below the poverty level in a formatted table
    private static void printBelowPovertyLevelHouseholds(ArrayList<HouseHold> households) {
        System.out.printf("Households Below Poverty Level:%n");
        System.out.printf("%-10s%-15s%-20s%-15s%s%n", "ID", "Income", "Poverty Level", "Members", "State");
        System.out.println("-------------------------------------------------------");

        for (HouseHold household : households) {
            double povertyLevel = calculatePovertyLevel(household.getMembers(), household.getState());
            if (household.getIncome() < povertyLevel) {
                System.out.printf("%-10d%-15.2f%-20.2f%-15d%s%n",
                        household.getId(), household.getIncome(), povertyLevel,
                        household.getMembers(), household.getState());
            }
        }
        System.out.println();
    }

    // Calculates the poverty level income based on household members and state
    private static double calculatePovertyLevel(int members, String state) {
        double povertyLevel;

        if (state.equals("Alaska")) {
            povertyLevel = 22680.00 + 5910.00 * (members - 2);
        } else if (state.equals("Hawaii")) {
            povertyLevel = 24640.00 + 6430.00 * (members - 2);
        } else {
            povertyLevel = 19720.00 + 5140.00 * (members - 2);
        }

        return povertyLevel;
    }

    // Prints the percentage of households below the Federal Poverty Level
    private static void printPercentageBelowFPL(ArrayList<HouseHold> households) {
        int belowFPLCount = 0;

        for (HouseHold household : households) {
            double povertyLevel = calculatePovertyLevel(household.getMembers(), household.getState());
            if (household.getIncome() < povertyLevel) {
                belowFPLCount++;
            }
        }

        double percentage = (double) belowFPLCount / households.size() * 100;
        System.out.printf("Percentage of Households Below Federal Poverty Level: %.2f%%%n%n", percentage);
    }

    // Prints the percentage of households eligible for Medicaid based on the Federal Poverty Level
    private static void printMedicaidEligibilityPercentage(ArrayList<HouseHold> households) {
        int medicaidEligibleCount = 0;

        for (HouseHold household : households) {
            double povertyLevel = calculatePovertyLevel(household.getMembers(), household.getState());
            if (household.getIncome() <= 1.38 * povertyLevel) {
                medicaidEligibleCount++;
            }
        }

        double percentage = (double) medicaidEligibleCount / households.size() * 100;
        System.out.printf("Percentage of Households Eligible for Medicaid (138%% of FPL): %.2f%%%n", percentage);
    }

    // Writes the output to a file
    private static void writeOutputToFile(ArrayList<HouseHold> households, String fileName) {
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            writer.printf("%-10s%-15s%-20s%s%n", "ID", "Income", "Members", "State");
            writer.println("-------------------------------------------------------");
            for (HouseHold household : households) {
                writer.printf("%-10d%-15.2f%-20d%s%n",
                        household.getId(), household.getIncome(), household.getMembers(), household.getState());
            }
            writer.println();
            calculateAndPrintAverageIncomeToFile(households, writer);
            printAboveAverageHouseholdsToFile(households, writer);
            printBelowPovertyLevelHouseholdsToFile(households, writer);
            printPercentageBelowFPLToFile(households, writer);
            printMedicaidEligibilityPercentageToFile(households, writer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Writes the average household income to a file
    private static void calculateAndPrintAverageIncomeToFile(ArrayList<HouseHold> households, PrintWriter writer) {
        double totalIncome = 0;
        for (HouseHold household : households) {
            totalIncome += household.getIncome();
        }

        double averageIncome = totalIncome / households.size();
        writer.printf("Average Household Income: %.2f%n%n", averageIncome);
    }

    // Writes households with income above the average to a file
    private static void printAboveAverageHouseholdsToFile(ArrayList<HouseHold> households, PrintWriter writer) {
        double totalIncome = 0;
        for (HouseHold household : households) {
            totalIncome += household.getIncome();
        }

        double averageIncome = totalIncome / households.size();

        writer.printf("Households Above Average Income:%n");
        writer.printf("%-10s%-15s%-20s%s%n", "ID", "Income", "Members", "State");
        writer.println("-------------------------------------------------------");
        for (HouseHold household : households) {
            if (household.getIncome() > averageIncome) {
                writer.printf("%-10d%-15.2f%-20d%s%n",
                        household.getId(), household.getIncome(), household.getMembers(), household.getState());
            }
        }
        writer.println();
    }

    // Writes households with income below the poverty level to a file
    private static void printBelowPovertyLevelHouseholdsToFile(ArrayList<HouseHold> households, PrintWriter writer) {
        writer.printf("Households Below Poverty Level:%n");
        writer.printf("%-10s%-15s%-20s%-15s%s%n", "ID", "Income", "Poverty Level", "Members", "State");
        writer.println("-------------------------------------------------------");

        for (HouseHold household : households) {
            double povertyLevel = calculatePovertyLevel(household.getMembers(), household.getState());
            if (household.getIncome() < povertyLevel) {
                writer.printf("%-10d%-15.2f%-20.2f%-15d%s%n",
                        household.getId(), household.getIncome(), povertyLevel,
                        household.getMembers(), household.getState());
            }
        }
        writer.println();
    }

    // Writes the percentage of households below the Federal Poverty Level to a file
    private static void printPercentageBelowFPLToFile(ArrayList<HouseHold> households, PrintWriter writer) {
        int belowFPLCount = 0;

        for (HouseHold household : households) {
            double povertyLevel = calculatePovertyLevel(household.getMembers(), household.getState());
            if (household.getIncome() < povertyLevel) {
                belowFPLCount++;
            }
        }

        double percentage = (double) belowFPLCount / households.size() * 100;
        writer.printf("Percentage of Households Below Federal Poverty Level: %.2f%%%n%n", percentage);
    }

    // Writes the percentage of households eligible for Medicaid to a file
    private static void printMedicaidEligibilityPercentageToFile(ArrayList<HouseHold> households, PrintWriter writer) {
        int medicaidEligibleCount = 0;

        for (HouseHold household : households) {
            double povertyLevel = calculatePovertyLevel(household.getMembers(), household.getState());
            if (household.getIncome() <= 1.38 * povertyLevel) {
                medicaidEligibleCount++;
            }
        }

        double percentage = (double) medicaidEligibleCount / households.size() * 100;
        writer.printf("Percentage of Households Eligible for Medicaid (138%% of FPL): %.2f%%%n", percentage);
    }


    public static void developerInfo() {
        System.out.println("\nName:  Nicholas Menard");
        System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
        System.out.println("Program: 9 \n");
    }
}
