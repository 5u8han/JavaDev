// The EnhancedDate class
// Do not make changes to anything other than the body of the addDays and daysFrom methods!
// Subhan noeman - 623424 : Data Structures, Section 1
public class EnhancedDate extends Date {
    public EnhancedDate(Date o) {
        super(o.m_month, o.m_day, o.m_year);
    }
    public EnhancedDate(int month, int day, int year) {
        super(month, day, year);
    }

    public void addDays(int numDays) {
        int[] daysInMonths = {
                0,
                31,
                28,
                31,
                30,
                31,
                30,
                31,
                31,
                30,
                31,
                30,
                31
        }; // introducing total number of days in each month
        if ((m_year % 4 == 0 && m_year % 100 != 0) || (m_year % 400 == 0)) // this statement will capture leap year
        {
            daysInMonths[2] = 29; //this command, if true will insert 29 at index 2 in the array above. To account for leap year
        }
        m_day += numDays;

        while (m_day > daysInMonths[m_month]) {
            m_day -= daysInMonths[m_month];
            m_month++;

            if (m_month > 12) // if input of months is greater than 12, increment year by 1 and switch month down to 1.
            {
                m_month = 1;
                m_year++;

                if ((m_year % 4 == 0 && m_year % 100 != 0) || (m_year % 400 == 0)) // leap year
                    daysInMonths[2] = 29;
                else daysInMonths[2] = 28;
            }
        }
    }

    // This method computes and returns the number of days from the given startDate to current
    // date. If startDate is later than current date, then the number of days are represented
    // as a negative number.

    public int daysFrom(Date startDate) {
        //if you see this, I have failed.
        //unable to understand syntax to increment or decrement until the called date.
        EnhancedDate totalDays = new EnhancedDate(startDate); //object oriented variable initialization
        int days = 1; //initialize
        while (compareTo(startDate) == 1) {

            totalDays.addDays(1);
            days++;
            if (this.compareTo(totalDays) == 0) break;
        }
        return days;
    }
}