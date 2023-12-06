import java.util.Scanner;

public class Program5 {
    //***************************************************************
    //
    //  Method:       main
    //
    //  Description:  Calculates the amount floors ,occupied, and unoccupied rooms in a hotel
    //  by asking the user how many floors are in the hotel and then keeping a running total based on the users
    // input. Then the program calculates the occupancy percentage of the hotel and displays the total amount
    // of vacant and occupied rooms.
    //
    //  Parameters:   none
    //
    //  Returns:      none
    //
    public static void main(String[] args) {
        //Start the scanner and name it input. Ask for input when scanner is called.
        developerInfo();
        Scanner input = new Scanner(System.in);

        // Initialize variables to store total room counts and occupied room counts whole numbers so use int.
        int totalRooms = 0;
        int totalOccupied = 0;

        // Ask the user for the number of floors in the hotel
        System.out.print("Enter the number of floors in the hotel: ");
        int numFloors = input.nextInt();

        //starting at 1 keep running loop in ascending order until you hit the number stored in floors variable
        // that the user has input//
        // Loop will iterate through each floor and ask for input until you hit the floor stored in floors variable
        for (int floor = 1; floor <= numFloors; floor++) {
            // Ask for the amount of rooms using the current iteration.
            //ex. iteration 1 asks you for the rooms only on floor 1 and then stores that value in roomsonfloor
            System.out.print("Enter the amount of Rooms on floor number: " + floor + " ? ");
            int roomsOnFloor = input.nextInt();

            // asks for occupied rooms using current iteration
            // will only ask for the occupied rooms on the current floor
            System.out.print("How many rooms Rooms occupied on floor number: " + floor + " ? ");
            int occupiedRooms = input.nextInt();

            // Takes the value of the rooms on each floor and keeps a running total as the loop continues
            // Do the same for occupied rooms
            totalRooms += roomsOnFloor;
            totalOccupied += occupiedRooms;
        }

        // Calculates the number of unoccupied rooms by taking the total amount of rooms
        // and subtracting the total amount of rooms that are occupied
        int unoccupiedRooms = totalRooms - totalOccupied;

        // Calculates the occupancy rate as a percentage
        // typecast to double to make sure that the output is a double no
        // matter what the numbers are.
        double occupancyRate = (double) totalOccupied / totalRooms * 100;

        // Display the results
        System.out.println("\nHotel Summary:");
        //display the total amount of rooms
        System.out.println("Total rooms: " + totalRooms);
        //display the total of occupied rooms
        System.out.println("Rooms occupied: " + totalOccupied);
        //display the total of occupied rooms
        System.out.println("Rooms unoccupied: " + unoccupiedRooms);
        // display the occupancy rate as a float and a percentage then add a new line.
        System.out.printf("Occupancy rate: %.1f%%\n", occupancyRate);
        // display developer info stored in developer info function


        // Close the scanner
        input.close();
    }

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
    public static void developerInfo() {
        System.out.println("\nName:  Nicholas Menard");
        System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
        System.out.println("Program: 5 \n");
    }
}
