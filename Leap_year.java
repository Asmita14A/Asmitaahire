import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true; // Divisible by 400 → Leap year
                } else {
                    isLeapYear = false; // Divisible by 100 but not by 400 → Not a leap year
                }
            } else {
                isLeapYear = true; // Divisible by 4 but not by 100 → Leap year
            }
        } else {
            isLeapYear = false; // Not divisible by 4 → Not a leap year
        }

        // Display the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Close the scanner
        scanner.close();
    }
}