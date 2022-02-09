// Test driver for the EnhancedDate class
// Do not make any changes to this file!
// Xiwei Wang

import java.util.*;
import java.io.*;

public class TestDate
{
    public static void main(String[] args)
    {
        try
        {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("testDates.dat"));
            ArrayList<Date> dates1 = new ArrayList<Date>();
            ArrayList<Date> dates2 = new ArrayList<Date>();
            ArrayList<Integer> daysFroms = new ArrayList<Integer>();
            ArrayList<Date> oldDates;
            ArrayList<Integer> daysList;
            ArrayList<Date> newDates;
            dates1 = (ArrayList<Date>)in.readObject();
            dates2 = (ArrayList<Date>)in.readObject();
            daysFroms = (ArrayList<Integer>)in.readObject();
            oldDates = (ArrayList<Date>)in.readObject();
            daysList = (ArrayList<Integer>)in.readObject();
            newDates = (ArrayList<Date>)in.readObject();

            EnhancedDate currentDate;
            int numTotalTests = 0, numPassedTests = 0;

            for (int i = 0; i < oldDates.size(); i++)
            {
                numTotalTests++;

                System.out.println("The current date is " + oldDates.get(i) + " and " + daysList.get(i) + " days are added.");
                currentDate = new EnhancedDate(oldDates.get(i));
                currentDate.addDays(daysList.get(i));
                System.out.println("The correct new date is " + newDates.get(i) + " and the one calculated by your program is " + currentDate + ".");

                if (currentDate.toString().equals(newDates.get(i).toString()))
                {
                    System.out.println("Correct!\n");
                    numPassedTests++;
                }
                else
                    System.out.println("Wrong!\n");
            }

            for (int i = 0; i < dates1.size(); i++)
            {
                numTotalTests++;

                System.out.print("(" + dates1.get(i) + ").daysFrom(" + dates2.get(i) + ") is supposed to return " + daysFroms.get(i) + " and your return is ");
                currentDate = new EnhancedDate(dates1.get(i));
                int numDays = currentDate.daysFrom(dates2.get(i));
                System.out.println(numDays);

                if (numDays == daysFroms.get(i))
                {
                    System.out.println("Correct!\n");
                    numPassedTests++;
                }
                else
                    System.out.println("Wrong!\n");
            }

            System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: " + (numTotalTests - numPassedTests));
        }
        catch (Exception e)
        {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}

