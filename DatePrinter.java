import java.util.Scanner;

class DatePrinter {

    private static final int[] DAYS = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String[] MONTHS = new String[]{
            "JANUARY",
            "FEBRUARY",
            "MARCH",
            "APRIL",
            "MAY",
            "JUNE",
            "JULY",
        "AUGUST",
        "SEPTEMBER",
        "OCTOBER",
        "NOVEMBER",
        "DECEMBER"
    };
    
    public static void main(String[] args) {
        // Accepts day number, year and n
        Scanner sc = new Scanner(System.in);
        System.out.print("DAY NUMBER:\t");
        int day = sc.nextInt();
        System.out.print("YEAR:\t");
        int year = sc.nextInt();
        System.out.print("DATE AFTER (N DAYS):\t");
        int n = sc.nextInt();

        // Checks for invalid inputs
        if (day < 1 || day > 366)
            System.out.println("DAY NUMBER OUT OF RANGE");
        else if (year < 1000 || year > 9999)
            System.out.println("YEAR OUT OF RANGE");            
        else if (n < 1 || n > 100)
            System.out.println("DATE AFTER (N DAYS) OUT OF RANGE");

        // Prints the result          
        else {
            System.out.println("DATE:\t" + getDate(day, year));

            int newDay = day + n, newYear = year;
            if (newDay > 366) {
                if (isLeapYear(year))
                    newDay -= 366;
                else
                    newDay -= 365;
                newYear++;
            }
            System.out.println("DATE AFTER " + n + " DAYS:\t" + getDate(newDay, newYear));
        }
    }

    private static String getDate(int day, int year) {
        int month;
        for (month = 0; month < 12; ++month) {
            int daysInNextMonth = DAYS[month];
            if (month == 1 && isLeapYear(year))
                daysInNextMonth++;
            
            if (day > daysInNextMonth)
                day -= daysInNextMonth;
            else
                break;
        }
        return day + " " + getPrefix(day) + " " + MONTHS[month] + ", " + year; 
    }

    // A leap year is a year divisible by 400 or a year divisible by 4 but indivisible by 100
    private static boolean isLeapYear(int year) {
        if (year % 400 == 0)
            return true;
        else
            return year % 4 == 0 && year % 100 != 0;
    }

    private static String getPrefix(int n) {
        if (n % 10 == 1)
            return "ST";
        else if (n % 10 == 2 && n != 12) 
            return "ND";
        else if (n % 10 == 3 && n != 13)
            return "RD";
        else
            return "TH";
    }
}
