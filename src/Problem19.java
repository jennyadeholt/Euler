/**
 * 1 Jan 1900 was a Monday.
 * Thirty days has September,
 * April, June and November.
 * All the rest have thirty-one,
 * Saving February alone,
 * Which has twenty-eight, rain or shine.
 * And on leap years, twenty-nine.
 * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 * <p/>
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */

public class Problem19 {

    public static void main(String[] args) {

        int[] oneYear = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] leapYear = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] currentYear;

        int day = 6;
        int sundays = 0;

        for (int year = 1901; year < 2001; year++) {
            currentYear = year % 4 == 0 ? leapYear : oneYear;
            for (int month = 0; month < currentYear.length; month++) {
                int daysInMonth = currentYear[month];
                sundays = (day == 1) ? sundays + 1 : sundays;

                while (day + 7 <= daysInMonth) {
                    day += 7;
                }

                day = 7 - (daysInMonth - day);
            }
        }

        System.out.println("Number of sundays " + sundays);

    }
}
