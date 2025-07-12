package vvce;

public class Sunday {

    public static void main(String[] args) {
        int year = 2025;
        int month = 3; 
        int firstSunday = 2; 

            int noSunday = firstSunday;
            int count = 0;
            while (noSunday <= getDaysInMonth(year, month)) { 
                count++;
                noSunday += 7; 
            }
            System.out.println("Number of Sundays: "+count);
    }

    public static int getDaysInMonth(int year, int month) {
        int[] daysInMonth = {31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
}
// int ans = (a[month-1]-firstSunday)/7+1)