package ca.durhamcollege;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        //Creating a currency format
        DecimalFormat df = new DecimalFormat("$0.00");

        //Declaring SalariedEmployee object
        SalariedEmployee salariedEmployee = new SalariedEmployee(50000,
                "12345678", "Bames Jond", LocalDate.of(2000,12,9));

        //Printing salariedEmployee's yearly salary
        System.out.println();
        System.out.println("Yearly Salary (Before Alter)\n----------------------------");
        System.out.println(df.format(salariedEmployee.getYearlySalary()));

        //Changing salariedEmployee's yearly salary & reprinting it
        salariedEmployee.setYearlySalary(85000);
        System.out.println();
        System.out.println("Yearly Salary (After Alter)\n---------------------------");
        System.out.println(df.format(salariedEmployee.getYearlySalary()));

        //Declaring HourlyWorker object
        HourlyWorker hourlyWorker = new HourlyWorker(17, 48, "12345677",
                "Isaac Newton", LocalDate.of(1999, 11, 8));

        //Printing hourlyWorker's hourlyRate & hoursPerWeek
        System.out.println();
        System.out.println("Hourly Rate & Hours Per Week (Before Alter)\n-------------------------------------------");
        System.out.println(df.format(hourlyWorker.getHourlyRate()) + " per hour, " + hourlyWorker.getHoursPerWeek() + " hours per week");

        //Changing hourlyWorker's hourlyRate & hoursPerWeek & reprinting it
        hourlyWorker.setHourlyRate(28);
        hourlyWorker.setHoursPerWeek(45);
        System.out.println();
        System.out.println("Hourly Rate & Hours Per Week (After Alter)\n------------------------------------------");
        System.out.println(df.format(hourlyWorker.getHourlyRate()) + " per hour, " + hourlyWorker.getHoursPerWeek() + " hours per week");

        try
        {
            //Creating 2 SalariedEmployee objects & 3 new HourlyWorker objects & storing them in an array
            SalariedEmployee salariedEmployee1 = new SalariedEmployee(50000,
                    "12345676", "Bames Jond", LocalDate.of(2000,12,9));
            SalariedEmployee salariedEmployee2 = new SalariedEmployee(60000,
                            "87654321", "Bond James", LocalDate.of(1995,12,9));

            HourlyWorker hourlyWorker1 = new HourlyWorker(18, 30, "12345671",
                    "Jimmy Neutron", LocalDate.of(1990, 11, 8));
            HourlyWorker hourlyWorker2 = new HourlyWorker(19, 48, "12345672",
                    "Isaac Neutron", LocalDate.of(1991, 11, 8));
            HourlyWorker hourlyWorker3 = new HourlyWorker(21, 43, "12345673",
                    "Mechanical Canine", LocalDate.of(1992, 11, 8));

            Employee employeeArray[] = { salariedEmployee1, salariedEmployee2, hourlyWorker1, hourlyWorker2, hourlyWorker3 };

            //Payroll Report - looping through each object in the array & displaying it
            double totalPay = 0;
            for (int i = 0; i < employeeArray.length; i++)
            {
                //Displaying employeeID, name, & weekly pay
                System.out.println();
                System.out.println("Employee " + (i + 1)+ "\n----------");
                System.out.println("Employee ID:    " + employeeArray[i].getEmployeeID());
                System.out.println("Employee Name:  " + employeeArray[i].getFirstName() + " " + employeeArray[i].getLastName());
                System.out.println("Weekly Pay:     " + df.format(employeeArray[i].calculatePayDay()));

                //Adding to totalPay
                totalPay += employeeArray[i].calculatePayDay();
            }
            //Displaying total amount paid this week
            System.out.println();
            System.out.println("This Week's Total: " + df.format(totalPay));
        }
        catch (Exception e)
        {
            throw e;
        }
    }
}
