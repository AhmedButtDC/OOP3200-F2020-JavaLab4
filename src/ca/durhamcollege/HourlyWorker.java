//Group:            15
//Name:             Ahmed Butt, Michai Pryce
//Student ID:       100770449, 100668094
//Last Modified:    December 9, 2020
//Project:          OOP3200-F2020-JavaLab4

package ca.durhamcollege;

import java.time.LocalDate;

public class HourlyWorker extends Employee
{
    //Declarations
    private double hourlyRate, hoursPerWeek;

    //Getters & Setters
    public double getHourlyRate()
    {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate)
    {
        if (hourlyRate < 17)
        {
            throw new IllegalArgumentException("Hourly rate cannot be below $17.00.");
        }
        else
        {
            this.hourlyRate = hourlyRate;
        }
    }

    public double getHoursPerWeek()
    {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(double hoursPerWeek)
    {
        if (hoursPerWeek > 48)
        {
            throw new IllegalArgumentException("Hours per week cannot be above 48 hours.");
        }
        else
        {
            this.hoursPerWeek = hoursPerWeek;
        }
    }

    //Parameterized Constructor
    public HourlyWorker(double hourlyRate, double hoursPerWeek, final String employeeID, String fullName, LocalDate birthDate)
    {
        super(employeeID, fullName, birthDate);
        setHourlyRate(hourlyRate);
        setHoursPerWeek(hoursPerWeek);
    }

    //Method calculatePayDay() - returns pay earned per week
    @Override
    public double calculatePayDay()
    {
        double perWeekEarned = hourlyRate * hoursPerWeek;
        return (double)Math.round(perWeekEarned * 100) / 100;
    }
}
