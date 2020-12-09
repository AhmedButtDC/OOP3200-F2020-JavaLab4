//Group:            15
//Name:             Ahmed Butt, Michai Pryce
//Student ID:       100770449, 100668094
//Last Modified:    December 9, 2020
//Project:          OOP3200-F2020-JavaLab4

package ca.durhamcollege;

import java.time.LocalDate;
import java.util.regex.Pattern;

public abstract class Employee extends Person
{
    //Declarations
    private String employeeID;

    //EmployeeID get accessor
    public String getEmployeeID()
    {
        return this.employeeID;
    }

    //Parameterized Constructor
    public Employee(final String employeeID, String fullName, LocalDate birthDate)
    {
        super(fullName, birthDate);

        if (employeeID.length() == 8 && Pattern.matches("[0-9]+", employeeID))
        {
            //if employeeID is exactly 8 characters long and all characters are numeric
            this.employeeID = employeeID;
        }
        else
        {
            throw new IllegalArgumentException("Employee ID must be exactly 8 digits long.");
        }
    }

    //Method calculatePayDay() - gets the employees earning each pay period
    public double calculatePayDay()
    {
        return 0;
    }
}
