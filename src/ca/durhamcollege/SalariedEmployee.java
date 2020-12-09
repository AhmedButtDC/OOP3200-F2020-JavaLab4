//Group:            15
//Name:             Ahmed Butt, Michai Pryce
//Student ID:       100770449, 100668094
//Last Modified:    December 9, 2020
//Project:          OOP3200-F2020-JavaLab4

package ca.durhamcollege;

import java.time.LocalDate;

public class SalariedEmployee extends Employee
{
    //Declarations
    private double yearlySalary;

    //Getters & Setters
    public double getYearlySalary()
    {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary)
    {
        if (yearlySalary < 0)
        {
            throw new IllegalArgumentException("Yearly salary cannot be negative.");
        }
        else
        {
            this.yearlySalary = yearlySalary;
        }
    }

    //Parameterized Constructor
    public SalariedEmployee(double yearlySalary, final String employeeID, String fullName, LocalDate birthDate)
    {
        super(employeeID, fullName, birthDate);
        setYearlySalary(yearlySalary);
    }

    //Method calculatePayDay() - returns pay earned per week
    @Override
    public double calculatePayDay()
    {
        double perWeekEarned = yearlySalary / 52;
        return (double)Math.round(perWeekEarned * 100) / 100;
    }
}
