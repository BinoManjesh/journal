import java.util.Scanner;

class DatePrinter {

    private static final int[] DAYS = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String[] MONTHS = new String[]{
            "JANUARY", "FEBRUARY", "MARCH",
            "APRIL", "MAY", "JUNE",
            "JULY", "AUGUST", "SEPTEMBER",
            "OCTOBER", "NOVEMBER", "DECEMBER"
    };

    int day, year, n;

    // Returns true if the input is valid
    boolean accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("DAY NUMBER:\t\t\t\t");
        day = sc.nextInt();
        System.out.print("YEAR:\t\t\t\t\t");
        year = sc.nextInt();
        System.out.print("DATE AFTER (N DAYS):\t");
        n = sc.nextInt();

        if (day < 1 || day > 366) {
            System.out.println("DAY NUMBER OUT OF RANGE");
        } else if (year < 1000 || year > 9999) {
            System.out.println("YEAR OUT OF RANGE");
        } else if (n < 1 || n > 100) {
            System.out.println("DATE AFTER (N DAYS) OUT OF RANGE");
        } else {
            return true;
        }
        return false;
    }

    String getPrefix(int n) {
        if (n%10 == 1) {
            return "ST";
        } else if (n % 10 == 2 && n != 12) {
            return "ND";
        } else if (n % 10 == 3 && n != 13) {
            return "RD";
        } else {
            return "TH";
        }
    }

    String getDate(int day, int year) {
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
    boolean isLeapYear(int year) {
        return year%400 == 0 || (year%4 == 0 && year%100 != 0);
    }

    void display() {
        System.out.println("DATE:\t\t\t\t\t" + getDate(day, year));
        int newDay = day + n, newYear = year;
        if (newDay > 366) {
            if (isLeapYear(year))
                newDay -= 366;
            else
                newDay -= 365;
            newYear++;
        }
        System.out.println("DATE AFTER " + n + " DAYS:\t\t" + getDate(newDay, newYear));
    }
    
    public static void main(String[] args) {
        DatePrinter obj = new DatePrinter();
        if (obj.accept()) {
            obj.display();
        }
    }
}
