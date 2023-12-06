//***************************************************************
//
//  Class:        Employee
//
//  Description:  This class represents an Employee with first name, last name, and monthly salary using private instances.
//
//***************************************************************

public class Employee
{

    // create 3 private instanced variables firstname(string),lastname(string),
    // and monthly salary(double)
    //create set and get for each one
    private String FirstName;

    public void setFirstName(String FirstName)
    {

        /* Method to set the first name in the object */
        this.FirstName = FirstName;
    }
    // Then we add get method to retrieve the name from the object

    public String getFirstName()
    {
        // return the value of name to the caller
        return FirstName;
    }

    private String LastName;

    // do the same as above for other variables
    public void setLastName(String LastName)
    {
        /* Method to set the first name in the object */
        this.LastName = LastName;
    }

    public String getLastName()
    {
        return LastName;
    }

    private double MonthlySalary;

    // change data type to double for a floating point number
    public void setMonthlySalary(double MonthlySalary)
    {
        if (MonthlySalary > 0)
        {
            this.MonthlySalary = MonthlySalary;
        }
        else
        {
            System.out.println("Error: Monthly salary must be a positive value.");
        }

    }
    /* Method to set the first name in the object */
    // Then we add get method to retrieve the name from the object

    public double getMonthlySalary()
    {
        return MonthlySalary;
    }

    // Then we write the constructor  to initialize the instanced variables
    public Employee(String FirstName, String LastName, double MonthlySalary)
    {
        setFirstName(FirstName);
        setLastName(LastName);
        setMonthlySalary(MonthlySalary);
    }
    // next we build a yearly salary calculator

    //***************************************************************
    //
    //  Method:       YearlySalary
    //
    //  Description:  Calculates and returns the yearly salary
    //
    //  Parameters:   None
    //
    //  Returns:      The yearly salary by multiplying monthly salary by the 12 months in the year
    //***************************************************************

    public double YearlySalary ()
    {
        return MonthlySalary * 12;
    }
    // finally we write a method to give them a raise
    //***************************************************************
    //
    //  Method:       GiveRaise
    //
    //  Description:  Gives the employee a 20% raise by compounding 20% on top of the current yearly rate.
    //
    //  Parameters:   None
    //
    //  Returns:      N/A
    //
    //***************************************************************
    public void GiveRaise()
    {
        // instead of writing MonthlySalary = MonthlySalary * 12
        // we use the *= which is a compound of * and =
        // so it multiplies the current value on left
        // to the value on the right
        // Then it stores the new value back into variable on left
        MonthlySalary *= 1.20;
    }
}





